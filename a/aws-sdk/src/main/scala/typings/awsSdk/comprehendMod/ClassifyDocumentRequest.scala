package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifyDocumentRequest extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the endpoint.
    */
  var EndpointArn: DocumentClassifierEndpointArn = js.native
  /**
    * The document text to be analyzed.
    */
  var Text: CustomerInputString = js.native
}

object ClassifyDocumentRequest {
  @scala.inline
  def apply(EndpointArn: DocumentClassifierEndpointArn, Text: CustomerInputString): ClassifyDocumentRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyDocumentRequest]
  }
  @scala.inline
  implicit class ClassifyDocumentRequestOps[Self <: ClassifyDocumentRequest] (val x: Self) extends AnyVal {
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
    def setEndpointArn(value: DocumentClassifierEndpointArn): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: CustomerInputString): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

