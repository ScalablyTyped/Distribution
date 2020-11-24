package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapPanes extends js.Object {
  
  var floatPane: js.UndefOr[HTMLElement] = js.native
  
  var floatShadow: js.UndefOr[HTMLElement] = js.native
  
  var labelPane: js.UndefOr[HTMLElement] = js.native
  
  var mapPane: js.UndefOr[HTMLElement] = js.native
  
  var markerMouseTarget: js.UndefOr[HTMLElement] = js.native
  
  var markerPane: js.UndefOr[HTMLElement] = js.native
  
  var markerShadow: js.UndefOr[HTMLElement] = js.native
}
object MapPanes {
  
  @scala.inline
  def apply(): MapPanes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapPanes]
  }
  
  @scala.inline
  implicit class MapPanesOps[Self <: MapPanes] (val x: Self) extends AnyVal {
    
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
    def setFloatPane(value: HTMLElement): Self = this.set("floatPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatPane: Self = this.set("floatPane", js.undefined)
    
    @scala.inline
    def setFloatShadow(value: HTMLElement): Self = this.set("floatShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatShadow: Self = this.set("floatShadow", js.undefined)
    
    @scala.inline
    def setLabelPane(value: HTMLElement): Self = this.set("labelPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPane: Self = this.set("labelPane", js.undefined)
    
    @scala.inline
    def setMapPane(value: HTMLElement): Self = this.set("mapPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapPane: Self = this.set("mapPane", js.undefined)
    
    @scala.inline
    def setMarkerMouseTarget(value: HTMLElement): Self = this.set("markerMouseTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerMouseTarget: Self = this.set("markerMouseTarget", js.undefined)
    
    @scala.inline
    def setMarkerPane(value: HTMLElement): Self = this.set("markerPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerPane: Self = this.set("markerPane", js.undefined)
    
    @scala.inline
    def setMarkerShadow(value: HTMLElement): Self = this.set("markerShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerShadow: Self = this.set("markerShadow", js.undefined)
  }
}
