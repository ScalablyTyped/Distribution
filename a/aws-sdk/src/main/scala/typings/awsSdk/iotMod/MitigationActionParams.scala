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
  
  inline def apply(): MitigationActionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MitigationActionParams]
  }
  
  extension [Self <: MitigationActionParams](x: Self) {
    
    inline def setAddThingsToThingGroupParams(value: AddThingsToThingGroupParams): Self = StObject.set(x, "addThingsToThingGroupParams", value.asInstanceOf[js.Any])
    
    inline def setAddThingsToThingGroupParamsUndefined: Self = StObject.set(x, "addThingsToThingGroupParams", js.undefined)
    
    inline def setEnableIoTLoggingParams(value: EnableIoTLoggingParams): Self = StObject.set(x, "enableIoTLoggingParams", value.asInstanceOf[js.Any])
    
    inline def setEnableIoTLoggingParamsUndefined: Self = StObject.set(x, "enableIoTLoggingParams", js.undefined)
    
    inline def setPublishFindingToSnsParams(value: PublishFindingToSnsParams): Self = StObject.set(x, "publishFindingToSnsParams", value.asInstanceOf[js.Any])
    
    inline def setPublishFindingToSnsParamsUndefined: Self = StObject.set(x, "publishFindingToSnsParams", js.undefined)
    
    inline def setReplaceDefaultPolicyVersionParams(value: ReplaceDefaultPolicyVersionParams): Self = StObject.set(x, "replaceDefaultPolicyVersionParams", value.asInstanceOf[js.Any])
    
    inline def setReplaceDefaultPolicyVersionParamsUndefined: Self = StObject.set(x, "replaceDefaultPolicyVersionParams", js.undefined)
    
    inline def setUpdateCACertificateParams(value: UpdateCACertificateParams): Self = StObject.set(x, "updateCACertificateParams", value.asInstanceOf[js.Any])
    
    inline def setUpdateCACertificateParamsUndefined: Self = StObject.set(x, "updateCACertificateParams", js.undefined)
    
    inline def setUpdateDeviceCertificateParams(value: UpdateDeviceCertificateParams): Self = StObject.set(x, "updateDeviceCertificateParams", value.asInstanceOf[js.Any])
    
    inline def setUpdateDeviceCertificateParamsUndefined: Self = StObject.set(x, "updateDeviceCertificateParams", js.undefined)
  }
}
