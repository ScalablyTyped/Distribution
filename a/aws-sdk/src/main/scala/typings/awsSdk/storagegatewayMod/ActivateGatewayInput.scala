package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateGatewayInput extends StObject {
  
  /**
    * Your gateway activation key. You can obtain the activation key by sending an HTTP GET request with redirects enabled to the gateway IP address (port 80). The redirect URL returned in the response provides you the activation key for your gateway in the query string parameter activationKey. It may also include other activation-related parameters, however, these are merely defaults -- the arguments you pass to the ActivateGateway API call determine the actual configuration of your gateway. For more information, see Getting activation key in the Storage Gateway User Guide.
    */
  var ActivationKey: typings.awsSdk.storagegatewayMod.ActivationKey
  
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: typings.awsSdk.storagegatewayMod.GatewayName
  
  /**
    * A value that indicates the Amazon Web Services Region where you want to store your data. The gateway Amazon Web Services Region specified must be the same Amazon Web Services Region as the Amazon Web Services Region in your Host header in the request. For more information about available Amazon Web Services Regions and endpoints for Storage Gateway, see  Storage Gateway endpoints and quotas in the Amazon Web Services General Reference. Valid Values: See  Storage Gateway endpoints and quotas in the Amazon Web Services General Reference. 
    */
  var GatewayRegion: RegionId
  
  /**
    * A value that indicates the time zone you want to set for the gateway. The time zone is of the format "GMT-hr:mm" or "GMT+hr:mm". For example, GMT-4:00 indicates the time is 4 hours behind GMT. GMT+2:00 indicates the time is 2 hours ahead of GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
    */
  var GatewayTimezone: typings.awsSdk.storagegatewayMod.GatewayTimezone
  
  /**
    * A value that defines the type of gateway to activate. The type specified is critical to all later functions of the gateway and cannot be changed after activation. The default value is CACHED. Valid Values: STORED | CACHED | VTL | VTL_SNOW | FILE_S3 | FILE_FSX_SMB 
    */
  var GatewayType: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayType] = js.undefined
  
  /**
    * The value that indicates the type of medium changer to use for tape gateway. This field is optional. Valid Values: STK-L700 | AWS-Gateway-VTL | IBM-03584L32-0402 
    */
  var MediumChangerType: js.UndefOr[typings.awsSdk.storagegatewayMod.MediumChangerType] = js.undefined
  
  /**
    * A list of up to 50 tags that you can assign to the gateway. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers that can be represented in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256 characters. 
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.undefined
  
  /**
    * The value that indicates the type of tape drive to use for tape gateway. This field is optional. Valid Values: IBM-ULT3580-TD5 
    */
  var TapeDriveType: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeDriveType] = js.undefined
}
object ActivateGatewayInput {
  
  inline def apply(
    ActivationKey: ActivationKey,
    GatewayName: GatewayName,
    GatewayRegion: RegionId,
    GatewayTimezone: GatewayTimezone
  ): ActivateGatewayInput = {
    val __obj = js.Dynamic.literal(ActivationKey = ActivationKey.asInstanceOf[js.Any], GatewayName = GatewayName.asInstanceOf[js.Any], GatewayRegion = GatewayRegion.asInstanceOf[js.Any], GatewayTimezone = GatewayTimezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateGatewayInput]
  }
  
  extension [Self <: ActivateGatewayInput](x: Self) {
    
    inline def setActivationKey(value: ActivationKey): Self = StObject.set(x, "ActivationKey", value.asInstanceOf[js.Any])
    
    inline def setGatewayName(value: GatewayName): Self = StObject.set(x, "GatewayName", value.asInstanceOf[js.Any])
    
    inline def setGatewayRegion(value: RegionId): Self = StObject.set(x, "GatewayRegion", value.asInstanceOf[js.Any])
    
    inline def setGatewayTimezone(value: GatewayTimezone): Self = StObject.set(x, "GatewayTimezone", value.asInstanceOf[js.Any])
    
    inline def setGatewayType(value: GatewayType): Self = StObject.set(x, "GatewayType", value.asInstanceOf[js.Any])
    
    inline def setGatewayTypeUndefined: Self = StObject.set(x, "GatewayType", js.undefined)
    
    inline def setMediumChangerType(value: MediumChangerType): Self = StObject.set(x, "MediumChangerType", value.asInstanceOf[js.Any])
    
    inline def setMediumChangerTypeUndefined: Self = StObject.set(x, "MediumChangerType", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTapeDriveType(value: TapeDriveType): Self = StObject.set(x, "TapeDriveType", value.asInstanceOf[js.Any])
    
    inline def setTapeDriveTypeUndefined: Self = StObject.set(x, "TapeDriveType", js.undefined)
  }
}
