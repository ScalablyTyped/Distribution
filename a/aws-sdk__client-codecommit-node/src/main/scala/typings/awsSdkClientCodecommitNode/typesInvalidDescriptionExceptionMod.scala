package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidDescriptionExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidDescriptionExceptionDetails> * / any */ trait InvalidDescriptionException
    extends StObject
       with CreatePullRequestExceptionsUnion
       with UpdatePullRequestDescriptionExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDescriptionException
  }
  object InvalidDescriptionException {
    
    inline def apply(): InvalidDescriptionException = {
      val __obj = js.Dynamic.literal(name = "InvalidDescriptionException")
      __obj.asInstanceOf[InvalidDescriptionException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidDescriptionException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDescriptionException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidDescriptionExceptionDetails extends StObject
}
