package typings
package cryptojsLib.CryptoJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object algoNs {
  type AES = IBlockCipherImpl
  type DES = IBlockCipherImpl
  type MD5 = cryptojsLib.CryptoJSNs.libNs.Hasher
  type PBKDF2 = EvpKDF
  type RC4 = cryptojsLib.CryptoJSNs.libNs.StreamCipher
  //PBKDF2 is same as EvpKDF
  type RC4Drop = RC4
  type RIPEMD160 = cryptojsLib.CryptoJSNs.libNs.Hasher
  type Rabbit = cryptojsLib.CryptoJSNs.libNs.StreamCipher
  type RabbitLegacy = cryptojsLib.CryptoJSNs.libNs.StreamCipher
  type SHA1 = cryptojsLib.CryptoJSNs.libNs.Hasher
  type SHA224 = cryptojsLib.CryptoJSNs.libNs.Hasher
  type SHA256 = cryptojsLib.CryptoJSNs.libNs.Hasher
  type SHA3 = cryptojsLib.CryptoJSNs.libNs.IHasher[ISHA3Cfg]
  type SHA384 = cryptojsLib.CryptoJSNs.libNs.Hasher
  type SHA512 = cryptojsLib.CryptoJSNs.libNs.Hasher
  type TripleDES = IBlockCipherImpl
}
