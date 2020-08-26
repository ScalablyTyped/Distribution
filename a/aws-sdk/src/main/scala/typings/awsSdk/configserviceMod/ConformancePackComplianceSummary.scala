package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackComplianceSummary extends js.Object {
  /**
    * The status of the conformance pack. The allowed values are COMPLIANT and NON_COMPLIANT. 
    */
  var ConformancePackComplianceStatus: ConformancePackComplianceType = js.native
  /**
    * The name of the conformance pack name.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName = js.native
}

object ConformancePackComplianceSummary {
  @scala.inline
  def apply(
    ConformancePackComplianceStatus: ConformancePackComplianceType,
    ConformancePackName: ConformancePackName
  ): ConformancePackComplianceSummary = {
    val __obj = js.Dynamic.literal(ConformancePackComplianceStatus = ConformancePackComplianceStatus.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackComplianceSummary]
  }
  @scala.inline
  implicit class ConformancePackComplianceSummaryOps[Self <: ConformancePackComplianceSummary] (val x: Self) extends AnyVal {
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
    def setConformancePackComplianceStatus(value: ConformancePackComplianceType): Self = this.set("ConformancePackComplianceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setConformancePackName(value: ConformancePackName): Self = this.set("ConformancePackName", value.asInstanceOf[js.Any])
  }
  
}

