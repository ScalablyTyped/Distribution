package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDirectoryNameConflictsWithFileNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_DirectoryNameConflictsWithFileNameExceptionDetails> * / any */ trait DirectoryNameConflictsWithFileNameException
    extends StObject
       with PutFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException
  }
  object DirectoryNameConflictsWithFileNameException {
    
    inline def apply(): DirectoryNameConflictsWithFileNameException = {
      val __obj = js.Dynamic.literal(name = "DirectoryNameConflictsWithFileNameException")
      __obj.asInstanceOf[DirectoryNameConflictsWithFileNameException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryNameConflictsWithFileNameException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectoryNameConflictsWithFileNameExceptionDetails extends StObject
}
