package typings
package chromeDashAppsLib.chromeNs.enterpriseNs.platformKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Token extends js.Object {
  /**
               * Uniquely identifies this Token.
               * Static IDs are 'user' and 'system', referring to the platform's user-specific and the system-wide hardware token, respectively.
               * Any other tokens (with other identifiers) might be returned by enterprise.platformKeys.getTokens.
               */
  var id: java.lang.String
  /**
               * Implements the WebCrypto's SubtleCrypto interface.
               * The cryptographic operations, including key generation, are hardware-backed.
               * Only non-extractable RSASSA-PKCS1-V1_5 keys with modulusLength up to 2048 can be generated.
               * Each key can be used for signing data at most once.
               * Keys generated on a specific Token cannot be used with any other Tokens,
               * nor can they be used with window.crypto.subtle. Equally,
               * Key objects created with window.crypto.subtle cannot be used with this interface.
               */
  var subtleCrypto: stdLib.SubtleCrypto
}

