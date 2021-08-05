package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eirp extends StObject {
  
  /**
    * Units of an EIRP.
    */
  var units: EirpUnits
  
  /**
    * Value of an EIRP. Valid values are between 20.0 to 50.0 dBW.
    */
  var value: Double
}
object Eirp {
  
  inline def apply(units: EirpUnits, value: Double): Eirp = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eirp]
  }
  
  extension [Self <: Eirp](x: Self) {
    
    inline def setUnits(value: EirpUnits): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
