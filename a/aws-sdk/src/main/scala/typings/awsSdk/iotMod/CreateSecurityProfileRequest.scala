package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecurityProfileRequest extends StObject {
  
  /**
    *  Please use CreateSecurityProfileRequest$additionalMetricsToRetainV2 instead.  A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined
  
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List] = js.undefined
  
  /**
    * Specifies the destinations to which alerts are sent. (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates a behavior.
    */
  var alertTargets: js.UndefOr[AlertTargets] = js.undefined
  
  /**
    * Specifies the behaviors that, when violated by a device (thing), cause an alert.
    */
  var behaviors: js.UndefOr[Behaviors] = js.undefined
  
  /**
    * A description of the security profile.
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined
  
  /**
    * The name you are giving to the security profile.
    */
  var securityProfileName: SecurityProfileName
  
  /**
    * Metadata that can be used to manage the security profile.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateSecurityProfileRequest {
  
  @scala.inline
  def apply(securityProfileName: SecurityProfileName): CreateSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityProfileRequest]
  }
  
  @scala.inline
  implicit class CreateSecurityProfileRequestMutableBuilder[Self <: CreateSecurityProfileRequest] (val x: Self) extends AnyVal {
    
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
    def setSecurityProfileDescription(value: SecurityProfileDescription): Self = StObject.set(x, "securityProfileDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileDescriptionUndefined: Self = StObject.set(x, "securityProfileDescription", js.undefined)
    
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
