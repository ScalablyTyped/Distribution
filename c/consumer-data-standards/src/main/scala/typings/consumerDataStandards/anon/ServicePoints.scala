package typings.consumerDataStandards.anon

import typings.consumerDataStandards.energyMod.EnergyServicePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServicePoints extends StObject {
  
  var servicePoints: js.Array[EnergyServicePoint]
}
object ServicePoints {
  
  inline def apply(servicePoints: js.Array[EnergyServicePoint]): ServicePoints = {
    val __obj = js.Dynamic.literal(servicePoints = servicePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePoints]
  }
  
  extension [Self <: ServicePoints](x: Self) {
    
    inline def setServicePoints(value: js.Array[EnergyServicePoint]): Self = StObject.set(x, "servicePoints", value.asInstanceOf[js.Any])
    
    inline def setServicePointsVarargs(value: EnergyServicePoint*): Self = StObject.set(x, "servicePoints", js.Array(value*))
  }
}
