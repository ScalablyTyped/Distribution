package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for accessors for natively-stored mesh data buffers.
  */
@js.native
trait NativeDataBuffer
  extends StObject
     with DataBuffer {
  
  /**
    * Accessor value used to identify/retrieve a natively-stored index buffer.
    */
  var nativeIndexBuffer: js.UndefOr[js.typedarray.Uint32Array] = js.native
  
  /**
    * Accessor value used to identify/retrieve a natively-stored vertex buffer.
    */
  var nativeVertexBuffer: js.UndefOr[js.typedarray.Uint32Array] = js.native
}
