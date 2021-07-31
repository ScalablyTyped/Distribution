package typings.chromeApps.chrome

import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enterprise {
  
  // #endregion
  // #region chrome.enterprise.*
  ////////////////
  // ENTERPRISE //
  ////////////////
  /**
    * @requires Permissions: 'enterprise.deviceAttributes'
    * @requires Note: This API is only available to apps force-installed by enterprise policy.
    * @requires(CrOS) Only available on Chrome OS.
    * @since Chrome 46.
    * @description
    * Use the chrome.enterprise.deviceAttributes API to read device attributes.
    */
  object deviceAttributes
  
  /**
    * @requires Permissions: 'enterprise.platformKeys'
    * @requires Note: This API is only available to apps force-installed by enterprise policy.
    * @requires(CrOS) Only available on Chrome OS.
    * @description
    * Use the chrome.enterprise.platformKeys API to generate hardware-backed keys and to install certificates for these keys.
    * The certificates will be managed by the platform and can be used for TLS authentication, network access or by other extension through chrome.platformKeys.
    * @see[Documentation]{@link https://developer.chrome.com/extensions/enterprise_platformKeys}
    */
  object platformKeys {
    
    trait Token extends StObject {
      
      /**
        * Uniquely identifies this Token.
        * Static IDs are 'user' and 'system', referring to the platform's user-specific and the system-wide hardware token, respectively.
        * Any other tokens (with other identifiers) might be returned by enterprise.platformKeys.getTokens.
        */
      var id: String
      
      /**
        * Implements the WebCrypto's SubtleCrypto interface.
        * The cryptographic operations, including key generation, are hardware-backed.
        * Only non-extractable RSASSA-PKCS1-V1_5 keys with modulusLength up to 2048 can be generated.
        * Each key can be used for signing data at most once.
        * Keys generated on a specific Token cannot be used with any other Tokens,
        * nor can they be used with window.crypto.subtle. Equally,
        * Key objects created with window.crypto.subtle cannot be used with this interface.
        */
      var subtleCrypto: SubtleCrypto
    }
    object Token {
      
      @scala.inline
      def apply(id: String, subtleCrypto: SubtleCrypto): Token = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], subtleCrypto = subtleCrypto.asInstanceOf[js.Any])
        __obj.asInstanceOf[Token]
      }
      
      @scala.inline
      implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtleCrypto(value: SubtleCrypto): Self = StObject.set(x, "subtleCrypto", value.asInstanceOf[js.Any])
      }
    }
  }
}
