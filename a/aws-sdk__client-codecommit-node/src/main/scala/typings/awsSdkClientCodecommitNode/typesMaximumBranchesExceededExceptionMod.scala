package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMaximumBranchesExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MaximumBranchesExceededExceptionDetails> * / any */ trait MaximumBranchesExceededException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumBranchesExceededException
  }
  object MaximumBranchesExceededException {
    
    @scala.inline
    def apply(): MaximumBranchesExceededException = {
      val __obj = js.Dynamic.literal(name = "MaximumBranchesExceededException")
      __obj.asInstanceOf[MaximumBranchesExceededException]
    }
    
    @scala.inline
    implicit class MaximumBranchesExceededExceptionMutableBuilder[Self <: MaximumBranchesExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumBranchesExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaximumBranchesExceededExceptionDetails extends StObject
}
