package typings.cryptojs.CryptoJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object algo {
  import typings.cryptojs.CryptoJS.lib.IHasher
  import typings.cryptojs.CryptoJS.lib.IStreamCipher

  type AES = IBlockCipherImpl
  type DES = IBlockCipherImpl
  type MD5 = IHasher[js.Object]
  type PBKDF2 = EvpKDF
  type RC4 = IStreamCipher[js.Object]
  //PBKDF2 is same as EvpKDF
  type RC4Drop = IStreamCipher[js.Object]
  type RIPEMD160 = IHasher[js.Object]
  type Rabbit = IStreamCipher[js.Object]
  type RabbitLegacy = IStreamCipher[js.Object]
  type SHA1 = IHasher[js.Object]
  type SHA224 = IHasher[js.Object]
  type SHA256 = IHasher[js.Object]
  type SHA3 = IHasher[ISHA3Cfg]
  type SHA384 = IHasher[js.Object]
  type SHA512 = IHasher[js.Object]
  type TripleDES = IBlockCipherImpl
}
