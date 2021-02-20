package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  /**
    * A blob of base64-encoded document bytes. The maximum size of a document that's provided in a blob of bytes is 5 MB. The document bytes must be in PNG or JPEG format. If you're using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes passed using the Bytes field. 
    */
  var Bytes: js.UndefOr[ImageBlob] = js.native
  
  /**
    * Identifies an S3 object as the document source. The maximum size of a document that's stored in an S3 bucket is 5 MB.
    */
  var S3Object: js.UndefOr[typings.awsSdk.textractMod.S3Object] = js.native
}
object Document {
  
  @scala.inline
  def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: ImageBlob): Self = StObject.set(x, "Bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUndefined: Self = StObject.set(x, "Bytes", js.undefined)
    
    @scala.inline
    def setS3Object(value: S3Object): Self = StObject.set(x, "S3Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ObjectUndefined: Self = StObject.set(x, "S3Object", js.undefined)
  }
}
