package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buffersDataBufferMod {
  
  @JSImport("babylonjs/Buffers/dataBuffer", "DataBuffer")
  @js.native
  /**
    * Constructs the buffer
    */
  open class DataBuffer () extends StObject {
    
    /** Gets or sets the size of the underlying buffer */
    var capacity: Double = js.native
    
    /**
      * Gets or sets a boolean indicating if the buffer contains 32bits indices
      */
    var is32Bits: Boolean = js.native
    
    /**
      * Gets or sets the number of objects referencing this buffer
      */
    var references: Double = js.native
    
    /**
      * Gets the underlying buffer
      */
    def underlyingResource: Any = js.native
    
    /**
      * Gets the unique id of this buffer
      */
    val uniqueId: Double = js.native
  }
  /* static members */
  object DataBuffer {
    
    @JSImport("babylonjs/Buffers/dataBuffer", "DataBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Buffers/dataBuffer", "DataBuffer._Counter")
    @js.native
    def _Counter: Any = js.native
    inline def _Counter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Counter")(x.asInstanceOf[js.Any])
  }
}
