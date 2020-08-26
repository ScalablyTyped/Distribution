package typings.baiduApp.swan

import typings.baiduApp.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetKeepScreenOnOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 是否保持屏幕常亮 */
  var keepScreenOn: Boolean = js.native
  @JSName("success")
  var success_SetKeepScreenOnOptions: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.native
}

object SetKeepScreenOnOptions {
  @scala.inline
  def apply(keepScreenOn: Boolean): SetKeepScreenOnOptions = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeepScreenOnOptions]
  }
  @scala.inline
  implicit class SetKeepScreenOnOptionsOps[Self <: SetKeepScreenOnOptions] (val x: Self) extends AnyVal {
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
    def setKeepScreenOn(value: Boolean): Self = this.set("keepScreenOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: /* res */ ErrMsg => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

