package typings.awsSdkQueryErrorUnmarshaller.constantsMod

import typings.awsSdkQueryErrorUnmarshaller.anon.Code
import typings.awsSdkQueryErrorUnmarshaller.anon.RequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedErrorResponse extends js.Object {
  @JSName("$metadata")
  var $metadata: RequestId = js.native
  var Error: js.UndefOr[Code] = js.native
}

object ParsedErrorResponse {
  @scala.inline
  def apply($metadata: RequestId): ParsedErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
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
    def setError(value: Code): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
  }
  
}

