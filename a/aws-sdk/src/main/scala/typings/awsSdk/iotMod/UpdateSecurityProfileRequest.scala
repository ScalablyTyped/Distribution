package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecurityProfileRequest extends StObject {
  
  /**
    *  Please use UpdateSecurityProfileRequest$additionalMetricsToRetainV2 instead.  A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined
  
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List] = js.undefined
  
  /**
    * Where the alerts are sent. (Alerts are always sent to the console.)
    */
  var alertTargets: js.UndefOr[AlertTargets] = js.undefined
  
  /**
    * Specifies the behaviors that, when violated by a device (thing), cause an alert.
    */
  var behaviors: js.UndefOr[Behaviors] = js.undefined
  
  /**
    * If true, delete all additionalMetricsToRetain defined for this security profile. If any additionalMetricsToRetain are defined in the current invocation, an exception occurs.
    */
  var deleteAdditionalMetricsToRetain: js.UndefOr[DeleteAdditionalMetricsToRetain] = js.undefined
  
  /**
    * If true, delete all alertTargets defined for this security profile. If any alertTargets are defined in the current invocation, an exception occurs.
    */
  var deleteAlertTargets: js.UndefOr[DeleteAlertTargets] = js.undefined
  
  /**
    * If true, delete all behaviors defined for this security profile. If any behaviors are defined in the current invocation, an exception occurs.
    */
  var deleteBehaviors: js.UndefOr[DeleteBehaviors] = js.undefined
  
  /**
    * The expected version of the security profile. A new version is generated whenever the security profile is updated. If you specify a value that is different from the actual version, a VersionConflictException is thrown.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  
  /**
    * A description of the security profile.
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined
  
  /**
    * The name of the security profile you want to update.
    */
  var securityProfileName: SecurityProfileName
}
object UpdateSecurityProfileRequest {
  
  inline def apply(securityProfileName: SecurityProfileName): UpdateSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecurityProfileRequest]
  }
  
  extension [Self <: UpdateSecurityProfileRequest](x: Self) {
    
    inline def setAdditionalMetricsToRetain(value: AdditionalMetricsToRetainList): Self = StObject.set(x, "additionalMetricsToRetain", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMetricsToRetainUndefined: Self = StObject.set(x, "additionalMetricsToRetain", js.undefined)
    
    inline def setAdditionalMetricsToRetainV2(value: AdditionalMetricsToRetainV2List): Self = StObject.set(x, "additionalMetricsToRetainV2", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMetricsToRetainV2Undefined: Self = StObject.set(x, "additionalMetricsToRetainV2", js.undefined)
    
    inline def setAdditionalMetricsToRetainV2Varargs(value: MetricToRetain*): Self = StObject.set(x, "additionalMetricsToRetainV2", js.Array(value :_*))
    
    inline def setAdditionalMetricsToRetainVarargs(value: BehaviorMetric*): Self = StObject.set(x, "additionalMetricsToRetain", js.Array(value :_*))
    
    inline def setAlertTargets(value: AlertTargets): Self = StObject.set(x, "alertTargets", value.asInstanceOf[js.Any])
    
    inline def setAlertTargetsUndefined: Self = StObject.set(x, "alertTargets", js.undefined)
    
    inline def setBehaviors(value: Behaviors): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    inline def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
    
    inline def setBehaviorsVarargs(value: Behavior*): Self = StObject.set(x, "behaviors", js.Array(value :_*))
    
    inline def setDeleteAdditionalMetricsToRetain(value: DeleteAdditionalMetricsToRetain): Self = StObject.set(x, "deleteAdditionalMetricsToRetain", value.asInstanceOf[js.Any])
    
    inline def setDeleteAdditionalMetricsToRetainUndefined: Self = StObject.set(x, "deleteAdditionalMetricsToRetain", js.undefined)
    
    inline def setDeleteAlertTargets(value: DeleteAlertTargets): Self = StObject.set(x, "deleteAlertTargets", value.asInstanceOf[js.Any])
    
    inline def setDeleteAlertTargetsUndefined: Self = StObject.set(x, "deleteAlertTargets", js.undefined)
    
    inline def setDeleteBehaviors(value: DeleteBehaviors): Self = StObject.set(x, "deleteBehaviors", value.asInstanceOf[js.Any])
    
    inline def setDeleteBehaviorsUndefined: Self = StObject.set(x, "deleteBehaviors", js.undefined)
    
    inline def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    inline def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    inline def setSecurityProfileDescription(value: SecurityProfileDescription): Self = StObject.set(x, "securityProfileDescription", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileDescriptionUndefined: Self = StObject.set(x, "securityProfileDescription", js.undefined)
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
  }
}
