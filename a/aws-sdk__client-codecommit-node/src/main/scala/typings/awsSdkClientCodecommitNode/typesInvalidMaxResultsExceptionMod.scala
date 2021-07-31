package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.describePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForComparedCommitExceptionsUnionMod.GetCommentsForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.getCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidMaxResultsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidMaxResultsExceptionDetails> * / any */ trait InvalidMaxResultsException
    extends StObject
       with DescribePullRequestEventsExceptionsUnion
       with GetCommentsForComparedCommitExceptionsUnion
       with GetCommentsForPullRequestExceptionsUnion
       with GetDifferencesExceptionsUnion
       with ListPullRequestsExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidMaxResultsException
  }
  object InvalidMaxResultsException {
    
    @scala.inline
    def apply(): InvalidMaxResultsException = {
      val __obj = js.Dynamic.literal(name = "InvalidMaxResultsException")
      __obj.asInstanceOf[InvalidMaxResultsException]
    }
    
    @scala.inline
    implicit class InvalidMaxResultsExceptionMutableBuilder[Self <: InvalidMaxResultsException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidMaxResultsException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidMaxResultsExceptionDetails extends StObject
}
