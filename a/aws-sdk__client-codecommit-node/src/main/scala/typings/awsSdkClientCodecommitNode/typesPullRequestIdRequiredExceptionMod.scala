package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesDescribePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesGetPullRequestExceptionsUnionMod.GetPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestIdRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PullRequestIdRequiredExceptionDetails> * / any */ trait PullRequestIdRequiredException
    extends StObject
       with DescribePullRequestEventsExceptionsUnion
       with GetCommentsForPullRequestExceptionsUnion
       with GetPullRequestExceptionsUnion
       with MergePullRequestByFastForwardExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion
       with UpdatePullRequestDescriptionExceptionsUnion
       with UpdatePullRequestStatusExceptionsUnion
       with UpdatePullRequestTitleExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestIdRequiredException
  }
  object PullRequestIdRequiredException {
    
    inline def apply(): PullRequestIdRequiredException = {
      val __obj = js.Dynamic.literal(name = "PullRequestIdRequiredException")
      __obj.asInstanceOf[PullRequestIdRequiredException]
    }
    
    extension [Self <: PullRequestIdRequiredException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestIdRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PullRequestIdRequiredExceptionDetails extends StObject
}
