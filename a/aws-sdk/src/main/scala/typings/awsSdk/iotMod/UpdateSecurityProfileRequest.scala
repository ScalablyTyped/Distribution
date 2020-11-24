package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSecurityProfileRequest extends js.Object {
  
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
  implicit class UpdateSecurityProfileRequestOps[Self <: UpdateSecurityProfileRequest] (val x: Self) extends AnyVal {
    
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
    def setSecurityProfileName(value: SecurityProfileName): Self = this.set("securityProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalMetricsToRetainVarargs(value: BehaviorMetric*): Self = this.set("additionalMetricsToRetain", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalMetricsToRetain(value: AdditionalMetricsToRetainList): Self = this.set("additionalMetricsToRetain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalMetricsToRetain: Self = this.set("additionalMetricsToRetain", js.undefined)
    
    @scala.inline
    def setAdditionalMetricsToRetainV2Varargs(value: MetricToRetain*): Self = this.set("additionalMetricsToRetainV2", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalMetricsToRetainV2(value: AdditionalMetricsToRetainV2List): Self = this.set("additionalMetricsToRetainV2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalMetricsToRetainV2: Self = this.set("additionalMetricsToRetainV2", js.undefined)
    
    @scala.inline
    def setAlertTargets(value: AlertTargets): Self = this.set("alertTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlertTargets: Self = this.set("alertTargets", js.undefined)
    
    @scala.inline
    def setBehaviorsVarargs(value: Behavior*): Self = this.set("behaviors", js.Array(value :_*))
    
    @scala.inline
    def setBehaviors(value: Behaviors): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehaviors: Self = this.set("behaviors", js.undefined)
    
    @scala.inline
    def setDeleteAdditionalMetricsToRetain(value: DeleteAdditionalMetricsToRetain): Self = this.set("deleteAdditionalMetricsToRetain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteAdditionalMetricsToRetain: Self = this.set("deleteAdditionalMetricsToRetain", js.undefined)
    
    @scala.inline
    def setDeleteAlertTargets(value: DeleteAlertTargets): Self = this.set("deleteAlertTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteAlertTargets: Self = this.set("deleteAlertTargets", js.undefined)
    
    @scala.inline
    def setDeleteBehaviors(value: DeleteBehaviors): Self = this.set("deleteBehaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteBehaviors: Self = this.set("deleteBehaviors", js.undefined)
    
    @scala.inline
    def setExpectedVersion(value: OptionalVersion): Self = this.set("expectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedVersion: Self = this.set("expectedVersion", js.undefined)
    
    @scala.inline
    def setSecurityProfileDescription(value: SecurityProfileDescription): Self = this.set("securityProfileDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityProfileDescription: Self = this.set("securityProfileDescription", js.undefined)
  }
}
