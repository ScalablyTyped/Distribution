package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFileContentRequiredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_FileContentRequiredExceptionDetails> * / any */ trait FileContentRequiredException
    extends StObject
       with PutFileExceptionsUnion {
    
    var name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentRequiredException
  }
  object FileContentRequiredException {
    
    inline def apply(): FileContentRequiredException = {
      val __obj = js.Dynamic.literal(name = "FileContentRequiredException")
      __obj.asInstanceOf[FileContentRequiredException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileContentRequiredException] (val x: Self) extends AnyVal {
      
      inline def setName(
        value: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileContentRequiredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileContentRequiredExceptionDetails extends StObject
}
