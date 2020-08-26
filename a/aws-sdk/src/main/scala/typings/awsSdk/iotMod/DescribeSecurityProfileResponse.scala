package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSecurityProfileResponse extends js.Object {
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.  Note: This API field is deprecated. Please use DescribeSecurityProfileResponse$additionalMetricsToRetainV2 instead.
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
  implicit class DescribeSecurityProfileResponseOps[Self <: DescribeSecurityProfileResponse] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: Timestamp): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: Timestamp): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setSecurityProfileArn(value: SecurityProfileArn): Self = this.set("securityProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityProfileArn: Self = this.set("securityProfileArn", js.undefined)
    @scala.inline
    def setSecurityProfileDescription(value: SecurityProfileDescription): Self = this.set("securityProfileDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityProfileDescription: Self = this.set("securityProfileDescription", js.undefined)
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = this.set("securityProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityProfileName: Self = this.set("securityProfileName", js.undefined)
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

