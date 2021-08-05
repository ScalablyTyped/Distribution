package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecurityProfileResponse extends StObject {
  
  /**
    *  Please use UpdateSecurityProfileResponse$additionalMetricsToRetainV2 instead.  A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the security profile's behaviors, but it is also retained for any metric specified here.
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
    * The time the security profile was created.
    */
  var creationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time the security profile was last modified.
    */
  var lastModifiedDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The ARN of the security profile that was updated.
    */
  var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined
  
  /**
    * The description of the security profile.
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined
  
  /**
    * The name of the security profile that was updated.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  
  /**
    * The updated version of the security profile.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object UpdateSecurityProfileResponse {
  
  inline def apply(): UpdateSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecurityProfileResponse]
  }
  
  extension [Self <: UpdateSecurityProfileResponse](x: Self) {
    
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
    
    inline def setCreationDate(value: Timestamp): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setLastModifiedDate(value: Timestamp): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setSecurityProfileArn(value: SecurityProfileArn): Self = StObject.set(x, "securityProfileArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileArnUndefined: Self = StObject.set(x, "securityProfileArn", js.undefined)
    
    inline def setSecurityProfileDescription(value: SecurityProfileDescription): Self = StObject.set(x, "securityProfileDescription", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileDescriptionUndefined: Self = StObject.set(x, "securityProfileDescription", js.undefined)
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileNameUndefined: Self = StObject.set(x, "securityProfileName", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
