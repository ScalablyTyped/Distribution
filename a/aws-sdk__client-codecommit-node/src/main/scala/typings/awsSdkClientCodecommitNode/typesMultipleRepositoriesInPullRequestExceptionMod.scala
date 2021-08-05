package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMultipleRepositoriesInPullRequestExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MultipleRepositoriesInPullRequestExceptionDetails> * / any */ trait MultipleRepositoriesInPullRequestException
    extends StObject
       with CreatePullRequestExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MultipleRepositoriesInPullRequestException
  }
  object MultipleRepositoriesInPullRequestException {
    
    inline def apply(): MultipleRepositoriesInPullRequestException = {
      val __obj = js.Dynamic.literal(name = "MultipleRepositoriesInPullRequestException")
      __obj.asInstanceOf[MultipleRepositoriesInPullRequestException]
    }
    
    extension [Self <: MultipleRepositoriesInPullRequestException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MultipleRepositoriesInPullRequestException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultipleRepositoriesInPullRequestExceptionDetails extends StObject
}
