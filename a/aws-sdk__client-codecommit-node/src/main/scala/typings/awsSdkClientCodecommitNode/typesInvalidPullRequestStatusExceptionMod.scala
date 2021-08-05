package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidPullRequestStatusExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidPullRequestStatusExceptionDetails> * / any */ trait InvalidPullRequestStatusException
    extends StObject
       with ListPullRequestsExceptionsUnion
       with UpdatePullRequestStatusExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestStatusException
  }
  object InvalidPullRequestStatusException {
    
    inline def apply(): InvalidPullRequestStatusException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestStatusException")
      __obj.asInstanceOf[InvalidPullRequestStatusException]
    }
    
    extension [Self <: InvalidPullRequestStatusException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestStatusException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidPullRequestStatusExceptionDetails extends StObject
}
