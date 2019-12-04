package typings.atAwsDashSdkS3DashErrorDashUnmarshaller.buildConstantsMod

import typings.atAwsDashSdkS3DashErrorDashUnmarshaller.Anon_RequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedErrorResponse extends js.Object {
  @JSName("$metadata")
  var $metadata: Anon_RequestId
  var Code: String
  var Message: String
}

object ParsedErrorResponse {
  @scala.inline
  def apply($metadata: Anon_RequestId, Code: String, Message: String): ParsedErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedErrorResponse]
  }
}

