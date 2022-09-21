package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateOriginationIdentityRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you don't specify a client token, a randomly generated token is used for the request to ensure idempotency.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.ClientToken] = js.undefined
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region. 
    */
  var IsoCountryCode: typings.awsSdk.pinpointsmsvoicev2Mod.IsoCountryCode
  
  /**
    * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use DescribePhoneNumbers find the values for PhoneNumberId and PhoneNumberArn, or use DescribeSenderIds to get the values for SenderId and SenderIdArn.
    */
  var OriginationIdentity: PhoneOrSenderIdOrArn
  
  /**
    * The unique identifier for the pool to disassociate with the origination identity. This value can be either the PoolId or PoolArn.
    */
  var PoolId: PoolIdOrArn
}
object DisassociateOriginationIdentityRequest {
  
  inline def apply(IsoCountryCode: IsoCountryCode, OriginationIdentity: PhoneOrSenderIdOrArn, PoolId: PoolIdOrArn): DisassociateOriginationIdentityRequest = {
    val __obj = js.Dynamic.literal(IsoCountryCode = IsoCountryCode.asInstanceOf[js.Any], OriginationIdentity = OriginationIdentity.asInstanceOf[js.Any], PoolId = PoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateOriginationIdentityRequest]
  }
  
  extension [Self <: DisassociateOriginationIdentityRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setIsoCountryCode(value: IsoCountryCode): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentity(value: PhoneOrSenderIdOrArn): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
    
    inline def setPoolId(value: PoolIdOrArn): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
  }
}
