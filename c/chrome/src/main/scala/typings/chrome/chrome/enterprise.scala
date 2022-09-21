package typings.chrome.chrome

import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enterprise {
  
  ////////////////////
  // Enterprise Networking Attributes
  ////////////////////
  /**
    * Use the <code>chrome.enterprise.networkingAttributes</code> API to read information about your current network. Note: This API is only available to extensions force-installed by enterprise policy.
    * Important: This API works only on Chrome OS.
    * @since Chrome 85.
    */
  object networkingAttributes {
    
    trait NetworkDetails extends StObject {
      
      /** Optional. The device's local IPv4 address (undefined if not configured). */
      var ipv4: js.UndefOr[String] = js.undefined
      
      /** Optional. The device's local IPv6 address (undefined if not configured). */
      var ipv6: js.UndefOr[String] = js.undefined
      
      /** The device's MAC address. */
      var macAddress: String
    }
    object NetworkDetails {
      
      inline def apply(macAddress: String): NetworkDetails = {
        val __obj = js.Dynamic.literal(macAddress = macAddress.asInstanceOf[js.Any])
        __obj.asInstanceOf[NetworkDetails]
      }
      
      extension [Self <: NetworkDetails](x: Self) {
        
        inline def setIpv4(value: String): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
        
        inline def setIpv4Undefined: Self = StObject.set(x, "ipv4", js.undefined)
        
        inline def setIpv6(value: String): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
        
        inline def setIpv6Undefined: Self = StObject.set(x, "ipv6", js.undefined)
        
        inline def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
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
    
    trait Token extends StObject {
      
      /**
        * Uniquely identifies this Token.
        * Static IDs are "user" and "system", referring to the platform's user-specific and the system-wide hardware token, respectively. Any other tokens (with other identifiers) might be returned by enterprise.platformKeys.getTokens.
        */
      var id: String
      
      /**
        * Implements the WebCrypto's SubtleCrypto interface. The cryptographic operations, including key generation, are software-backed.
        * Protection of the keys, and thus implementation of the non-extractable property, is done in software, so the keys are less protected than hardware-backed keys.
        * Only non-extractable RSASSA-PKCS1-V1_5 keys with modulusLength up to 2048 can be generated. Each key can be used for signing data at most once.
        * Keys generated on a specific Token cannot be used with any other Tokens, nor can they be used with window.crypto.subtle. Equally, Key objects created with window.crypto.subtle cannot be used with this interface.
        * @since Chrome 97.
        */
      var softwareBackedSubtleCrypto: SubtleCrypto
      
      /**
        * Implements the WebCrypto's SubtleCrypto interface. The cryptographic operations, including key generation, are hardware-backed.
        * Only non-extractable RSASSA-PKCS1-V1_5 keys with modulusLength up to 2048 and ECDSA with namedCurve P-256 can be generated. Each key can be used for signing data at most once.
        * Keys generated on a specific Token cannot be used with any other Tokens, nor can they be used with window.crypto.subtle. Equally, Key objects created with window.crypto.subtle cannot be used with this interface.
        */
      var subtleCrypto: SubtleCrypto
    }
    object Token {
      
      inline def apply(id: String, softwareBackedSubtleCrypto: SubtleCrypto, subtleCrypto: SubtleCrypto): Token = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], softwareBackedSubtleCrypto = softwareBackedSubtleCrypto.asInstanceOf[js.Any], subtleCrypto = subtleCrypto.asInstanceOf[js.Any])
        __obj.asInstanceOf[Token]
      }
      
      extension [Self <: Token](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setSoftwareBackedSubtleCrypto(value: SubtleCrypto): Self = StObject.set(x, "softwareBackedSubtleCrypto", value.asInstanceOf[js.Any])
        
        inline def setSubtleCrypto(value: SubtleCrypto): Self = StObject.set(x, "subtleCrypto", value.asInstanceOf[js.Any])
      }
    }
  }
}
