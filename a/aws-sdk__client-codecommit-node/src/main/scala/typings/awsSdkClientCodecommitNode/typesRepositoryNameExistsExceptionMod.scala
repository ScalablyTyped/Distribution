package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.createRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typings.awsSdkClientCodecommitNode.updateRepositoryNameExceptionsUnionMod.UpdateRepositoryNameExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRepositoryNameExistsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RepositoryNameExistsExceptionDetails> * / any */ trait RepositoryNameExistsException
    extends StObject
       with CreateRepositoryExceptionsUnion
       with UpdateRepositoryNameExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameExistsException
  }
  object RepositoryNameExistsException {
    
    inline def apply(): RepositoryNameExistsException = {
      val __obj = js.Dynamic.literal(name = "RepositoryNameExistsException")
      __obj.asInstanceOf[RepositoryNameExistsException]
    }
    
    extension [Self <: RepositoryNameExistsException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.RepositoryNameExistsException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryNameExistsExceptionDetails extends StObject
}
