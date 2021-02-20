package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSecurityProfileResponse extends StObject {
  
  /**
    *  Please use DescribeSecurityProfileResponse$additionalMetricsToRetainV2 instead.  A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
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
    * The time the security profile was created.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time the security profile was last modified.
    */
  var lastModifiedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ARN of the security profile.
    */
  var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.native
  
  /**
    * A description of the security profile (associated with the security profile when it was created or updated).
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.native
  
  /**
    * The name of the security profile.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
  
  /**
    * The version of the security profile. A new version is generated whenever the security profile is updated.
    */
  var version: js.UndefOr[Version] = js.native
}
object DescribeSecurityProfileResponse {
  
  @scala.inline
  def apply(): DescribeSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityProfileResponse]
  }
  
  @scala.inline
  implicit class DescribeSecurityProfileResponseMutableBuilder[Self <: DescribeSecurityProfileResponse] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Timestamp): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setSecurityProfileArn(value: SecurityProfileArn): Self = StObject.set(x, "securityProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileArnUndefined: Self = StObject.set(x, "securityProfileArn", js.undefined)
    
    @scala.inline
    def setSecurityProfileDescription(value: SecurityProfileDescription): Self = StObject.set(x, "securityProfileDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileDescriptionUndefined: Self = StObject.set(x, "securityProfileDescription", js.undefined)
    
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileNameUndefined: Self = StObject.set(x, "securityProfileName", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
