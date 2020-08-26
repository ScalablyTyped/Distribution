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
  def apply(): ProcessorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessorInfo]
  }
  @scala.inline
  implicit class ProcessorInfoOps[Self <: ProcessorInfo] (val x: Self) extends AnyVal {
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
    def setSupportedArchitecturesVarargs(value: ArchitectureType*): Self = this.set("SupportedArchitectures", js.Array(value :_*))
    @scala.inline
    def setSupportedArchitectures(value: ArchitectureTypeList): Self = this.set("SupportedArchitectures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedArchitectures: Self = this.set("SupportedArchitectures", js.undefined)
    @scala.inline
    def setSustainedClockSpeedInGhz(value: ProcessorSustainedClockSpeed): Self = this.set("SustainedClockSpeedInGhz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSustainedClockSpeedInGhz: Self = this.set("SustainedClockSpeedInGhz", js.undefined)
  }
  
}

