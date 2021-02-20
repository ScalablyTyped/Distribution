package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.LabelStyle
import typings.cesium.mod.Property
import typings.cesium.mod.VerticalOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColor extends StObject {
  
  var backgroundColor: js.UndefOr[Property] = js.native
  
  var backgroundPadding: js.UndefOr[Property] = js.native
  
  var disableDepthTestDistance: js.UndefOr[Property | Double] = js.native
  
  var distanceDisplayCondition: js.UndefOr[typings.cesium.mod.DistanceDisplayCondition | Property] = js.native
  
  var eyeOffset: js.UndefOr[Property] = js.native
  
  var fillColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var heightReference: js.UndefOr[Property] = js.native
  
  var horizontalOrigin: js.UndefOr[Property] = js.native
  
  var outlineColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  
  var outlineWidth: js.UndefOr[Double] = js.native
  
  var pixelOffset: js.UndefOr[Cartesian2 | Property] = js.native
  
  var pixelOffsetScaleByDistance: js.UndefOr[Property] = js.native
  
  var scale: js.UndefOr[Property] = js.native
  
  var scaleByDistance: js.UndefOr[Property] = js.native
  
  var show: js.UndefOr[Property] = js.native
  
  var showBackground: js.UndefOr[Property] = js.native
  
  var style: js.UndefOr[LabelStyle | Property] = js.native
  
  var text: js.UndefOr[Property | String] = js.native
  
  var translucencyByDistance: js.UndefOr[Property] = js.native
  
  var verticalOrigin: js.UndefOr[VerticalOrigin | Property] = js.native
}
object BackgroundColor {
  
  @scala.inline
  def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  
  @scala.inline
  implicit class BackgroundColorMutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Property): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundPadding(value: Property): Self = StObject.set(x, "backgroundPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundPaddingUndefined: Self = StObject.set(x, "backgroundPadding", js.undefined)
    
    @scala.inline
    def setDisableDepthTestDistance(value: Property | Double): Self = StObject.set(x, "disableDepthTestDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDepthTestDistanceUndefined: Self = StObject.set(x, "disableDepthTestDistance", js.undefined)
    
    @scala.inline
    def setDistanceDisplayCondition(value: typings.cesium.mod.DistanceDisplayCondition | Property): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setEyeOffset(value: Property): Self = StObject.set(x, "eyeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeOffsetUndefined: Self = StObject.set(x, "eyeOffset", js.undefined)
    
    @scala.inline
    def setFillColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHeightReference(value: Property): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    @scala.inline
    def setHorizontalOrigin(value: Property): Self = StObject.set(x, "horizontalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalOriginUndefined: Self = StObject.set(x, "horizontalOrigin", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineWidth(value: Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    @scala.inline
    def setPixelOffset(value: Cartesian2 | Property): Self = StObject.set(x, "pixelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelOffsetScaleByDistance(value: Property): Self = StObject.set(x, "pixelOffsetScaleByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelOffsetScaleByDistanceUndefined: Self = StObject.set(x, "pixelOffsetScaleByDistance", js.undefined)
    
    @scala.inline
    def setPixelOffsetUndefined: Self = StObject.set(x, "pixelOffset", js.undefined)
    
    @scala.inline
    def setScale(value: Property): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleByDistance(value: Property): Self = StObject.set(x, "scaleByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleByDistanceUndefined: Self = StObject.set(x, "scaleByDistance", js.undefined)
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setShow(value: Property): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBackground(value: Property): Self = StObject.set(x, "showBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBackgroundUndefined: Self = StObject.set(x, "showBackground", js.undefined)
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setStyle(value: LabelStyle | Property): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: Property | String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTranslucencyByDistance(value: Property): Self = StObject.set(x, "translucencyByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucencyByDistanceUndefined: Self = StObject.set(x, "translucencyByDistance", js.undefined)
    
    @scala.inline
    def setVerticalOrigin(value: VerticalOrigin | Property): Self = StObject.set(x, "verticalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOriginUndefined: Self = StObject.set(x, "verticalOrigin", js.undefined)
  }
}
