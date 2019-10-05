package typings.chromeDashApps.chrome.platformKeys

import typings.std.ArrayBuffer
import typings.std.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.platformKeys.getKeyPair")
@js.native
object getKeyPair extends js.Object {
  /**
    * @description
    * Passes the key pair of *certificate* for usage with
    * platformKeys.subtleCrypto to *callback*.
    *
    * ❗ Note:
    * Currently, this function only supports the "RSASSA-PKCS1-v1_5"
    * algorithm with one of the hashing algorithms "none", "SHA-1", "SHA-256",
    * "SHA-384", and "SHA-512"
    *
    * @param certificate The certificate of a *Match* returned by *selectClientCertificates*.
    * @param parameters Determines signature/hash algorithm parameters additionally to the parameters fixed by the key itself.
    *   The same parameters are accepted as by WebCrypto's importKey (see docs).
    *   function, e.g. *RsaHashedImportParams* for a RSASSA-PKCS1-v1_5
    *   key. For RSASSA-PKCS1-v1_5 keys, additionally the parameters *{
    *   "hash": { "name": "none" } }* are supported. The sign function will
    *   then apply PKCS#1 v1.5 padding and but not hash the given data.
    * @param callback The public and private CryptoKey of a certificate which can only be used with *subleCrypto*.
    * @param callback.privateKey Might be *null* if this app does not have access to it.
    * @param callback.privateKey
    * @see[WebCrypto's importKey docs]{@link http://www.w3.org/TR/WebCryptoAPI/#SubtleCrypto-method-importKey}
    * @see[CryptoKey docs]{@link http://www.w3.org/TR/WebCryptoAPI/#dfn-CryptoKey}
    */
  def apply(
    certificate: ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit = js.native
}

