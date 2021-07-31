package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.putRepositoryTriggersExceptionsUnionMod.PutRepositoryTriggersExceptionsUnion
import typings.awsSdkClientCodecommitNode.testRepositoryTriggersExceptionsUnionMod.TestRepositoryTriggersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMaximumRepositoryTriggersExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MaximumRepositoryTriggersExceededExceptionDetails> * / any */ trait MaximumRepositoryTriggersExceededException
    extends StObject
       with PutRepositoryTriggersExceptionsUnion
       with TestRepositoryTriggersExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryTriggersExceededException
  }
  object MaximumRepositoryTriggersExceededException {
    
    @scala.inline
    def apply(): MaximumRepositoryTriggersExceededException = {
      val __obj = js.Dynamic.literal(name = "MaximumRepositoryTriggersExceededException")
      __obj.asInstanceOf[MaximumRepositoryTriggersExceededException]
    }
    
    @scala.inline
    implicit class MaximumRepositoryTriggersExceededExceptionMutableBuilder[Self <: MaximumRepositoryTriggersExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumRepositoryTriggersExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaximumRepositoryTriggersExceededExceptionDetails extends StObject
}
