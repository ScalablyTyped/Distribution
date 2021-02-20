package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.postCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.awsSdkClientCodecommitNode.postCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBeforeCommitIdAndAfterCommitIdAreSameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BeforeCommitIdAndAfterCommitIdAreSameExceptionDetails> * / any */ @js.native
  trait BeforeCommitIdAndAfterCommitIdAreSameException
    extends PostCommentForComparedCommitExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException = js.native
  }
  object BeforeCommitIdAndAfterCommitIdAreSameException {
    
    @scala.inline
    def apply(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException
    ): BeforeCommitIdAndAfterCommitIdAreSameException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeCommitIdAndAfterCommitIdAreSameException]
    }
    
    @scala.inline
    implicit class BeforeCommitIdAndAfterCommitIdAreSameExceptionMutableBuilder[Self <: BeforeCommitIdAndAfterCommitIdAreSameException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BeforeCommitIdAndAfterCommitIdAreSameExceptionDetails extends StObject
}
