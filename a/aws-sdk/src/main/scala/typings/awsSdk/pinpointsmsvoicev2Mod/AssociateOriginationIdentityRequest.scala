package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateOriginationIdentityRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify a client token, a randomly generated token is used for the request to ensure idempotency.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.ClientToken] = js.undefined
  
  /**
    * The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the origination identity.
    */
  var IsoCountryCode: typings.awsSdk.pinpointsmsvoicev2Mod.IsoCountryCode
  
  /**
    * The origination identity to use, such as PhoneNumberId, PhoneNumberArn, SenderId, or SenderIdArn. You can use DescribePhoneNumbers to find the values for PhoneNumberId and PhoneNumberArn, while DescribeSenderIds can be used to get the values for SenderId and SenderIdArn.
    */
  var OriginationIdentity: PhoneOrSenderIdOrArn
  
  /**
    * The pool to update with the new Identity. This value can be either the PoolId or PoolArn, and you can find these values using DescribePools.
    */
  var PoolId: PoolIdOrArn
}
object AssociateOriginationIdentityRequest {
  
  inline def apply(IsoCountryCode: IsoCountryCode, OriginationIdentity: PhoneOrSenderIdOrArn, PoolId: PoolIdOrArn): AssociateOriginationIdentityRequest = {
    val __obj = js.Dynamic.literal(IsoCountryCode = IsoCountryCode.asInstanceOf[js.Any], OriginationIdentity = OriginationIdentity.asInstanceOf[js.Any], PoolId = PoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateOriginationIdentityRequest]
  }
  
  extension [Self <: AssociateOriginationIdentityRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setIsoCountryCode(value: IsoCountryCode): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentity(value: PhoneOrSenderIdOrArn): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
    
    inline def setPoolId(value: PoolIdOrArn): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
  }
}
