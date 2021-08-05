package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAuthorDoesNotExistExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_AuthorDoesNotExistExceptionDetails> * / any */ trait AuthorDoesNotExistException
    extends StObject
       with ListPullRequestsExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AuthorDoesNotExistException
  }
  object AuthorDoesNotExistException {
    
    inline def apply(): AuthorDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "AuthorDoesNotExistException")
      __obj.asInstanceOf[AuthorDoesNotExistException]
    }
    
    extension [Self <: AuthorDoesNotExistException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AuthorDoesNotExistException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthorDoesNotExistExceptionDetails extends StObject
}
