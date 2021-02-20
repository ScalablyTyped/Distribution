package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RepositoryLimitExceededExceptionDetails> * / any */ @js.native
  trait RepositoryLimitExceededException extends CreateRepositoryExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryLimitExceededException = js.native
  }
  object RepositoryLimitExceededException {
    
    @scala.inline
    def apply(
      name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryLimitExceededException
    ): RepositoryLimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryLimitExceededException]
    }
    
    @scala.inline
    implicit class RepositoryLimitExceededExceptionMutableBuilder[Self <: RepositoryLimitExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryLimitExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RepositoryLimitExceededExceptionDetails extends StObject
}
