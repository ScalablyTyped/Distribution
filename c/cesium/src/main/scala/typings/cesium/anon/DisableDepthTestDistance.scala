package typings.cesium.anon

import typings.cesium.mod.HeightReference
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableDepthTestDistance extends StObject {
  
  var color: js.UndefOr[typings.cesium.mod.Color] = js.native
  
  var disableDepthTestDistance: js.UndefOr[Property] = js.native
  
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  var heightReference: js.UndefOr[HeightReference] = js.native
  
  var outlineColor: js.UndefOr[typings.cesium.mod.Color] = js.native
  
  var outlineWidth: js.UndefOr[Double] = js.native
  
  var pixelSize: js.UndefOr[Double] = js.native
  
  var scaleByDistance: js.UndefOr[Property] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var translucencyByDistance: js.UndefOr[Property] = js.native
}
object DisableDepthTestDistance {
  
  @scala.inline
  def apply(): DisableDepthTestDistance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableDepthTestDistance]
  }
  
  @scala.inline
  implicit class DisableDepthTestDistanceMutableBuilder[Self <: DisableDepthTestDistance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisableDepthTestDistance(value: Property): Self = StObject.set(x, "disableDepthTestDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDepthTestDistanceUndefined: Self = StObject.set(x, "disableDepthTestDistance", js.undefined)
    
    @scala.inline
    def setDistanceDisplayCondition(value: Property): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setHeightReference(value: HeightReference): Self = StObject.set(x, "heightReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightReferenceUndefined: Self = StObject.set(x, "heightReference", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineWidth(value: Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    @scala.inline
    def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
    
    @scala.inline
    def setScaleByDistance(value: Property): Self = StObject.set(x, "scaleByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleByDistanceUndefined: Self = StObject.set(x, "scaleByDistance", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTranslucencyByDistance(value: Property): Self = StObject.set(x, "translucencyByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucencyByDistanceUndefined: Self = StObject.set(x, "translucencyByDistance", js.undefined)
  }
}
