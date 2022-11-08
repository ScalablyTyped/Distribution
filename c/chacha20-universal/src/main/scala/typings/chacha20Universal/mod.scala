package typings.chacha20Universal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new xor instance.
    *
    * @param nonce Should be a 12 byte buffer.
    * @param key Should be 32 byte buffer.
    * @param counter An optional counter value.
    *
    * @example
    * import * as crypto from 'node:crypto'
    * import Chacha20 = require('chacha20-universal')
    *
    * const key = crypto.randomBytes(32)
    * const nonce = crypto.randomBytes(24)
    * const out = Buffer.alloc(5)
    * const xor = new Chacha20(nonce, key)
    *
    * xor.update(out, Buffer.from('hello'))
    * xor.update(out, Buffer.from('world'))
    *
    * console.log(out)
    * // e.g. <Buffer 7c 77 23 51 f9>
    *
    * xor.final()
    */
  @JSImport("chacha20-universal", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Chacha20 {
    def this(nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array) = this()
    def this(nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array, counter: Double) = this()
    
    /**
      * Call this method last. Clears internal state.
      */
    /* CompleteClass */
    override def `final`(): Unit = js.native
    
    /* CompleteClass */
    override val finalized: Boolean = js.native
    
    /* CompleteClass */
    override val pos: Double = js.native
    
    /* CompleteClass */
    override val state: js.typedarray.Uint32Array = js.native
    
    /**
      * Update the xor instance.
      *
      * @param output The result buffer to write the output to. `output` should be the same byte length as `input`.
      * @param input The buffer with new input to mix.
      */
    /* CompleteClass */
    override def update(output: js.typedarray.Uint8Array, input: js.typedarray.Uint8Array): Unit = js.native
  }
  
  /**
    * Create a new xor instance.
    *
    * @param nonce Should be a 12 byte buffer.
    * @param key Should be 32 byte buffer.
    * @param counter An optional counter value.
    *
    * @example
    * import * as crypto from 'node:crypto'
    * import Chacha20 = require('chacha20-universal')
    *
    * const key = crypto.randomBytes(32)
    * const nonce = crypto.randomBytes(24)
    * const out = Buffer.alloc(5)
    * const xor = new Chacha20(nonce, key)
    *
    * xor.update(out, Buffer.from('hello'))
    * xor.update(out, Buffer.from('world'))
    *
    * console.log(out)
    * // e.g. <Buffer 7c 77 23 51 f9>
    *
    * xor.final()
    */
  trait Chacha20 extends StObject {
    
    /**
      * Call this method last. Clears internal state.
      */
    def `final`(): Unit
    
    val finalized: Boolean
    
    val pos: Double
    
    val state: js.typedarray.Uint32Array
    
    /**
      * Update the xor instance.
      *
      * @param output The result buffer to write the output to. `output` should be the same byte length as `input`.
      * @param input The buffer with new input to mix.
      */
    def update(output: js.typedarray.Uint8Array, input: js.typedarray.Uint8Array): Unit
  }
  object Chacha20 {
    
    inline def apply(
      `final`: () => Unit,
      finalized: Boolean,
      pos: Double,
      state: js.typedarray.Uint32Array,
      update: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Unit
    ): Chacha20 = {
      val __obj = js.Dynamic.literal(finalized = finalized.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
      __obj.updateDynamic("final")(js.Any.fromFunction0(`final`))
      __obj.asInstanceOf[Chacha20]
    }
    
    extension [Self <: Chacha20](x: Self) {
      
      inline def setFinal(value: () => Unit): Self = StObject.set(x, "final", js.Any.fromFunction0(value))
      
      inline def setFinalized(value: Boolean): Self = StObject.set(x, "finalized", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setState(value: js.typedarray.Uint32Array): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
}
