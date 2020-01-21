package typings.baiduApp

import typings.baiduApp.swan.PageOptions
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Page")
@js.native
object Page extends js.Object {
  // #endregion
  // #region Page
  /**
    * Page() 函数用来注册一个页面。
    * 接受一个 object 参数，其指定页面的初始数据、生命周期函数、事件处理函数等。
    */
  def apply[T /* <: PageOptions with js.Object */](page: T with (ThisType[T with (typings.baiduApp.swan.Page[js.Object, js.Object])])): Unit = js.native
}

