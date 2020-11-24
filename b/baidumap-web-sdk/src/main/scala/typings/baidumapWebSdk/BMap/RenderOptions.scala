package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderOptions extends js.Object {
  
  var autoViewport: js.UndefOr[Boolean] = js.native
  
  var highlightMode: js.UndefOr[HighlightModes] = js.native
  
  var map: Map = js.native
  
  var panel: js.UndefOr[String | HTMLElement] = js.native
  
  var selectFirstResult: js.UndefOr[Boolean] = js.native
}
object RenderOptions {
  
  @scala.inline
  def apply(map: Map): RenderOptions = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
  
  @scala.inline
  implicit class RenderOptionsOps[Self <: RenderOptions] (val x: Self) extends AnyVal {
    
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
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoViewport(value: Boolean): Self = this.set("autoViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoViewport: Self = this.set("autoViewport", js.undefined)
    
    @scala.inline
    def setHighlightMode(value: HighlightModes): Self = this.set("highlightMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightMode: Self = this.set("highlightMode", js.undefined)
    
    @scala.inline
    def setPanel(value: String | HTMLElement): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    
    @scala.inline
    def setSelectFirstResult(value: Boolean): Self = this.set("selectFirstResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectFirstResult: Self = this.set("selectFirstResult", js.undefined)
  }
}
