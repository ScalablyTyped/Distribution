package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavedFileListOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetSavedFileListOptions: js.UndefOr[js.Function1[/* res */ GetSavedFileListData, Unit]] = js.native
}

object GetSavedFileListOptions {
  @scala.inline
  def apply(): GetSavedFileListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavedFileListOptions]
  }
  @scala.inline
  implicit class GetSavedFileListOptionsOps[Self <: GetSavedFileListOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: /* res */ GetSavedFileListData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

