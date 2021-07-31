package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MitigationActionParams extends StObject {
  
  /**
    * Parameters to define a mitigation action that moves devices associated with a certificate to one or more specified thing groups, typically for quarantine.
    */
  var addThingsToThingGroupParams: js.UndefOr[AddThingsToThingGroupParams] = js.undefined
  
  /**
    * Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
    */
  var enableIoTLoggingParams: js.UndefOr[EnableIoTLoggingParams] = js.undefined
  
  /**
    * Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom actions in response to the Amazon SNS messages.
    */
  var publishFindingToSnsParams: js.UndefOr[PublishFindingToSnsParams] = js.undefined
  
  /**
    * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
    */
  var replaceDefaultPolicyVersionParams: js.UndefOr[ReplaceDefaultPolicyVersionParams] = js.undefined
  
  /**
    * Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
    */
  var updateCACertificateParams: js.UndefOr[UpdateCACertificateParams] = js.undefined
  
  /**
    * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
    */
  var updateDeviceCertificateParams: js.UndefOr[UpdateDeviceCertificateParams] = js.undefined
}
object MitigationActionParams {
  
  @scala.inline
  def apply(): MitigationActionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MitigationActionParams]
  }
  
  @scala.inline
  implicit class MitigationActionParamsMutableBuilder[Self <: MitigationActionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddThingsToThingGroupParams(value: AddThingsToThingGroupParams): Self = StObject.set(x, "addThingsToThingGroupParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddThingsToThingGroupParamsUndefined: Self = StObject.set(x, "addThingsToThingGroupParams", js.undefined)
    
    @scala.inline
    def setEnableIoTLoggingParams(value: EnableIoTLoggingParams): Self = StObject.set(x, "enableIoTLoggingParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableIoTLoggingParamsUndefined: Self = StObject.set(x, "enableIoTLoggingParams", js.undefined)
    
    @scala.inline
    def setPublishFindingToSnsParams(value: PublishFindingToSnsParams): Self = StObject.set(x, "publishFindingToSnsParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishFindingToSnsParamsUndefined: Self = StObject.set(x, "publishFindingToSnsParams", js.undefined)
    
    @scala.inline
    def setReplaceDefaultPolicyVersionParams(value: ReplaceDefaultPolicyVersionParams): Self = StObject.set(x, "replaceDefaultPolicyVersionParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceDefaultPolicyVersionParamsUndefined: Self = StObject.set(x, "replaceDefaultPolicyVersionParams", js.undefined)
    
    @scala.inline
    def setUpdateCACertificateParams(value: UpdateCACertificateParams): Self = StObject.set(x, "updateCACertificateParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCACertificateParamsUndefined: Self = StObject.set(x, "updateCACertificateParams", js.undefined)
    
    @scala.inline
    def setUpdateDeviceCertificateParams(value: UpdateDeviceCertificateParams): Self = StObject.set(x, "updateDeviceCertificateParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDeviceCertificateParamsUndefined: Self = StObject.set(x, "updateDeviceCertificateParams", js.undefined)
  }
}
