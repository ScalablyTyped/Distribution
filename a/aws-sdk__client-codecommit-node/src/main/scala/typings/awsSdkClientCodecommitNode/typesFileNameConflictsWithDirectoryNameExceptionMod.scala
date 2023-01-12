package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFileNameConflictsWithDirectoryNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_FileNameConflictsWithDirectoryNameExceptionDetails> * / any */ trait FileNameConflictsWithDirectoryNameException
    extends StObject
       with PutFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException
  }
  object FileNameConflictsWithDirectoryNameException {
    
    inline def apply(): FileNameConflictsWithDirectoryNameException = {
      val __obj = js.Dynamic.literal(name = "FileNameConflictsWithDirectoryNameException")
      __obj.asInstanceOf[FileNameConflictsWithDirectoryNameException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileNameConflictsWithDirectoryNameException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileNameConflictsWithDirectoryNameExceptionDetails extends StObject
}
