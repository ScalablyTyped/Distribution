package typings.cborg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blMod {
  
  @JSImport("cborg/types/lib/bl", "Bl")
  @js.native
  /**
    * @param {number} [chunkSize]
    */
  open class Bl () extends StObject {
    def this(chunkSize: Double) = this()
    
    /** @type {Uint8Array|number[]|null} */
    var _initReuseChunk: js.typedarray.Uint8Array | js.Array[Double] | Null = js.native
    
    var chunkSize: Double = js.native
    
    /** @type {(Uint8Array|number[])[]} */
    var chunks: js.Array[js.typedarray.Uint8Array | js.Array[Double]] = js.native
    
    /** @type {number} */
    var cursor: Double = js.native
    
    /** @type {number} */
    var maxCursor: Double = js.native
    
    def push(bytes: js.Array[Double]): Unit = js.native
    /**
      * @param {Uint8Array|number[]} bytes
      */
    def push(bytes: js.typedarray.Uint8Array): Unit = js.native
    
    def reset(): Unit = js.native
    
    /**
      * @param {boolean} [reset]
      * @returns {Uint8Array}
      */
    def toBytes(): js.typedarray.Uint8Array = js.native
    def toBytes(reset: Boolean): js.typedarray.Uint8Array = js.native
  }
}
