package typings.cryptojs.CryptoJSNs

import typings.std.ArrayBuffer
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNs {
  //BlockCipher has interface same as IStreamCipher
  type BlockCipher = IStreamCipher[IBlockCipherCfg]
  type Cipher = ICipher[js.Object]
  type CipherHelper = ICipherHelper[js.Object]
  type Hasher = IHasher[js.Object]
  type HasherHelper = IHasherHelper[js.Object]
  type PasswordBasedCipher = IPasswordBasedCipher[IPasswordBasedCipherCfg]
  type SerializableCipher = ISerializableCipher[ISerializableCipherCfg]
  type SomeArray = ArrayBuffer | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array
  type StreamCipher = IStreamCipher[js.Object]
}
