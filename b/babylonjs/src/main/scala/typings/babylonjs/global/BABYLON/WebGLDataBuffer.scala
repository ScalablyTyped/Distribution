package typings.babylonjs.global.BABYLON

import typings.std.WebGLBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebGLDataBuffer")
@js.native
class WebGLDataBuffer protected ()
  extends typings.babylonjs.BABYLON.WebGLDataBuffer {
  def this(resource: WebGLBuffer) = this()
  /* CompleteClass */
  override var _buffer: js.Any = js.native
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

