package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MitigationActionParams extends js.Object {
  /**
    * Parameters to define a mitigation action that moves devices associated with a certificate to one or more specified thing groups, typically for quarantine.
    */
  var addThingsToThingGroupParams: js.UndefOr[AddThingsToThingGroupParams] = js.native
  /**
    * Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
    */
  var enableIoTLoggingParams: js.UndefOr[EnableIoTLoggingParams] = js.native
  /**
    * Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom actions in response to the Amazon SNS messages.
    */
  var publishFindingToSnsParams: js.UndefOr[PublishFindingToSnsParams] = js.native
  /**
    * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
    */
  var replaceDefaultPolicyVersionParams: js.UndefOr[ReplaceDefaultPolicyVersionParams] = js.native
  /**
    * Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
    */
  var updateCACertificateParams: js.UndefOr[UpdateCACertificateParams] = js.native
  /**
    * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
    */
  var updateDeviceCertificateParams: js.UndefOr[UpdateDeviceCertificateParams] = js.native
}

object MitigationActionParams {
  @scala.inline
  def apply(
    addThingsToThingGroupParams: AddThingsToThingGroupParams = null,
    enableIoTLoggingParams: EnableIoTLoggingParams = null,
    publishFindingToSnsParams: PublishFindingToSnsParams = null,
    replaceDefaultPolicyVersionParams: ReplaceDefaultPolicyVersionParams = null,
    updateCACertificateParams: UpdateCACertificateParams = null,
    updateDeviceCertificateParams: UpdateDeviceCertificateParams = null
  ): MitigationActionParams = {
    val __obj = js.Dynamic.literal()
    if (addThingsToThingGroupParams != null) __obj.updateDynamic("addThingsToThingGroupParams")(addThingsToThingGroupParams.asInstanceOf[js.Any])
    if (enableIoTLoggingParams != null) __obj.updateDynamic("enableIoTLoggingParams")(enableIoTLoggingParams.asInstanceOf[js.Any])
    if (publishFindingToSnsParams != null) __obj.updateDynamic("publishFindingToSnsParams")(publishFindingToSnsParams.asInstanceOf[js.Any])
    if (replaceDefaultPolicyVersionParams != null) __obj.updateDynamic("replaceDefaultPolicyVersionParams")(replaceDefaultPolicyVersionParams.asInstanceOf[js.Any])
    if (updateCACertificateParams != null) __obj.updateDynamic("updateCACertificateParams")(updateCACertificateParams.asInstanceOf[js.Any])
    if (updateDeviceCertificateParams != null) __obj.updateDynamic("updateDeviceCertificateParams")(updateDeviceCertificateParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[MitigationActionParams]
  }
}

