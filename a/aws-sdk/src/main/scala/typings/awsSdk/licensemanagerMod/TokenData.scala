package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenData extends StObject {
  
  /**
    * Token expiration time, in ISO8601-UTC format.
    */
  var ExpirationTime: js.UndefOr[ISO8601DateTime] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the license.
    */
  var LicenseArn: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Names (ARN) of the roles included in the token.
    */
  var RoleArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * Token status. The possible values are AVAILABLE and DELETED.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * Token ID.
    */
  var TokenId: js.UndefOr[String] = js.undefined
  
  /**
    * Data specified by the caller.
    */
  var TokenProperties: js.UndefOr[MaxSize3StringList] = js.undefined
  
  /**
    * Type of token generated. The supported value is REFRESH_TOKEN.
    */
  var TokenType: js.UndefOr[String] = js.undefined
}
object TokenData {
  
  inline def apply(): TokenData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenData]
  }
  
  extension [Self <: TokenData](x: Self) {
    
    inline def setExpirationTime(value: ISO8601DateTime): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    inline def setLicenseArn(value: String): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseArnUndefined: Self = StObject.set(x, "LicenseArn", js.undefined)
    
    inline def setRoleArns(value: ArnList): Self = StObject.set(x, "RoleArns", value.asInstanceOf[js.Any])
    
    inline def setRoleArnsUndefined: Self = StObject.set(x, "RoleArns", js.undefined)
    
    inline def setRoleArnsVarargs(value: Arn*): Self = StObject.set(x, "RoleArns", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTokenId(value: String): Self = StObject.set(x, "TokenId", value.asInstanceOf[js.Any])
    
    inline def setTokenIdUndefined: Self = StObject.set(x, "TokenId", js.undefined)
    
    inline def setTokenProperties(value: MaxSize3StringList): Self = StObject.set(x, "TokenProperties", value.asInstanceOf[js.Any])
    
    inline def setTokenPropertiesUndefined: Self = StObject.set(x, "TokenProperties", js.undefined)
    
    inline def setTokenPropertiesVarargs(value: String*): Self = StObject.set(x, "TokenProperties", js.Array(value*))
    
    inline def setTokenType(value: String): Self = StObject.set(x, "TokenType", value.asInstanceOf[js.Any])
    
    inline def setTokenTypeUndefined: Self = StObject.set(x, "TokenType", js.undefined)
  }
}
