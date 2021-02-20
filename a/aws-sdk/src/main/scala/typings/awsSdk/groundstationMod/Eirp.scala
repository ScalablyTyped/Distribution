package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Eirp extends StObject {
  
  /**
    * Units of an EIRP.
    */
  var units: EirpUnits = js.native
  
  /**
    * Value of an EIRP. Valid values are between 20.0 to 50.0 dBW.
    */
  var value: Double = js.native
}
object Eirp {
  
  @scala.inline
  def apply(units: EirpUnits, value: Double): Eirp = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eirp]
  }
  
  @scala.inline
  implicit class EirpMutableBuilder[Self <: Eirp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnits(value: EirpUnits): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
