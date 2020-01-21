package typings.cryptojs.CryptoJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object algo {
  type AES = typings.cryptojs.CryptoJS.algo.IBlockCipherImpl
  type DES = typings.cryptojs.CryptoJS.algo.IBlockCipherImpl
  type MD5 = typings.cryptojs.CryptoJS.lib.Hasher
  type PBKDF2 = typings.cryptojs.CryptoJS.algo.EvpKDF
  type RC4 = typings.cryptojs.CryptoJS.lib.StreamCipher
  //PBKDF2 is same as EvpKDF
  type RC4Drop = typings.cryptojs.CryptoJS.algo.RC4
  type RIPEMD160 = typings.cryptojs.CryptoJS.lib.Hasher
  type Rabbit = typings.cryptojs.CryptoJS.lib.StreamCipher
  type RabbitLegacy = typings.cryptojs.CryptoJS.lib.StreamCipher
  type SHA1 = typings.cryptojs.CryptoJS.lib.Hasher
  type SHA224 = typings.cryptojs.CryptoJS.lib.Hasher
  type SHA256 = typings.cryptojs.CryptoJS.lib.Hasher
  type SHA3 = typings.cryptojs.CryptoJS.lib.IHasher[typings.cryptojs.CryptoJS.algo.ISHA3Cfg]
  type SHA384 = typings.cryptojs.CryptoJS.lib.Hasher
  type SHA512 = typings.cryptojs.CryptoJS.lib.Hasher
  type TripleDES = typings.cryptojs.CryptoJS.algo.IBlockCipherImpl
}
