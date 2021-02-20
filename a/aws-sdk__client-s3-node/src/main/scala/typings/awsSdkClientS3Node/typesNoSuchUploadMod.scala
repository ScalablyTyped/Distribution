package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNoSuchUploadMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_NoSuchUploadDetails> * / any */ @js.native
  trait NoSuchUpload extends StObject {
    
    var name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchUpload = js.native
  }
  object NoSuchUpload {
    
    @scala.inline
    def apply(name: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchUpload): NoSuchUpload = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoSuchUpload]
    }
    
    @scala.inline
    implicit class NoSuchUploadMutableBuilder[Self <: NoSuchUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchUpload): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NoSuchUploadDetails extends StObject
}
