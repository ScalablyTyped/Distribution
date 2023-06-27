package typings.chromeApps.chrome

import typings.std.SubtleCrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enterprise {
  
  /**
    * @requires Permissions: 'enterprise.platformKeys'
    * @requires Note: This API is only available to apps force-installed by enterprise policy.
    * @requires Only available on Chrome OS.
    * @description
    * Use the chrome.enterprise.platformKeys API to generate hardware-backed keys and to install certificates for these keys.
    * The certificates will be managed by the platform and can be used for TLS authentication, network access or by other extension through chrome.platformKeys.
    * @see https://developer.chrome.com/extensions/enterprise_platformKeys
    */
  object platformKeys {
    
    /**
      * Type of key to generate.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.chromeApps.chromeAppsStrings.RSA
      - typings.chromeApps.chromeAppsStrings.ECDSA
    */
    trait Algorithm extends StObject
    object Algorithm {
      
      inline def ECDSA: typings.chromeApps.chromeAppsStrings.ECDSA = "ECDSA".asInstanceOf[typings.chromeApps.chromeAppsStrings.ECDSA]
      
      inline def RSA: typings.chromeApps.chromeAppsStrings.RSA = "RSA".asInstanceOf[typings.chromeApps.chromeAppsStrings.RSA]
    }
    
    trait ChallengeKeyOptions extends StObject {
      
      /**
        * A challenge as emitted by the Verified Access Web API.
        */
      var challenge: js.typedarray.ArrayBuffer
      
      /**
        * If present, registers the challenged key with the specified
        * scope's token. The key can then be associated with a certificate
        * and used like any other signing key. Subsequent calls to this
        * function will then generate a new Enterprise Key in the specified
        * scope.
        */
      var registerKey: js.UndefOr[RegisterKeyOptions] = js.undefined
      
      /**
        * Which Enterprise Key to challenge.
        */
      var scope: Scope
    }
    object ChallengeKeyOptions {
      
      inline def apply(challenge: js.typedarray.ArrayBuffer, scope: Scope): ChallengeKeyOptions = {
        val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
        __obj.asInstanceOf[ChallengeKeyOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ChallengeKeyOptions] (val x: Self) extends AnyVal {
        
        inline def setChallenge(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
        
        inline def setRegisterKey(value: RegisterKeyOptions): Self = StObject.set(x, "registerKey", value.asInstanceOf[js.Any])
        
        inline def setRegisterKeyUndefined: Self = StObject.set(x, "registerKey", js.undefined)
        
        inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      }
    }
    
    trait RegisterKeyOptions extends StObject {
      
      /**
        * Which algorithm the registered key should use.
        */
      var algorithm: Algorithm
    }
    object RegisterKeyOptions {
      
      inline def apply(algorithm: Algorithm): RegisterKeyOptions = {
        val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
        __obj.asInstanceOf[RegisterKeyOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RegisterKeyOptions] (val x: Self) extends AnyVal {
        
        inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Whether to use the Enterprise User Key or the Enterprise Machine Key.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.chromeApps.chromeAppsStrings.MACHINE
      - typings.chromeApps.chromeAppsStrings.USER
    */
    trait Scope extends StObject
    object Scope {
      
      inline def MACHINE: typings.chromeApps.chromeAppsStrings.MACHINE = "MACHINE".asInstanceOf[typings.chromeApps.chromeAppsStrings.MACHINE]
      
      inline def USER: typings.chromeApps.chromeAppsStrings.USER = "USER".asInstanceOf[typings.chromeApps.chromeAppsStrings.USER]
    }
    
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
      
      inline def apply(id: String, subtleCrypto: SubtleCrypto): Token = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], subtleCrypto = subtleCrypto.asInstanceOf[js.Any])
        __obj.asInstanceOf[Token]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setSubtleCrypto(value: SubtleCrypto): Self = StObject.set(x, "subtleCrypto", value.asInstanceOf[js.Any])
      }
    }
  }
}
