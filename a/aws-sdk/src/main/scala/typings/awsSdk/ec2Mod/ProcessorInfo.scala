package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessorInfo extends js.Object {
  /**
    * A list of architectures supported by the instance type.
    */
  var SupportedArchitectures: js.UndefOr[ArchitectureTypeList] = js.native
  /**
    * The speed of the processor, in GHz.
    */
  var SustainedClockSpeedInGhz: js.UndefOr[ProcessorSustainedClockSpeed] = js.native
}

object ProcessorInfo {
  @scala.inline
  def apply(
    SupportedArchitectures: ArchitectureTypeList = null,
    SustainedClockSpeedInGhz: Int | scala.Double = null
  ): ProcessorInfo = {
    val __obj = js.Dynamic.literal()
    if (SupportedArchitectures != null) __obj.updateDynamic("SupportedArchitectures")(SupportedArchitectures.asInstanceOf[js.Any])
    if (SustainedClockSpeedInGhz != null) __obj.updateDynamic("SustainedClockSpeedInGhz")(SustainedClockSpeedInGhz.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorInfo]
  }
}

