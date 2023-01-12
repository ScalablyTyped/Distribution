package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesDeleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.typesGetFileExceptionsUnionMod.GetFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFileDoesNotExistExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_FileDoesNotExistExceptionDetails> * / any */ trait FileDoesNotExistException
    extends StObject
       with DeleteFileExceptionsUnion
       with GetFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileDoesNotExistException
  }
  object FileDoesNotExistException {
    
    inline def apply(): FileDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "FileDoesNotExistException")
      __obj.asInstanceOf[FileDoesNotExistException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileDoesNotExistException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileDoesNotExistException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileDoesNotExistExceptionDetails extends StObject
}
