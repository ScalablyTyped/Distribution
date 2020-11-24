package typings.baiduApp.swan

import typings.baiduApp.baiduAppStrings.button
import typings.baiduApp.baiduAppStrings.menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region Page
@js.native
trait PageShareAppMessageOptions extends js.Object {
  
  /** 转发事件来源。button：页面内转发按钮；menu：右上角转发菜单 */
  var from: button | menu = js.native
  
  /** 如果 from 值是 button，则 target 是触发这次转发事件的 button，否则为 undefined */
  var target: js.UndefOr[js.Object] = js.native
}
object PageShareAppMessageOptions {
  
  @scala.inline
  def apply(from: button | menu): PageShareAppMessageOptions = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageShareAppMessageOptions]
  }
  
  @scala.inline
  implicit class PageShareAppMessageOptionsOps[Self <: PageShareAppMessageOptions] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: button | menu): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Object): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
