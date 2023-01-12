package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFileContentSizeLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_FileContentSizeLimitExceededExceptionDetails> * / any */ trait FileContentSizeLimitExceededException
    extends StObject
       with PutFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentSizeLimitExceededException
  }
  object FileContentSizeLimitExceededException {
    
    inline def apply(): FileContentSizeLimitExceededException = {
      val __obj = js.Dynamic.literal(name = "FileContentSizeLimitExceededException")
      __obj.asInstanceOf[FileContentSizeLimitExceededException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileContentSizeLimitExceededException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentSizeLimitExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileContentSizeLimitExceededExceptionDetails extends StObject
}
