package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Elevation extends js.Object {
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
}

