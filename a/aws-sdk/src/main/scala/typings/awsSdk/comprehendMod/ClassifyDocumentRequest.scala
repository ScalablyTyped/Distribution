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
  var Text: String = js.native
}

object ClassifyDocumentRequest {
  @scala.inline
  def apply(EndpointArn: DocumentClassifierEndpointArn, Text: String): ClassifyDocumentRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifyDocumentRequest]
  }
}

