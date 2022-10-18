package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesGetFolderExceptionsUnionMod.GetFolderExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFolderDoesNotExistExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_FolderDoesNotExistExceptionDetails> * / any */ trait FolderDoesNotExistException
    extends StObject
       with GetFolderExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FolderDoesNotExistException
  }
  object FolderDoesNotExistException {
    
    inline def apply(): FolderDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "FolderDoesNotExistException")
      __obj.asInstanceOf[FolderDoesNotExistException]
    }
    
    extension [Self <: FolderDoesNotExistException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FolderDoesNotExistException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FolderDoesNotExistExceptionDetails extends StObject
}
