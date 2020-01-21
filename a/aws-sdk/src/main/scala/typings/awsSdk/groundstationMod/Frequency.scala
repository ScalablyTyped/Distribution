package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frequency extends js.Object {
  /**
    * Frequency units.
    */
  var units: FrequencyUnits = js.native
  /**
    * Frequency value.
    */
  var value: Double = js.native
}

object Frequency {
  @scala.inline
  def apply(units: FrequencyUnits, value: Double): Frequency = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Frequency]
  }
}

