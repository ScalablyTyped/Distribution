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
  implicit class FrequencyOps[Self <: Frequency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUnits(value: FrequencyUnits): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

