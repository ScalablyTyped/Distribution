package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for accessors for natively-stored mesh data buffers.
  */
trait NativeDataBuffer extends DataBuffer {
  /**
    * Accessor value used to identify/retrieve a natively-stored index buffer.
    */
  var nativeIndexBuffer: js.UndefOr[js.Any] = js.undefined
  /**
    * Accessor value used to identify/retrieve a natively-stored vertex buffer.
    */
  var nativeVertexBuffer: js.UndefOr[js.Any] = js.undefined
}

object NativeDataBuffer {
  @scala.inline
  def apply(
    capacity: Double,
    is32Bits: Boolean,
    references: Double,
    underlyingResource: () => js.Any,
    nativeIndexBuffer: js.Any = null,
    nativeVertexBuffer: js.Any = null
  ): NativeDataBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], is32Bits = is32Bits.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], underlyingResource = js.Any.fromFunction0(underlyingResource))
    if (nativeIndexBuffer != null) __obj.updateDynamic("nativeIndexBuffer")(nativeIndexBuffer.asInstanceOf[js.Any])
    if (nativeVertexBuffer != null) __obj.updateDynamic("nativeVertexBuffer")(nativeVertexBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeDataBuffer]
  }
}

