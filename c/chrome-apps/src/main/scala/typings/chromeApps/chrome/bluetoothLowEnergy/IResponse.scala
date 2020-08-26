package typings.chromeApps.chrome.bluetoothLowEnergy

import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResponse extends js.Object {
  /** If this is an error response, this should be true. */
  var isError: Boolean = js.native
  /** Id of the request this is a response to. */
  var requestId: integer = js.native
  /** Response value. Write requests and error responses will ignore this parameter. */
  var value: js.UndefOr[ArrayBuffer] = js.native
}

object IResponse {
  @scala.inline
  def apply(isError: Boolean, requestId: integer): IResponse = {
    val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponse]
  }
  @scala.inline
  implicit class IResponseOps[Self <: IResponse] (val x: Self) extends AnyVal {
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
    def setIsError(value: Boolean): Self = this.set("isError", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: integer): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ArrayBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

