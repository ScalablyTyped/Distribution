package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestStatusRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PullRequestStatusRequiredExceptionDetails> * / any */ trait PullRequestStatusRequiredException
    extends StObject
       with UpdatePullRequestStatusExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestStatusRequiredException
  }
  object PullRequestStatusRequiredException {
    
    inline def apply(): PullRequestStatusRequiredException = {
      val __obj = js.Dynamic.literal(name = "PullRequestStatusRequiredException")
      __obj.asInstanceOf[PullRequestStatusRequiredException]
    }
    
    extension [Self <: PullRequestStatusRequiredException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestStatusRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PullRequestStatusRequiredExceptionDetails extends StObject
}
