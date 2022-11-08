package typings.blake2bWasm

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Shortcut
import typings.blake2bWasm.anon.FnCall
import typings.blake2bWasm.blake2bWasmInts.`16`
import typings.blake2bWasm.blake2bWasmInts.`32`
import typings.blake2bWasm.blake2bWasmInts.`64`
import typings.blake2bWasm.blake2bWasmStrings.binary
import typings.std.ArrayLike
import typings.std.WebAssembly.Memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("blake2b-wasm", JSImport.Namespace)
  @js.native
  /**
    * Create a new hash instance.
    *
    * @param [digestLength=32] Length of the digest.
    * @param key The key to use.
    * @param salt The salt to use.
    * @param personal The personal data to use.
    * @param noAssert Disables all input checks.
    *
    * @example
    * import blake2b = require('blake2b-wasm')
    *
    * if (!blake2b.SUPPORTED) {
    *   console.log('WebAssembly not supported by your runtime')
    * }
    *
    * blake2b.ready((err) => {
    *   if (err) throw err
    *
    *   const hash = new blake2b()
    *     .update(Buffer.from('hello')) // pass in a buffer or uint8array
    *     .update(Buffer.from(' '))
    *     .update(Buffer.from('world'))
    *     .digest('hex')
    *
    *   console.log('Blake2b hash of "hello world" is %s', hash)
    * })
    */
  open class ^ ()
    extends StObject
       with Blake2b {
    def this(digestLength: Double) = this()
    def this(digestLength: Double, key: js.typedarray.Uint8Array) = this()
    def this(digestLength: Unit, key: js.typedarray.Uint8Array) = this()
    def this(digestLength: Double, key: js.typedarray.Uint8Array, salt: js.typedarray.Uint8Array) = this()
    def this(digestLength: Double, key: Unit, salt: js.typedarray.Uint8Array) = this()
    def this(digestLength: Unit, key: js.typedarray.Uint8Array, salt: js.typedarray.Uint8Array) = this()
    def this(digestLength: Unit, key: Unit, salt: js.typedarray.Uint8Array) = this()
    def this(
      digestLength: Double,
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array
    ) = this()
    def this(
      digestLength: Double,
      key: js.typedarray.Uint8Array,
      salt: Unit,
      personal: js.typedarray.Uint8Array
    ) = this()
    def this(
      digestLength: Double,
      key: Unit,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array
    ) = this()
    def this(digestLength: Double, key: Unit, salt: Unit, personal: js.typedarray.Uint8Array) = this()
    def this(
      digestLength: Unit,
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array
    ) = this()
    def this(digestLength: Unit, key: js.typedarray.Uint8Array, salt: Unit, personal: js.typedarray.Uint8Array) = this()
    def this(digestLength: Unit, key: Unit, salt: js.typedarray.Uint8Array, personal: js.typedarray.Uint8Array) = this()
    def this(digestLength: Unit, key: Unit, salt: Unit, personal: js.typedarray.Uint8Array) = this()
    def this(
      digestLength: Double,
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array,
      noAssert: Boolean
    ) = this()
    def this(
      digestLength: Double,
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      personal: Unit,
      noAssert: Boolean
    ) = this()
    def this(
      digestLength: Double,
      key: js.typedarray.Uint8Array,
      salt: Unit,
      personal: js.typedarray.Uint8Array,
      noAssert: Boolean
    ) = this()
    def this(digestLength: Double, key: js.typedarray.Uint8Array, salt: Unit, personal: Unit, noAssert: Boolean) = this()
    def this(
      digestLength: Double,
      key: Unit,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array,
      noAssert: Boolean
    ) = this()
    def this(digestLength: Double, key: Unit, salt: js.typedarray.Uint8Array, personal: Unit, noAssert: Boolean) = this()
    def this(digestLength: Double, key: Unit, salt: Unit, personal: js.typedarray.Uint8Array, noAssert: Boolean) = this()
    def this(digestLength: Double, key: Unit, salt: Unit, personal: Unit, noAssert: Boolean) = this()
    def this(
      digestLength: Unit,
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array,
      noAssert: Boolean
    ) = this()
    def this(
      digestLength: Unit,
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      personal: Unit,
      noAssert: Boolean
    ) = this()
    def this(
      digestLength: Unit,
      key: js.typedarray.Uint8Array,
      salt: Unit,
      personal: js.typedarray.Uint8Array,
      noAssert: Boolean
    ) = this()
    def this(digestLength: Unit, key: js.typedarray.Uint8Array, salt: Unit, personal: Unit, noAssert: Boolean) = this()
    def this(
      digestLength: Unit,
      key: Unit,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array,
      noAssert: Boolean
    ) = this()
    def this(digestLength: Unit, key: Unit, salt: js.typedarray.Uint8Array, personal: Unit, noAssert: Boolean) = this()
    def this(digestLength: Unit, key: Unit, salt: Unit, personal: js.typedarray.Uint8Array, noAssert: Boolean) = this()
    def this(digestLength: Unit, key: Unit, salt: Unit, personal: Unit, noAssert: Boolean) = this()
  }
  @JSImport("blake2b-wasm", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Blake2bCtor = js.native
  
  @js.native
  trait Blake2b extends StObject {
    
    /**
      * Digest the hash.
      */
    def digest(): js.typedarray.Uint8Array = js.native
    def digest(enc: String): String = js.native
    def digest[T /* <: js.typedarray.Uint8Array */](enc: T): T = js.native
    
    var digestLength: Double = js.native
    
    @JSName("digest")
    def digest_binary(enc: binary): js.typedarray.Uint8Array = js.native
    
    /**
      * Digest the hash.
      */
    def `final`(): js.typedarray.Uint8Array = js.native
    /**
      * Digest the hash.
      */
    def `final`(enc: String): String = js.native
    /**
      * Digest the hash.
      */
    def `final`[T /* <: js.typedarray.Uint8Array */](enc: T): T = js.native
    /**
      * Digest the hash.
      */
    @JSName("final")
    var final_Original: FnCall = js.native
    @JSName("final")
    def final_binary(enc: binary): js.typedarray.Uint8Array = js.native
    
    var finalized: Boolean = js.native
    
    /**
      * @returns The current partial hash.
      */
    def getPartialHash(): js.typedarray.Uint8Array = js.native
    
    var pointer: Double = js.native
    
    def ready(): js.Promise[Unit] = js.native
    def ready(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): js.Promise[Unit] = js.native
    @JSName("ready")
    var ready_Original: js.Function1[
        /* cb */ js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]], 
        js.Promise[Unit]
      ] = js.native
    
    /**
      * Set the hash to a previously set hash.
      *
      * @param data Should be the result of `getPartialHash()`.
      */
    def setPartialHash(data: ArrayLike[Double]): Unit = js.native
    
    /**
      * Update the hash with a new piece of data.
      */
    def update(input: js.typedarray.Uint8Array): this.type = js.native
  }
  
  @js.native
  trait Blake2bCtor
    extends StObject
       with /**
    * Create a new hash instance.
    *
    * @param [digestLength=32] Length of the digest.
    * @param key The key to use.
    * @param salt The salt to use.
    * @param personal The personal data to use.
    * @param noAssert Disables all input checks.
    *
    * @example
    * import blake2b = require('blake2b-wasm')
    *
    * if (!blake2b.SUPPORTED) {
    *   console.log('WebAssembly not supported by your runtime')
    * }
    *
    * blake2b.ready((err) => {
    *   if (err) throw err
    *
    *   const hash = new blake2b()
    *     .update(Buffer.from('hello')) // pass in a buffer or uint8array
    *     .update(Buffer.from(' '))
    *     .update(Buffer.from('world'))
    *     .digest('hex')
    *
    *   console.log('Blake2b hash of "hello world" is %s', hash)
    * })
    */
  Instantiable0[Blake2b]
       with Instantiable1[/* digestLength */ Double, Blake2b]
       with Instantiable2[
          (/* digestLength */ Double) | (/* digestLength */ Unit), 
          /* key */ js.typedarray.Uint8Array, 
          Blake2b
        ]
       with Instantiable3[
          (/* digestLength */ Double) | (/* digestLength */ Unit), 
          (/* key */ js.typedarray.Uint8Array) | (/* key */ Unit), 
          /* salt */ js.typedarray.Uint8Array, 
          Blake2b
        ]
       with Instantiable4[
          (/* digestLength */ Double) | (/* digestLength */ Unit), 
          (/* key */ js.typedarray.Uint8Array) | (/* key */ Unit), 
          (/* salt */ js.typedarray.Uint8Array) | (/* salt */ Unit), 
          /* personal */ js.typedarray.Uint8Array, 
          Blake2b
        ]
       with Instantiable5[
          (/* digestLength */ Double) | (/* digestLength */ Unit), 
          (/* key */ js.typedarray.Uint8Array) | (/* key */ Unit), 
          (/* salt */ js.typedarray.Uint8Array) | (/* salt */ Unit), 
          (/* personal */ js.typedarray.Uint8Array) | (/* personal */ Unit), 
          /* noAssert */ Boolean, 
          Blake2b
        ] {
    
    /**
      * Create a new hash instance.
      *
      * @param [digestLength=32] Length of the digest.
      * @param key The key to use.
      * @param salt The salt to use.
      * @param personal The personal data to use.
      * @param noAssert Disables all input checks.
      *
      * @example
      * import blake2b = require('blake2b-wasm')
      *
      * if (!blake2b.SUPPORTED) {
      *   console.log('WebAssembly not supported by your runtime')
      * }
      *
      * blake2b.ready((err) => {
      *   if (err) throw err
      *
      *   const hash = blake2b()
      *     .update(Buffer.from('hello')) // pass in a buffer or uint8array
      *     .update(Buffer.from(' '))
      *     .update(Buffer.from('world'))
      *     .digest('hex')
      *
      *   console.log('Blake2b hash of "hello world" is %s', hash)
      * })
      */
    def apply(): Blake2b = js.native
    def apply(digestLength: Double): Blake2b = js.native
    def apply(digestLength: Double, key: js.typedarray.Uint8Array): Blake2b = js.native
    def apply(digestLength: Double, key: js.typedarray.Uint8Array, salt: js.typedarray.Uint8Array): Blake2b = js.native
    def apply(
      digestLength: Double,
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array
    ): Blake2b = js.native
    def apply(
      digestLength: Double,
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array,
      noAssert: Boolean
    ): Blake2b = js.native
    def apply(
      digestLength: Double,
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      personal: Unit,
      noAssert: Boolean
    ): Blake2b = js.native
    def apply(
      digestLength: Double,
      key: js.typedarray.Uint8Array,
      salt: Unit,
      personal: js.typedarray.Uint8Array
    ): Blake2b = js.native
    def apply(
      digestLength: Double,
      key: js.typedarray.Uint8Array,
      salt: Unit,
      personal: js.typedarray.Uint8Array,
      noAssert: Boolean
    ): Blake2b = js.native
    def apply(digestLength: Double, key: js.typedarray.Uint8Array, salt: Unit, personal: Unit, noAssert: Boolean): Blake2b = js.native
    def apply(digestLength: Double, key: Unit, salt: js.typedarray.Uint8Array): Blake2b = js.native
    def apply(
      digestLength: Double,
      key: Unit,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array
    ): Blake2b = js.native
    def apply(
      digestLength: Double,
      key: Unit,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array,
      noAssert: Boolean
    ): Blake2b = js.native
    def apply(digestLength: Double, key: Unit, salt: js.typedarray.Uint8Array, personal: Unit, noAssert: Boolean): Blake2b = js.native
    def apply(digestLength: Double, key: Unit, salt: Unit, personal: js.typedarray.Uint8Array): Blake2b = js.native
    def apply(digestLength: Double, key: Unit, salt: Unit, personal: js.typedarray.Uint8Array, noAssert: Boolean): Blake2b = js.native
    def apply(digestLength: Double, key: Unit, salt: Unit, personal: Unit, noAssert: Boolean): Blake2b = js.native
    def apply(digestLength: Unit, key: js.typedarray.Uint8Array): Blake2b = js.native
    def apply(digestLength: Unit, key: js.typedarray.Uint8Array, salt: js.typedarray.Uint8Array): Blake2b = js.native
    def apply(
      digestLength: Unit,
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array
    ): Blake2b = js.native
    def apply(
      digestLength: Unit,
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array,
      noAssert: Boolean
    ): Blake2b = js.native
    def apply(
      digestLength: Unit,
      key: js.typedarray.Uint8Array,
      salt: js.typedarray.Uint8Array,
      personal: Unit,
      noAssert: Boolean
    ): Blake2b = js.native
    def apply(digestLength: Unit, key: js.typedarray.Uint8Array, salt: Unit, personal: js.typedarray.Uint8Array): Blake2b = js.native
    def apply(
      digestLength: Unit,
      key: js.typedarray.Uint8Array,
      salt: Unit,
      personal: js.typedarray.Uint8Array,
      noAssert: Boolean
    ): Blake2b = js.native
    def apply(digestLength: Unit, key: js.typedarray.Uint8Array, salt: Unit, personal: Unit, noAssert: Boolean): Blake2b = js.native
    def apply(digestLength: Unit, key: Unit, salt: js.typedarray.Uint8Array): Blake2b = js.native
    def apply(digestLength: Unit, key: Unit, salt: js.typedarray.Uint8Array, personal: js.typedarray.Uint8Array): Blake2b = js.native
    def apply(
      digestLength: Unit,
      key: Unit,
      salt: js.typedarray.Uint8Array,
      personal: js.typedarray.Uint8Array,
      noAssert: Boolean
    ): Blake2b = js.native
    def apply(digestLength: Unit, key: Unit, salt: js.typedarray.Uint8Array, personal: Unit, noAssert: Boolean): Blake2b = js.native
    def apply(digestLength: Unit, key: Unit, salt: Unit, personal: js.typedarray.Uint8Array): Blake2b = js.native
    def apply(digestLength: Unit, key: Unit, salt: Unit, personal: js.typedarray.Uint8Array, noAssert: Boolean): Blake2b = js.native
    def apply(digestLength: Unit, key: Unit, salt: Unit, personal: Unit, noAssert: Boolean): Blake2b = js.native
    
    val BYTES: `32` = js.native
    
    val BYTES_MAX: `64` = js.native
    
    val BYTES_MIN: `16` = js.native
    
    val KEYBYTES: `32` = js.native
    
    val KEYBYTES_MAX: `64` = js.native
    
    val KEYBYTES_MIN: `16` = js.native
    
    val PERSONALBYTES: `16` = js.native
    
    val SALTBYTES: `16` = js.native
    
    val SUPPORTED: Boolean = js.native
    
    val WASM: Blake2bWasm | Null = js.native
    
    /**
      * Wait for the WASM code to load. Returns the WebAssembly instance promise as well for convenience.
      * You have to call this at least once before instantiating the hash.
      */
    def ready(): js.Promise[Unit] = js.native
    def ready(cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): js.Promise[Unit] = js.native
  }
  
  trait Blake2bWasm extends StObject {
    
    def blake2b_compress(pointer: Double): Unit
    
    def blake2b_final(pointer: Double): Unit
    
    def blake2b_init(pointer: Double, digestLength: Double): Unit
    
    def blake2b_update(pointer: Double, start: Double, end: Double): Unit
    
    var memory: Memory
  }
  object Blake2bWasm {
    
    inline def apply(
      blake2b_compress: Double => Unit,
      blake2b_final: Double => Unit,
      blake2b_init: (Double, Double) => Unit,
      blake2b_update: (Double, Double, Double) => Unit,
      memory: Memory
    ): Blake2bWasm = {
      val __obj = js.Dynamic.literal(blake2b_compress = js.Any.fromFunction1(blake2b_compress), blake2b_final = js.Any.fromFunction1(blake2b_final), blake2b_init = js.Any.fromFunction2(blake2b_init), blake2b_update = js.Any.fromFunction3(blake2b_update), memory = memory.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blake2bWasm]
    }
    
    extension [Self <: Blake2bWasm](x: Self) {
      
      inline def setBlake2b_compress(value: Double => Unit): Self = StObject.set(x, "blake2b_compress", js.Any.fromFunction1(value))
      
      inline def setBlake2b_final(value: Double => Unit): Self = StObject.set(x, "blake2b_final", js.Any.fromFunction1(value))
      
      inline def setBlake2b_init(value: (Double, Double) => Unit): Self = StObject.set(x, "blake2b_init", js.Any.fromFunction2(value))
      
      inline def setBlake2b_update(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "blake2b_update", js.Any.fromFunction3(value))
      
      inline def setMemory(value: Memory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Object & Blake2bCtor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Blake2bCtor = ^
}
