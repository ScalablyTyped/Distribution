package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataBuffer extends js.Object {
  /** Gets or sets the size of the underlying buffer */
  var capacity: Double
  /**
    * Gets or sets a boolean indicating if the buffer contains 32bits indices
    */
  var is32Bits: Boolean
  /**
    * Gets or sets the number of objects referencing this buffer
    */
  var references: Double
  /**
    * Gets the underlying buffer
    */
  def underlyingResource: js.Any
}

object DataBuffer {
  @scala.inline
  def apply(capacity: Double, is32Bits: Boolean, references: Double, underlyingResource: () => js.Any): DataBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], is32Bits = is32Bits.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], underlyingResource = js.Any.fromFunction0(underlyingResource))
    __obj.asInstanceOf[DataBuffer]
  }
}

