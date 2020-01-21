package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSecurityProfileRequest extends js.Object {
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.native
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
  def apply(
    securityProfileName: SecurityProfileName,
    additionalMetricsToRetain: AdditionalMetricsToRetainList = null,
    alertTargets: AlertTargets = null,
    behaviors: Behaviors = null,
    deleteAdditionalMetricsToRetain: js.UndefOr[scala.Boolean] = js.undefined,
    deleteAlertTargets: js.UndefOr[scala.Boolean] = js.undefined,
    deleteBehaviors: js.UndefOr[scala.Boolean] = js.undefined,
    expectedVersion: Int | Double = null,
    securityProfileDescription: SecurityProfileDescription = null
  ): UpdateSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any])
    if (additionalMetricsToRetain != null) __obj.updateDynamic("additionalMetricsToRetain")(additionalMetricsToRetain.asInstanceOf[js.Any])
    if (alertTargets != null) __obj.updateDynamic("alertTargets")(alertTargets.asInstanceOf[js.Any])
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteAdditionalMetricsToRetain)) __obj.updateDynamic("deleteAdditionalMetricsToRetain")(deleteAdditionalMetricsToRetain.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteAlertTargets)) __obj.updateDynamic("deleteAlertTargets")(deleteAlertTargets.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteBehaviors)) __obj.updateDynamic("deleteBehaviors")(deleteBehaviors.asInstanceOf[js.Any])
    if (expectedVersion != null) __obj.updateDynamic("expectedVersion")(expectedVersion.asInstanceOf[js.Any])
    if (securityProfileDescription != null) __obj.updateDynamic("securityProfileDescription")(securityProfileDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecurityProfileRequest]
  }
}

