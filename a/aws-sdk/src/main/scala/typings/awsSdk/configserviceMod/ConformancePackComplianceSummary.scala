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
}

