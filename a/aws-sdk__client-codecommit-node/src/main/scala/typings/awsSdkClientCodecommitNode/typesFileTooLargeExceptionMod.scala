package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFileTooLargeExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_FileTooLargeExceptionDetails> * / any */ trait FileTooLargeException
    extends StObject
       with GetBlobExceptionsUnion
       with GetFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileTooLargeException
  }
  object FileTooLargeException {
    
    inline def apply(): FileTooLargeException = {
      val __obj = js.Dynamic.literal(name = "FileTooLargeException")
      __obj.asInstanceOf[FileTooLargeException]
    }
    
    extension [Self <: FileTooLargeException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileTooLargeException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileTooLargeExceptionDetails extends StObject
}
