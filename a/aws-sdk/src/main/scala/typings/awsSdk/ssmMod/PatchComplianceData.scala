package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchComplianceData extends StObject {
  
  /**
    * The IDs of one or more Common Vulnerabilities and Exposure (CVE) issues that are resolved by the patch.
    */
  var CVEIds: js.UndefOr[PatchCVEIds] = js.undefined
  
  /**
    * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
    */
  var Classification: PatchClassification
  
  /**
    * The date/time the patch was installed on the instance. Note that not all operating systems provide this level of information.
    */
  var InstalledTime: DateTime
  
  /**
    * The operating system-specific ID of the patch.
    */
  var KBId: PatchKbNumber
  
  /**
    * The severity of the patch (for example, Critical, Important, Moderate).
    */
  var Severity: PatchSeverity
  
  /**
    * The state of the patch on the instance, such as INSTALLED or FAILED. For descriptions of each patch state, see About patch compliance in the AWS Systems Manager User Guide.
    */
  var State: PatchComplianceDataState
  
  /**
    * The title of the patch.
    */
  var Title: PatchTitle
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
  
  @scala.inline
  implicit class PatchComplianceDataMutableBuilder[Self <: PatchComplianceData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCVEIds(value: PatchCVEIds): Self = StObject.set(x, "CVEIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCVEIdsUndefined: Self = StObject.set(x, "CVEIds", js.undefined)
    
    @scala.inline
    def setClassification(value: PatchClassification): Self = StObject.set(x, "Classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledTime(value: DateTime): Self = StObject.set(x, "InstalledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKBId(value: PatchKbNumber): Self = StObject.set(x, "KBId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: PatchSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: PatchComplianceDataState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: PatchTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
