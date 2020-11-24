package typings.cryptojs.CryptoJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object lib {
  
  //BlockCipher has interface same as IStreamCipher
  type BlockCipher = typings.cryptojs.CryptoJS.lib.IStreamCipher[typings.cryptojs.CryptoJS.lib.IBlockCipherCfg]
  
  type Cipher = typings.cryptojs.CryptoJS.lib.ICipher[js.Object]
  
  type CipherHelper = typings.cryptojs.CryptoJS.lib.ICipherHelper[js.Object]
  
  type Hasher = typings.cryptojs.CryptoJS.lib.IHasher[js.Object]
  
  type HasherHelper = typings.cryptojs.CryptoJS.lib.IHasherHelper[js.Object]
  
  type PasswordBasedCipher = typings.cryptojs.CryptoJS.lib.IPasswordBasedCipher[typings.cryptojs.CryptoJS.lib.IPasswordBasedCipherCfg]
  
  type SerializableCipher = typings.cryptojs.CryptoJS.lib.ISerializableCipher[typings.cryptojs.CryptoJS.lib.ISerializableCipherCfg]
  
  type SomeArray = typings.std.ArrayBuffer | typings.std.Int8Array | typings.std.Int16Array | typings.std.Int32Array | typings.std.Uint8Array | typings.std.Uint16Array | typings.std.Uint32Array
  
  type StreamCipher = typings.cryptojs.CryptoJS.lib.IStreamCipher[js.Object]
}
