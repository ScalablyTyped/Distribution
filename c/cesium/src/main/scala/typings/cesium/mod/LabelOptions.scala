package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelOptions extends StObject {
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  var backgroundPadding: js.UndefOr[Cartesian2] = js.native
  
  var distanceDisplayCondition: js.UndefOr[DistanceDisplayCondition] = js.native
  
  var eyeOffset: js.UndefOr[Cartesian3] = js.native
  
  var fillColor: js.UndefOr[Color] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var heightReference: js.UndefOr[HeightReference] = js.native
  
  var horizontalOrigin: js.UndefOr[HorizontalOrigin] = js.native
  
  var outlineColor: js.UndefOr[Color] = js.native
  
  var outlineWidth: js.UndefOr[Double] = js.native
  
  var pixelOffset: js.UndefOr[Cartesian2] = js.native
  
  var pixelOffsetScaleByDistance: js.UndefOr[NearFarScalar] = js.native
  
  var position: js.UndefOr[Cartesian3] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var showBackground: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[LabelStyle] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var translucencyByDistance: js.UndefOr[NearFarScalar] = js.native
  
  var verticalOrigin: js.UndefOr[VerticalOrigin] = js.native
}
object LabelOptions {
  
  @scala.inline
  def apply(): LabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptions]
  }
  
  @scala.inline
  implicit class LabelOptionsMutableBuilder[Self <: LabelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundPadding(value: Cartesian2): Self = StObject.set(x, "backgroundPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundPaddingUndefined: Self = StObject.set(x, "backgroundPadding", js.undefined)
    
    @scala.inline
    def setDistanceDisplayCondition(value: DistanceDisplayCondition): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setEyeOffset(value: Cartesian3): Self = StObject.set(x, "eyeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeOffsetUndefined: Self = StObject.set(x, "eyeOffset", js.undefined)
    
    @scala.inline
    def setFillColor(value: Color): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHeightReference(value: HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    @scala.inline
    def setHorizontalOrigin(value: HorizontalOrigin): Self = StObject.set(x, "horizontalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalOriginUndefined: Self = StObject.set(x, "horizontalOrigin", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineWidth(value: Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    @scala.inline
    def setPixelOffset(value: Cartesian2): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelOffsetScaleByDistance(value: NearFarScalar): Self = StObject.set(x, "pixelOffsetScaleByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelOffsetScaleByDistanceUndefined: Self = StObject.set(x, "pixelOffsetScaleByDistance", js.undefined)
    
    @scala.inline
    def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    
    @scala.inline
    def setPosition(value: Cartesian3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBackground(value: Boolean): Self = StObject.set(x, "showBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBackgroundUndefined: Self = StObject.set(x, "showBackground", js.undefined)
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setStyle(value: LabelStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTranslucencyByDistance(value: NearFarScalar): Self = StObject.set(x, "translucencyByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucencyByDistanceUndefined: Self = StObject.set(x, "translucencyByDistance", js.undefined)
    
    @scala.inline
    def setVerticalOrigin(value: VerticalOrigin): Self = StObject.set(x, "verticalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOriginUndefined: Self = StObject.set(x, "verticalOrigin", js.undefined)
  }
}
