package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConstructOpts extends StObject {
  
  /**
    * OAuth2 access token
    */
  var accessToken: js.UndefOr[String] = js.native
  
  /**
    * API key (obtain this from the coinbase website)
    */
  var apiKey: js.UndefOr[String] = js.native
  
  /**
    * API key secret (obtain this from the coinbase website)
    */
  var apiSecret: js.UndefOr[String] = js.native
  
  /**
    * API version in 'yyyy-mm-dd' format, see https://developers.coinbase.com/api/v2#changelog
    */
  var version: js.UndefOr[String] = js.native
}
object ClientConstructOpts {
  
  @scala.inline
  def apply(): ClientConstructOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConstructOpts]
  }
  
  @scala.inline
  implicit class ClientConstructOptsMutableBuilder[Self <: ClientConstructOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    @scala.inline
    def setApiSecret(value: String): Self = StObject.set(x, "apiSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiSecretUndefined: Self = StObject.set(x, "apiSecret", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
