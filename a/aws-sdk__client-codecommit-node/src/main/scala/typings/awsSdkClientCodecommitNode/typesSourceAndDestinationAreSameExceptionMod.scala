package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSourceAndDestinationAreSameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_SourceAndDestinationAreSameExceptionDetails> * / any */ trait SourceAndDestinationAreSameException
    extends StObject
       with CreatePullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SourceAndDestinationAreSameException
  }
  object SourceAndDestinationAreSameException {
    
    inline def apply(): SourceAndDestinationAreSameException = {
      val __obj = js.Dynamic.literal(name = "SourceAndDestinationAreSameException")
      __obj.asInstanceOf[SourceAndDestinationAreSameException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceAndDestinationAreSameException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.SourceAndDestinationAreSameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceAndDestinationAreSameExceptionDetails extends StObject
}
