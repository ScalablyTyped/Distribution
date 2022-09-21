package typings.blake2b

import typings.blake2b.blake2bNumbers.`16`
import typings.blake2b.blake2bNumbers.`32`
import typings.blake2b.blake2bNumbers.`64`
import typings.blake2b.blake2bStrings.binary
import typings.blake2b.blake2bStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new hash instance, optionally with `key`, `salt` and
    * `personal`. Bypass input assertions by setting `noAssert` to `true`.
    *
    * All parameters must fulfill the following constraints, or an
    * `AssertionError` will be thrown (unless `noAssert = true`):
    *
    * * `outLength` must within the byte ranges defined by the constants below.
    * * `key` is optional, but must within the byte ranges defined by the constants
    *    below, if given. This value must be kept secret, and can be used to create
    *    prefix-MACs.
    * * `salt` is optional, but must be exactly `SALTBYTES`, if given. You can use
    *   this parameter as a kind of per user id, or local versioning scheme. This
    *   value is not required to be secret.
    * * `personal` is optional, but must be exactly `PERSONALBYTES`, if given. You can
    *   use this parameter as a kind of app id, or global versioning scheme. This
    *   value is not required to be secret.
    *
    * @example
    * import blake2b = require('blake2b')
    *
    * const output = new Uint8Array(64)
    * const input = Buffer.from('hello world')
    *
    * console.log('hash:', blake2b(output.length).update(input).digest('hex'))
    */
  inline def apply(outLength: Double): Blake2b = ^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any]).asInstanceOf[Blake2b]
  inline def apply(outLength: Double, key: js.typedarray.Uint8Array): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(outLength: Double, key: js.typedarray.Uint8Array, salt: js.typedarray.Uint8Array): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(
    outLength: Double,
    key: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    personal: js.typedarray.Uint8Array
  ): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], personal.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(
    outLength: Double,
    key: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    personal: js.typedarray.Uint8Array,
    /** @default false */
  noAssert: Boolean
  ): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], personal.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(
    outLength: Double,
    key: js.typedarray.Uint8Array,
    salt: js.typedarray.Uint8Array,
    personal: Unit,
    /** @default false */
  noAssert: Boolean
  ): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], personal.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(outLength: Double, key: js.typedarray.Uint8Array, salt: Unit, personal: js.typedarray.Uint8Array): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], personal.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(
    outLength: Double,
    key: js.typedarray.Uint8Array,
    salt: Unit,
    personal: js.typedarray.Uint8Array,
    /** @default false */
  noAssert: Boolean
  ): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], personal.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(
    outLength: Double,
    key: js.typedarray.Uint8Array,
    salt: Unit,
    personal: Unit,
    /** @default false */
  noAssert: Boolean
  ): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], personal.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(outLength: Double, key: Unit, salt: js.typedarray.Uint8Array): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(outLength: Double, key: Unit, salt: js.typedarray.Uint8Array, personal: js.typedarray.Uint8Array): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], personal.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(
    outLength: Double,
    key: Unit,
    salt: js.typedarray.Uint8Array,
    personal: js.typedarray.Uint8Array,
    /** @default false */
  noAssert: Boolean
  ): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], personal.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(
    outLength: Double,
    key: Unit,
    salt: js.typedarray.Uint8Array,
    personal: Unit,
    /** @default false */
  noAssert: Boolean
  ): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], personal.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(outLength: Double, key: Unit, salt: Unit, personal: js.typedarray.Uint8Array): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], personal.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(
    outLength: Double,
    key: Unit,
    salt: Unit,
    personal: js.typedarray.Uint8Array,
    /** @default false */
  noAssert: Boolean
  ): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], personal.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  inline def apply(outLength: Double, key: Unit, salt: Unit, personal: Unit, /** @default false */
  noAssert: Boolean): Blake2b = (^.asInstanceOf[js.Dynamic].apply(outLength.asInstanceOf[js.Any], key.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], personal.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[Blake2b]
  
  @JSImport("blake2b", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Recommended default length of `out` */
  @JSImport("blake2b", "BYTES")
  @js.native
  val BYTES: `32` = js.native
  
  /** Maximum length of `out` */
  @JSImport("blake2b", "BYTES_MAX")
  @js.native
  val BYTES_MAX: `64` = js.native
  
  /** Minimum length of `out` */
  @JSImport("blake2b", "BYTES_MIN")
  @js.native
  val BYTES_MIN: `16` = js.native
  
  /** Recommended default length of `key` */
  @JSImport("blake2b", "KEYBYTES")
  @js.native
  val KEYBYTES: `32` = js.native
  
  /** Maximum length of `key` */
  @JSImport("blake2b", "KEYBYTES_MAX")
  @js.native
  val KEYBYTES_MAX: `64` = js.native
  
  /** Minimum length of `key` */
  @JSImport("blake2b", "KEYBYTES_MIN")
  @js.native
  val KEYBYTES_MIN: `16` = js.native
  
  /** Required length of `personal` */
  @JSImport("blake2b", "PERSONALBYTES")
  @js.native
  val PERSONALBYTES: `16` = js.native
  
  /** Required length of `salt` */
  @JSImport("blake2b", "SALTBYTES")
  @js.native
  val SALTBYTES: `16` = js.native
  
  @JSImport("blake2b", "WASM_LOADED")
  @js.native
  val WASM_LOADED: Boolean = js.native
  
  @JSImport("blake2b", "WASM_SUPPORTED")
  @js.native
  val WASM_SUPPORTED: Boolean = js.native
  
  inline def ready(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait Blake2b extends StObject {
    
    /**
      * Finalise the the hash and write the digest to `out`. `out` must be exactly equal
      * to `outLength` given in the `blake2b` method.
      *
      * Optionally you can pass `hex` to get the hash as a hex string or no arguments
      * to have the hash return a new Uint8Array with the hash.
      */
    def digest(): js.typedarray.Uint8Array = js.native
    def digest[TBuffer /* <: js.typedarray.Uint8Array */](out: TBuffer): TBuffer = js.native
    @JSName("digest")
    def digest_binary(out: binary): js.typedarray.Uint8Array = js.native
    @JSName("digest")
    def digest_hex(out: hex): String = js.native
    
    /**
      * Update the hash with new `input`. Calling this method after `.digest` will throw
      * an error.
      */
    def update(input: js.typedarray.Uint8Array): this.type = js.native
  }
}
