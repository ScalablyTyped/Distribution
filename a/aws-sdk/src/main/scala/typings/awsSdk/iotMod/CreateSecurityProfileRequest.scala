package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSecurityProfileRequest extends js.Object {
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.  Note: This API field is deprecated. Please use CreateSecurityProfileRequest$additionalMetricsToRetainV2 instead.
    */
  var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.native
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List] = js.native
  /**
    * Specifies the destinations to which alerts are sent. (Alerts are always sent to the console.) Alerts are generated when a device (thing) violates a behavior.
    */
  var alertTargets: js.UndefOr[AlertTargets] = js.native
  /**
    * Specifies the behaviors that, when violated by a device (thing), cause an alert.
    */
  var behaviors: js.UndefOr[Behaviors] = js.native
  /**
    * A description of the security profile.
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.native
  /**
    * The name you are giving to the security profile.
    */
  var securityProfileName: SecurityProfileName = js.native
  /**
    * Metadata that can be used to manage the security profile.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateSecurityProfileRequest {
  @scala.inline
  def apply(securityProfileName: SecurityProfileName): CreateSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecurityProfileRequest]
  }
  @scala.inline
  implicit class CreateSecurityProfileRequestOps[Self <: CreateSecurityProfileRequest] (val x: Self) extends AnyVal {
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
    def setSecurityProfileDescription(value: SecurityProfileDescription): Self = this.set("securityProfileDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityProfileDescription: Self = this.set("securityProfileDescription", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

