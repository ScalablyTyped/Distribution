package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RepositoryLimitExceededExceptionDetails> * / any */ trait RepositoryLimitExceededException
    extends StObject
       with CreateRepositoryExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryLimitExceededException
  }
  object RepositoryLimitExceededException {
    
    inline def apply(): RepositoryLimitExceededException = {
      val __obj = js.Dynamic.literal(name = "RepositoryLimitExceededException")
      __obj.asInstanceOf[RepositoryLimitExceededException]
    }
    
    extension [Self <: RepositoryLimitExceededException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryLimitExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryLimitExceededExceptionDetails extends StObject
}
