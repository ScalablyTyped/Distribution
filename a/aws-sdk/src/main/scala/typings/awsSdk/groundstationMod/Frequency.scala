package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Frequency extends StObject {
  
  /**
    * Frequency units.
    */
  var units: FrequencyUnits = js.native
  
  /**
    * Frequency value. Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to 2120 MHz for uplink.
    */
  var value: Double = js.native
}
object Frequency {
  
  @scala.inline
  def apply(units: FrequencyUnits, value: Double): Frequency = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frequency]
  }
  
  @scala.inline
  implicit class FrequencyMutableBuilder[Self <: Frequency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnits(value: FrequencyUnits): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
