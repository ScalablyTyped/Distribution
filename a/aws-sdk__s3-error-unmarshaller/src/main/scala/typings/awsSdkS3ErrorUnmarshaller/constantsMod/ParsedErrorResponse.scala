package typings.awsSdkS3ErrorUnmarshaller.constantsMod

import typings.awsSdkS3ErrorUnmarshaller.AnonRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedErrorResponse extends js.Object {
  @JSName("$metadata")
  var $metadata: AnonRequestId
  var Code: String
  var Message: String
}

object ParsedErrorResponse {
  @scala.inline
  def apply($metadata: AnonRequestId, Code: String, Message: String): ParsedErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedErrorResponse]
  }
}

