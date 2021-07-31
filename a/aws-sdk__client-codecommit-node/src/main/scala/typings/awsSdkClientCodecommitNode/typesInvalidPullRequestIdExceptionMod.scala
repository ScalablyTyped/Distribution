package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.getPullRequestExceptionsUnionMod.GetPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidPullRequestIdExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidPullRequestIdExceptionDetails> * / any */ trait InvalidPullRequestIdException
    extends StObject
       with DescribePullRequestEventsExceptionsUnion
       with GetCommentsForPullRequestExceptionsUnion
       with GetPullRequestExceptionsUnion
       with MergePullRequestByFastForwardExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion
       with UpdatePullRequestDescriptionExceptionsUnion
       with UpdatePullRequestStatusExceptionsUnion
       with UpdatePullRequestTitleExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestIdException
  }
  object InvalidPullRequestIdException {
    
    @scala.inline
    def apply(): InvalidPullRequestIdException = {
      val __obj = js.Dynamic.literal(name = "InvalidPullRequestIdException")
      __obj.asInstanceOf[InvalidPullRequestIdException]
    }
    
    @scala.inline
    implicit class InvalidPullRequestIdExceptionMutableBuilder[Self <: InvalidPullRequestIdException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestIdException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidPullRequestIdExceptionDetails extends StObject
}
