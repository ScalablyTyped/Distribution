package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidTargetExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidTargetExceptionDetails> * / any */ trait InvalidTargetException
    extends StObject
       with CreatePullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTargetException
  }
  object InvalidTargetException {
    
    inline def apply(): InvalidTargetException = {
      val __obj = js.Dynamic.literal(name = "InvalidTargetException")
      __obj.asInstanceOf[InvalidTargetException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidTargetException] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTargetException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidTargetExceptionDetails extends StObject
}
