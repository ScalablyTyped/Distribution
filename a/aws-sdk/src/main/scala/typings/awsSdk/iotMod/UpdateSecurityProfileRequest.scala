package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSecurityProfileRequest extends StObject {
  
  /**
    *  Please use UpdateSecurityProfileRequest$additionalMetricsToRetainV2 instead.  A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.native
  
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List] = js.native
  
  /**
    * Where the alerts are sent. (Alerts are always sent to the console.)
    */
  var alertTargets: js.UndefOr[AlertTargets] = js.native
  
  /**
    * Specifies the behaviors that, when violated by a device (thing), cause an alert.
    */
  var behaviors: js.UndefOr[Behaviors] = js.native
  
  /**
    * If true, delete all additionalMetricsToRetain defined for this security profile. If any additionalMetricsToRetain are defined in the current invocation, an exception occurs.
    */
  var deleteAdditionalMetricsToRetain: js.UndefOr[DeleteAdditionalMetricsToRetain] = js.native
  
  /**
    * If true, delete all alertTargets defined for this security profile. If any alertTargets are defined in the current invocation, an exception occurs.
    */
  var deleteAlertTargets: js.UndefOr[DeleteAlertTargets] = js.native
  
  /**
    * If true, delete all behaviors defined for this security profile. If any behaviors are defined in the current invocation, an exception occurs.
    */
  var deleteBehaviors: js.UndefOr[DeleteBehaviors] = js.native
  
  /**
    * The expected version of the security profile. A new version is generated whenever the security profile is updated. If you specify a value that is different from the actual version, a VersionConflictException is thrown.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  
  /**
    * A description of the security profile.
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.native
  
  /**
    * The name of the security profile you want to update.
    */
  var securityProfileName: SecurityProfileName = js.native
}
object UpdateSecurityProfileRequest {
  
  @scala.inline
  def apply(securityProfileName: SecurityProfileName): UpdateSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecurityProfileRequest]
  }
  
  @scala.inline
  implicit class UpdateSecurityProfileRequestMutableBuilder[Self <: UpdateSecurityProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalMetricsToRetain(value: AdditionalMetricsToRetainList): Self = StObject.set(x, "additionalMetricsToRetain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalMetricsToRetainUndefined: Self = StObject.set(x, "additionalMetricsToRetain", js.undefined)
    
    @scala.inline
    def setAdditionalMetricsToRetainV2(value: AdditionalMetricsToRetainV2List): Self = StObject.set(x, "additionalMetricsToRetainV2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalMetricsToRetainV2Undefined: Self = StObject.set(x, "additionalMetricsToRetainV2", js.undefined)
    
    @scala.inline
    def setAdditionalMetricsToRetainV2Varargs(value: MetricToRetain*): Self = StObject.set(x, "additionalMetricsToRetainV2", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalMetricsToRetainVarargs(value: BehaviorMetric*): Self = StObject.set(x, "additionalMetricsToRetain", js.Array(value :_*))
    
    @scala.inline
    def setAlertTargets(value: AlertTargets): Self = StObject.set(x, "alertTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertTargetsUndefined: Self = StObject.set(x, "alertTargets", js.undefined)
    
    @scala.inline
    def setBehaviors(value: Behaviors): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
    
    @scala.inline
    def setBehaviorsVarargs(value: Behavior*): Self = StObject.set(x, "behaviors", js.Array(value :_*))
    
    @scala.inline
    def setDeleteAdditionalMetricsToRetain(value: DeleteAdditionalMetricsToRetain): Self = StObject.set(x, "deleteAdditionalMetricsToRetain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAdditionalMetricsToRetainUndefined: Self = StObject.set(x, "deleteAdditionalMetricsToRetain", js.undefined)
    
    @scala.inline
    def setDeleteAlertTargets(value: DeleteAlertTargets): Self = StObject.set(x, "deleteAlertTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAlertTargetsUndefined: Self = StObject.set(x, "deleteAlertTargets", js.undefined)
    
    @scala.inline
    def setDeleteBehaviors(value: DeleteBehaviors): Self = StObject.set(x, "deleteBehaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteBehaviorsUndefined: Self = StObject.set(x, "deleteBehaviors", js.undefined)
    
    @scala.inline
    def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    @scala.inline
    def setSecurityProfileDescription(value: SecurityProfileDescription): Self = StObject.set(x, "securityProfileDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileDescriptionUndefined: Self = StObject.set(x, "securityProfileDescription", js.undefined)
    
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
  }
}
