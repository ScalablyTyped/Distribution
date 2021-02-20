package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elevation extends StObject {
  
  /**
    * Elevation angle units.
    */
  var unit: AngleUnits = js.native
  
  /**
    * Elevation angle value.
    */
  var value: Double = js.native
}
object Elevation {
  
  @scala.inline
  def apply(unit: AngleUnits, value: Double): Elevation = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elevation]
  }
  
  @scala.inline
  implicit class ElevationMutableBuilder[Self <: Elevation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: AngleUnits): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
