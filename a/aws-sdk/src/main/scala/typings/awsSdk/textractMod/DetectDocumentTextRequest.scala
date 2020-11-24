package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectDocumentTextRequest extends js.Object {
  
  /**
    * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract operations, you can't pass image bytes. The document must be an image in JPEG or PNG format. If you're using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes that are passed using the Bytes field. 
    */
  var Document: typings.awsSdk.textractMod.Document = js.native
}
object DetectDocumentTextRequest {
  
  @scala.inline
  def apply(Document: Document): DetectDocumentTextRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectDocumentTextRequest]
  }
  
  @scala.inline
  implicit class DetectDocumentTextRequestOps[Self <: DetectDocumentTextRequest] (val x: Self) extends AnyVal {
    
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
    def setDocument(value: Document): Self = this.set("Document", value.asInstanceOf[js.Any])
  }
}
