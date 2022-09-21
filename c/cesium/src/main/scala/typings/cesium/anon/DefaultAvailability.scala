package typings.cesium.anon

import typings.cesium.mod.EntityCollection
import typings.cesium.mod.JulianDate
import typings.cesium.mod.ModelGraphics
import typings.cesium.mod.TimeInterval
import typings.cesium.mod.exportKmlModelCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultAvailability extends StObject {
  
  var defaultAvailability: js.UndefOr[TimeInterval] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var entities: EntityCollection
  
  var kmz: js.UndefOr[Boolean] = js.undefined
  
  var modelCallback: js.UndefOr[exportKmlModelCallback] = js.undefined
  
  var sampleDuration: js.UndefOr[Double] = js.undefined
  
  var time: js.UndefOr[JulianDate] = js.undefined
}
object DefaultAvailability {
  
  inline def apply(entities: EntityCollection): DefaultAvailability = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAvailability]
  }
  
  extension [Self <: DefaultAvailability](x: Self) {
    
    inline def setDefaultAvailability(value: TimeInterval): Self = StObject.set(x, "defaultAvailability", value.asInstanceOf[js.Any])
    
    inline def setDefaultAvailabilityUndefined: Self = StObject.set(x, "defaultAvailability", js.undefined)
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setEntities(value: EntityCollection): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setKmz(value: Boolean): Self = StObject.set(x, "kmz", value.asInstanceOf[js.Any])
    
    inline def setKmzUndefined: Self = StObject.set(x, "kmz", js.undefined)
    
    inline def setModelCallback(value: (/* model */ ModelGraphics, /* time */ JulianDate, /* externalFiles */ Any) => String): Self = StObject.set(x, "modelCallback", js.Any.fromFunction3(value))
    
    inline def setModelCallbackUndefined: Self = StObject.set(x, "modelCallback", js.undefined)
    
    inline def setSampleDuration(value: Double): Self = StObject.set(x, "sampleDuration", value.asInstanceOf[js.Any])
    
    inline def setSampleDurationUndefined: Self = StObject.set(x, "sampleDuration", js.undefined)
    
    inline def setTime(value: JulianDate): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
