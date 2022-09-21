package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateOriginationIdentityResult extends StObject {
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
    */
  var IsoCountryCode: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.IsoCountryCode] = js.undefined
  
  /**
    * The PhoneNumberId or SenderId of the origination identity.
    */
  var OriginationIdentity: js.UndefOr[String] = js.undefined
  
  /**
    * The PhoneNumberArn or SenderIdArn of the origination identity.
    */
  var OriginationIdentityArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the pool.
    */
  var PoolArn: js.UndefOr[String] = js.undefined
  
  /**
    * The PoolId of the pool no longer associated with the origination identity.
    */
  var PoolId: js.UndefOr[String] = js.undefined
}
object DisassociateOriginationIdentityResult {
  
  inline def apply(): DisassociateOriginationIdentityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateOriginationIdentityResult]
  }
  
  extension [Self <: DisassociateOriginationIdentityResult](x: Self) {
    
    inline def setIsoCountryCode(value: IsoCountryCode): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setIsoCountryCodeUndefined: Self = StObject.set(x, "IsoCountryCode", js.undefined)
    
    inline def setOriginationIdentity(value: String): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentityArn(value: String): Self = StObject.set(x, "OriginationIdentityArn", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentityArnUndefined: Self = StObject.set(x, "OriginationIdentityArn", js.undefined)
    
    inline def setOriginationIdentityUndefined: Self = StObject.set(x, "OriginationIdentity", js.undefined)
    
    inline def setPoolArn(value: String): Self = StObject.set(x, "PoolArn", value.asInstanceOf[js.Any])
    
    inline def setPoolArnUndefined: Self = StObject.set(x, "PoolArn", js.undefined)
    
    inline def setPoolId(value: String): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
  }
}
