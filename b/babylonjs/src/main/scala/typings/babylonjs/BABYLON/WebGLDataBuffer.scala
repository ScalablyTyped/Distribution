package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLDataBuffer extends DataBuffer {
  var _buffer: js.Any
}

object WebGLDataBuffer {
  @scala.inline
  def apply(
    _buffer: js.Any,
    capacity: Double,
    is32Bits: Boolean,
    references: Double,
    underlyingResource: () => js.Any
  ): WebGLDataBuffer = {
    val __obj = js.Dynamic.literal(_buffer = _buffer.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], is32Bits = is32Bits.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], underlyingResource = js.Any.fromFunction0(underlyingResource))
    __obj.asInstanceOf[WebGLDataBuffer]
  }
}

