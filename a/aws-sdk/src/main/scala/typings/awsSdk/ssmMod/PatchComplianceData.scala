package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchComplianceData extends js.Object {
  /**
    * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
    */
  var Classification: PatchClassification = js.native
  /**
    * The date/time the patch was installed on the instance. Note that not all operating systems provide this level of information.
    */
  var InstalledTime: DateTime = js.native
  /**
    * The operating system-specific ID of the patch.
    */
  var KBId: PatchKbNumber = js.native
  /**
    * The severity of the patch (for example, Critical, Important, Moderate).
    */
  var Severity: PatchSeverity = js.native
  /**
    * The state of the patch on the instance, such as INSTALLED or FAILED. For descriptions of each patch state, see About Patch Compliance in the AWS Systems Manager User Guide.
    */
  var State: PatchComplianceDataState = js.native
  /**
    * The title of the patch.
    */
  var Title: PatchTitle = js.native
}

object PatchComplianceData {
  @scala.inline
  def apply(
    Classification: PatchClassification,
    InstalledTime: DateTime,
    KBId: PatchKbNumber,
    Severity: PatchSeverity,
    State: PatchComplianceDataState,
    Title: PatchTitle
  ): PatchComplianceData = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], InstalledTime = InstalledTime.asInstanceOf[js.Any], KBId = KBId.asInstanceOf[js.Any], Severity = Severity.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchComplianceData]
  }
}

