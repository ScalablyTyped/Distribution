package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidPullRequestStatusUpdateExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidPullRequestStatusUpdateExceptionDetails> * / any */ trait InvalidPullRequestStatusUpdateException
    extends StObject
       with UpdatePullRequestStatusExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestStatusUpdateException
  }
  object InvalidPullRequestStatusUpdateException {
    
    inline def apply(): InvalidPullRequestStatusUpdateException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestStatusUpdateException")
      __obj.asInstanceOf[InvalidPullRequestStatusUpdateException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidPullRequestStatusUpdateException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestStatusUpdateException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidPullRequestStatusUpdateExceptionDetails extends StObject
}
