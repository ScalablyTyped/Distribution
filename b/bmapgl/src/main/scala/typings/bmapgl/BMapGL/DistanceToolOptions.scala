package typings.bmapgl.BMapGL

import typings.bmapgl.bmapglStrings.dashed
import typings.bmapgl.bmapglStrings.dotted
import typings.bmapgl.bmapglStrings.metric
import typings.bmapgl.bmapglStrings.solid
import typings.bmapgl.bmapglStrings.us
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceToolOptions extends StObject {
  
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
  implicit class DistanceToolOptionsMutableBuilder[Self <: DistanceToolOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseIcon(value: Icon): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setFollowText(value: String): Self = StObject.set(x, "followText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowTextUndefined: Self = StObject.set(x, "followText", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineStroke(value: Double): Self = StObject.set(x, "lineStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStrokeUndefined: Self = StObject.set(x, "lineStroke", js.undefined)
    
    @scala.inline
    def setLineStyle(value: solid | dashed | dotted): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSecIcon(value: Icon): Self = StObject.set(x, "secIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecIconUndefined: Self = StObject.set(x, "secIcon", js.undefined)
    
    @scala.inline
    def setTips(value: String): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipsUndefined: Self = StObject.set(x, "tips", js.undefined)
    
    @scala.inline
    def setUnit(value: metric | us): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
