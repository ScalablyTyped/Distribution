package typings.cesium.anon

import typings.cesium.mod.MaterialProperty
import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceDisplayCondition extends StObject {
  
  var distanceDisplayCondition: js.UndefOr[Property] = js.undefined
  
  var leadTime: js.UndefOr[Property | Double] = js.undefined
  
  var material: js.UndefOr[MaterialProperty] = js.undefined
  
  var resolution: js.UndefOr[Property | Double] = js.undefined
  
  var show: js.UndefOr[Property | Boolean] = js.undefined
  
  var trailTime: js.UndefOr[Property | Double] = js.undefined
  
  var width: js.UndefOr[Property | Double] = js.undefined
}
object DistanceDisplayCondition {
  
  inline def apply(): DistanceDisplayCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceDisplayCondition]
  }
  
  extension [Self <: DistanceDisplayCondition](x: Self) {
    
    inline def setDistanceDisplayCondition(value: Property): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    inline def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    inline def setLeadTime(value: Property | Double): Self = StObject.set(x, "leadTime", value.asInstanceOf[js.Any])
    
    inline def setLeadTimeUndefined: Self = StObject.set(x, "leadTime", js.undefined)
    
    inline def setMaterial(value: MaterialProperty): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setResolution(value: Property | Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTrailTime(value: Property | Double): Self = StObject.set(x, "trailTime", value.asInstanceOf[js.Any])
    
    inline def setTrailTimeUndefined: Self = StObject.set(x, "trailTime", js.undefined)
    
    inline def setWidth(value: Property | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
