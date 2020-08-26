package typings.baiduApp.swan

import typings.baiduApp.anon.Northeast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegionOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetRegionOptions(res: Northeast): Unit = js.native
}

object GetRegionOptions {
  @scala.inline
  def apply(success: Northeast => Unit): GetRegionOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetRegionOptions]
  }
  @scala.inline
  implicit class GetRegionOptionsOps[Self <: GetRegionOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: Northeast => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

