package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSystemInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 成功获取系统信息的回调 */
  @JSName("success")
  def success_MGetSystemInfoOptions(res: SystemInfo): Unit = js.native
}

object GetSystemInfoOptions {
  @scala.inline
  def apply(success: SystemInfo => Unit): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
  @scala.inline
  implicit class GetSystemInfoOptionsOps[Self <: GetSystemInfoOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: SystemInfo => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

