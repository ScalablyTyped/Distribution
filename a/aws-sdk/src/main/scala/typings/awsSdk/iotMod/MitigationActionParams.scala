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
  def apply(): MitigationActionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MitigationActionParams]
  }
  @scala.inline
  implicit class MitigationActionParamsOps[Self <: MitigationActionParams] (val x: Self) extends AnyVal {
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
    def setAddThingsToThingGroupParams(value: AddThingsToThingGroupParams): Self = this.set("addThingsToThingGroupParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddThingsToThingGroupParams: Self = this.set("addThingsToThingGroupParams", js.undefined)
    @scala.inline
    def setEnableIoTLoggingParams(value: EnableIoTLoggingParams): Self = this.set("enableIoTLoggingParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableIoTLoggingParams: Self = this.set("enableIoTLoggingParams", js.undefined)
    @scala.inline
    def setPublishFindingToSnsParams(value: PublishFindingToSnsParams): Self = this.set("publishFindingToSnsParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishFindingToSnsParams: Self = this.set("publishFindingToSnsParams", js.undefined)
    @scala.inline
    def setReplaceDefaultPolicyVersionParams(value: ReplaceDefaultPolicyVersionParams): Self = this.set("replaceDefaultPolicyVersionParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceDefaultPolicyVersionParams: Self = this.set("replaceDefaultPolicyVersionParams", js.undefined)
    @scala.inline
    def setUpdateCACertificateParams(value: UpdateCACertificateParams): Self = this.set("updateCACertificateParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateCACertificateParams: Self = this.set("updateCACertificateParams", js.undefined)
    @scala.inline
    def setUpdateDeviceCertificateParams(value: UpdateDeviceCertificateParams): Self = this.set("updateDeviceCertificateParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDeviceCertificateParams: Self = this.set("updateDeviceCertificateParams", js.undefined)
  }
  
}

