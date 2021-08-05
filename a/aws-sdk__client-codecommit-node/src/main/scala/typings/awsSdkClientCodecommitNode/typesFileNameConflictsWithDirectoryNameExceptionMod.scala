package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
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
    
    extension [Self <: FileNameConflictsWithDirectoryNameException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileNameConflictsWithDirectoryNameExceptionDetails extends StObject
}
