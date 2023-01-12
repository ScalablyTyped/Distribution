package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNoSuchUploadMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_NoSuchUploadDetails> * / any */ trait NoSuchUpload extends StObject {
    
    var name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchUpload
  }
  object NoSuchUpload {
    
    inline def apply(): NoSuchUpload = {
      val __obj = js.Dynamic.literal(name = "NoSuchUpload")
      __obj.asInstanceOf[NoSuchUpload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoSuchUpload] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchUpload): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoSuchUploadDetails extends StObject
}
