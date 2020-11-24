package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for accessors for natively-stored mesh data buffers.
  */
@js.native
trait NativeDataBuffer extends DataBuffer {
  
  /**
    * Accessor value used to identify/retrieve a natively-stored index buffer.
    */
  var nativeIndexBuffer: js.UndefOr[js.Any] = js.native
  
  /**
    * Accessor value used to identify/retrieve a natively-stored vertex buffer.
    */
  var nativeVertexBuffer: js.UndefOr[js.Any] = js.native
}
