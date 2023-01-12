package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientConstructOpts extends StObject {
  
  /**
    * OAuth2 access token
    */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /**
    * API key (obtain this from the coinbase website)
    */
  var apiKey: js.UndefOr[String] = js.undefined
  
  /**
    * API key secret (obtain this from the coinbase website)
    */
  var apiSecret: js.UndefOr[String] = js.undefined
  
  /**
    * Override security certificates
    */
  var caFile: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Allows disabling strict SSL
    */
  var strictSSL: js.UndefOr[Boolean] = js.undefined
  
  /**
    * API version in 'yyyy-mm-dd' format, see https://developers.coinbase.com/api/v2#changelog
    */
  var version: js.UndefOr[String] = js.undefined
}
object ClientConstructOpts {
  
  inline def apply(): ClientConstructOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConstructOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientConstructOpts] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setApiSecret(value: String): Self = StObject.set(x, "apiSecret", value.asInstanceOf[js.Any])
    
    inline def setApiSecretUndefined: Self = StObject.set(x, "apiSecret", js.undefined)
    
    inline def setCaFile(value: js.Array[String]): Self = StObject.set(x, "caFile", value.asInstanceOf[js.Any])
    
    inline def setCaFileUndefined: Self = StObject.set(x, "caFile", js.undefined)
    
    inline def setCaFileVarargs(value: String*): Self = StObject.set(x, "caFile", js.Array(value*))
    
    inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
    
    inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
