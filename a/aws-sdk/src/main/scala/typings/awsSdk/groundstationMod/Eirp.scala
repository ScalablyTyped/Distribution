package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eirp extends js.Object {
  /**
    * Units of an EIRP.
    */
  var units: EirpUnits = js.native
  /**
    * Value of an EIRP.
    */
  var value: Double = js.native
}

object Eirp {
  @scala.inline
  def apply(units: EirpUnits, value: Double): Eirp = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eirp]
  }
}

