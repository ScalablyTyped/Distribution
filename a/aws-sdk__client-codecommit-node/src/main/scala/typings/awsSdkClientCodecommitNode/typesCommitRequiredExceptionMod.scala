package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.getDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.awsSdkClientCodecommitNode.getMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommitRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_CommitRequiredExceptionDetails> * / any */ trait CommitRequiredException
    extends StObject
       with GetDifferencesExceptionsUnion
       with GetMergeConflictsExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitRequiredException
  }
  object CommitRequiredException {
    
    @scala.inline
    def apply(): CommitRequiredException = {
      val __obj = js.Dynamic.literal(name = "CommitRequiredException")
      __obj.asInstanceOf[CommitRequiredException]
    }
    
    @scala.inline
    implicit class CommitRequiredExceptionMutableBuilder[Self <: CommitRequiredException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommitRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommitRequiredExceptionDetails extends StObject
}
