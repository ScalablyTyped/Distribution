package typings.chrome.chrome

import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enterprise {
  
  ////////////////////
  // Enterprise Device Attributes
  ////////////////////
  /**
    * Use the <code>chrome.enterprise.deviceAttributes</code> API to read device attributes.
    * Permissions:  "enterprise.deviceAttributes"
    * Since: Chrome 46
    * Important: This API works only on Chrome OS.
    * Note: This API is only for extensions pre-installed by policy.
    */
  object deviceAttributes
  
  ////////////////////
  // Enterprise Networking Attributes
  ////////////////////
  /**
    * Use the <code>chrome.enterprise.networkingAttributes</code> API to read information about your current network. Note: This API is only available to extensions force-installed by enterprise policy.
    * Important: This API works only on Chrome OS.
    * @since Chrome 85.
    */
  object networkingAttributes {
    
    @js.native
    trait NetworkDetails extends StObject {
      
      /** Optional. The device's local IPv4 address (undefined if not configured). */
      var ipv4: js.UndefOr[String] = js.native
      
      /** Optional. The device's local IPv6 address (undefined if not configured). */
      var ipv6: js.UndefOr[String] = js.native
      
      /** The device's MAC address. */
      var macAddress: String = js.native
    }
    object NetworkDetails {
      
      @scala.inline
      def apply(macAddress: String): NetworkDetails = {
        val __obj = js.Dynamic.literal(macAddress = macAddress.asInstanceOf[js.Any])
        __obj.asInstanceOf[NetworkDetails]
      }
      
      @scala.inline
      implicit class NetworkDetailsMutableBuilder[Self <: NetworkDetails] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIpv4(value: String): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIpv4Undefined: Self = StObject.set(x, "ipv4", js.undefined)
        
        @scala.inline
        def setIpv6(value: String): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIpv6Undefined: Self = StObject.set(x, "ipv6", js.undefined)
        
        @scala.inline
        def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
      }
    }
  }
  
  ////////////////////
  // Enterprise Platform Keys
  ////////////////////
  /**
    * Use the chrome.enterprise.platformKeys API to generate hardware-backed keys and to install certificates for these keys. The certificates will be managed by the platform and can be used for TLS authentication, network access or by other extension through chrome.platformKeys.
    * Availability: Since Chrome 37.
    * Permissions:  "enterprise.platformKeys"
    * Important: This API works only on Chrome OS.
    * Note:  This API is only for extensions pre-installed by policy.
    */
  object platformKeys {
    
    @js.native
    trait Token extends StObject {
      
      /**
        * Uniquely identifies this Token.
        * Static IDs are "user" and "system", referring to the platform's user-specific and the system-wide hardware token, respectively. Any other tokens (with other identifiers) might be returned by enterprise.platformKeys.getTokens.
        */
      var id: String = js.native
      
      /**
        * Implements the WebCrypto's SubtleCrypto interface. The cryptographic operations, including key generation, are hardware-backed.
        * Only non-extractable RSASSA-PKCS1-V1_5 keys with modulusLength up to 2048 can be generated. Each key can be used for signing data at most once.
        * Keys generated on a specific Token cannot be used with any other Tokens, nor can they be used with window.crypto.subtle. Equally, Key objects created with window.crypto.subtle cannot be used with this interface.
        */
      var subtleCrypto: SubtleCrypto = js.native
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
