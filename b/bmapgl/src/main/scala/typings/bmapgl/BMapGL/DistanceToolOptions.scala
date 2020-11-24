package typings.bmapgl.BMapGL

import typings.bmapgl.bmapglStrings.dashed
import typings.bmapgl.bmapglStrings.dotted
import typings.bmapgl.bmapglStrings.metric
import typings.bmapgl.bmapglStrings.solid
import typings.bmapgl.bmapglStrings.us
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceToolOptions extends js.Object {
  
  var closeIcon: js.UndefOr[Icon] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var followText: js.UndefOr[String] = js.native
  
  var lineColor: js.UndefOr[String] = js.native
  
  var lineStroke: js.UndefOr[Double] = js.native
  
  var lineStyle: js.UndefOr[solid | dashed | dotted] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var secIcon: js.UndefOr[Icon] = js.native
  
  var tips: js.UndefOr[String] = js.native
  
  var unit: js.UndefOr[metric | us] = js.native
}
object DistanceToolOptions {
  
  @scala.inline
  def apply(): DistanceToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceToolOptions]
  }
  
  @scala.inline
  implicit class DistanceToolOptionsOps[Self <: DistanceToolOptions] (val x: Self) extends AnyVal {
    
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
    def setCloseIcon(value: Icon): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setFollowText(value: String): Self = this.set("followText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowText: Self = this.set("followText", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineStroke(value: Double): Self = this.set("lineStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStroke: Self = this.set("lineStroke", js.undefined)
    
    @scala.inline
    def setLineStyle(value: solid | dashed | dotted): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSecIcon(value: Icon): Self = this.set("secIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecIcon: Self = this.set("secIcon", js.undefined)
    
    @scala.inline
    def setTips(value: String): Self = this.set("tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTips: Self = this.set("tips", js.undefined)
    
    @scala.inline
    def setUnit(value: metric | us): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
