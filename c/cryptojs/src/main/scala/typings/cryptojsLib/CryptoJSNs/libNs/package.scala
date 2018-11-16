package typings
package cryptojsLib.CryptoJSNs

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
  type SomeArray = stdLib.ArrayBuffer | stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array
  type StreamCipher = IStreamCipher[js.Object]
}
