package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /**
    * Information about the activity that is described in a finding.
    */
  var Action: js.UndefOr[typings.awsSdk.guarddutyMod.Action] = js.undefined
  
  /**
    * Indicates whether this finding is archived.
    */
  var Archived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The total count of the occurrences of this finding type.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * The detector ID for the GuardDuty service.
    */
  var DetectorId: js.UndefOr[typings.awsSdk.guarddutyMod.DetectorId] = js.undefined
  
  /**
    * The first-seen timestamp of the activity that prompted GuardDuty to generate this finding.
    */
  var EventFirstSeen: js.UndefOr[String] = js.undefined
  
  /**
    * The last-seen timestamp of the activity that prompted GuardDuty to generate this finding.
    */
  var EventLastSeen: js.UndefOr[String] = js.undefined
  
  /**
    * An evidence object associated with the service.
    */
  var Evidence: js.UndefOr[typings.awsSdk.guarddutyMod.Evidence] = js.undefined
  
  /**
    * The resource role information for this finding.
    */
  var ResourceRole: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the AWS service (GuardDuty) that generated a finding.
    */
  var ServiceName: js.UndefOr[String] = js.undefined
  
  /**
    * Feedback that was submitted about the finding.
    */
  var UserFeedback: js.UndefOr[String] = js.undefined
}
object Service {
  
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "Archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "Archived", js.undefined)
    
    @scala.inline
    def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorIdUndefined: Self = StObject.set(x, "DetectorId", js.undefined)
    
    @scala.inline
    def setEventFirstSeen(value: String): Self = StObject.set(x, "EventFirstSeen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFirstSeenUndefined: Self = StObject.set(x, "EventFirstSeen", js.undefined)
    
    @scala.inline
    def setEventLastSeen(value: String): Self = StObject.set(x, "EventLastSeen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventLastSeenUndefined: Self = StObject.set(x, "EventLastSeen", js.undefined)
    
    @scala.inline
    def setEvidence(value: Evidence): Self = StObject.set(x, "Evidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvidenceUndefined: Self = StObject.set(x, "Evidence", js.undefined)
    
    @scala.inline
    def setResourceRole(value: String): Self = StObject.set(x, "ResourceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRoleUndefined: Self = StObject.set(x, "ResourceRole", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    @scala.inline
    def setUserFeedback(value: String): Self = StObject.set(x, "UserFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFeedbackUndefined: Self = StObject.set(x, "UserFeedback", js.undefined)
  }
}
