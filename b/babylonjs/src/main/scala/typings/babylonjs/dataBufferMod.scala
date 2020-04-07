package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/dataBuffer", JSImport.Namespace)
@js.native
object dataBufferMod extends js.Object {
  @js.native
  class DataBuffer () extends js.Object {
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
    def underlyingResource(): js.Any = js.native
  }
  
}

