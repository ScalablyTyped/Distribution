package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends js.Object {
  
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
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBytes(value: ImageBlob): Self = this.set("Bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytes: Self = this.set("Bytes", js.undefined)
    
    @scala.inline
    def setS3Object(value: S3Object): Self = this.set("S3Object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Object: Self = this.set("S3Object", js.undefined)
  }
}
