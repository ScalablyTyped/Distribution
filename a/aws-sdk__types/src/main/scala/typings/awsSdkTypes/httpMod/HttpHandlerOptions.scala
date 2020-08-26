package typings.awsSdkTypes.httpMod

import typings.awsSdkTypes.abortMod.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpHandlerOptions extends js.Object {
  var abortSignal: js.UndefOr[AbortSignal] = js.native
}

object HttpHandlerOptions {
  @scala.inline
  def apply(): HttpHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpHandlerOptions]
  }
  @scala.inline
  implicit class HttpHandlerOptionsOps[Self <: HttpHandlerOptions] (val x: Self) extends AnyVal {
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
    def setAbortSignal(value: AbortSignal): Self = this.set("abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbortSignal: Self = this.set("abortSignal", js.undefined)
  }
  
}

