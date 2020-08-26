package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  /**
    * 获取当前页面
    */
  def getCurrentPage(): Page[js.Object, js.Object] = js.native
}

object App {
  @scala.inline
  def apply(getCurrentPage: () => Page[js.Object, js.Object]): App = {
    val __obj = js.Dynamic.literal(getCurrentPage = js.Any.fromFunction0(getCurrentPage))
    __obj.asInstanceOf[App]
  }
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
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
    def setGetCurrentPage(value: () => Page[js.Object, js.Object]): Self = this.set("getCurrentPage", js.Any.fromFunction0(value))
  }
  
}

