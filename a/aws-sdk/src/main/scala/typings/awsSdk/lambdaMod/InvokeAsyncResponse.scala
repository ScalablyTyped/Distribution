package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeAsyncResponse extends js.Object {
  /**
    * The status code.
    */
  var Status: js.UndefOr[HttpStatus] = js.native
}

object InvokeAsyncResponse {
  @scala.inline
  def apply(): InvokeAsyncResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeAsyncResponse]
  }
  @scala.inline
  implicit class InvokeAsyncResponseOps[Self <: InvokeAsyncResponse] (val x: Self) extends AnyVal {
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
    def setStatus(value: HttpStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

