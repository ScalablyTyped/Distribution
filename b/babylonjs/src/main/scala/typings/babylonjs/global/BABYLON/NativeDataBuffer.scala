package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for accessors for natively-stored mesh data buffers.
  */
@JSGlobal("BABYLON.NativeDataBuffer")
@js.native
class NativeDataBuffer ()
  extends typings.babylonjs.BABYLON.NativeDataBuffer {
  /** Gets or sets the size of the underlying buffer */
  /* CompleteClass */
  override var capacity: Double = js.native
  /**
    * Gets or sets a boolean indicating if the buffer contains 32bits indices
    */
  /* CompleteClass */
  override var is32Bits: Boolean = js.native
  /**
    * Gets or sets the number of objects referencing this buffer
    */
  /* CompleteClass */
  override var references: Double = js.native
  /**
    * Gets the underlying buffer
    */
  /* CompleteClass */
  override def underlyingResource: js.Any = js.native
}

