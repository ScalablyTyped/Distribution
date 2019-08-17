package typings.cryptojs.CryptoJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object algoNs {
  import typings.cryptojs.CryptoJSNs.libNs.Hasher
  import typings.cryptojs.CryptoJSNs.libNs.IHasher
  import typings.cryptojs.CryptoJSNs.libNs.StreamCipher

  type AES = IBlockCipherImpl
  type DES = IBlockCipherImpl
  type MD5 = Hasher
  type PBKDF2 = EvpKDF
  type RC4 = StreamCipher
  //PBKDF2 is same as EvpKDF
  type RC4Drop = RC4
  type RIPEMD160 = Hasher
  type Rabbit = StreamCipher
  type RabbitLegacy = StreamCipher
  type SHA1 = Hasher
  type SHA224 = Hasher
  type SHA256 = Hasher
  type SHA3 = IHasher[ISHA3Cfg]
  type SHA384 = Hasher
  type SHA512 = Hasher
  type TripleDES = IBlockCipherImpl
}
