package typings.awsSdkS3ErrorUnmarshaller.constantsMod

import typings.awsSdkS3ErrorUnmarshaller.anon.RequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedErrorResponse extends js.Object {
  @JSName("$metadata")
  var $metadata: RequestId = js.native
  var Code: String = js.native
  var Message: String = js.native
}

object ParsedErrorResponse {
  @scala.inline
  def apply($metadata: RequestId, Code: String, Message: String): ParsedErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedErrorResponse]
  }
  @scala.inline
  implicit class ParsedErrorResponseOps[Self <: ParsedErrorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: RequestId): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
  }
  
}

