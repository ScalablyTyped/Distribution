package typings.babylonjs.engineDynamicBufferMod

import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.typesMod.DataArray
import typings.babylonjs.typesMod.IndicesArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Engines/thinEngine", JSImport.Namespace)
@js.native
object babylonjsEnginesThinEngineAugmentingMod extends js.Object {
  
  @js.native
  trait ThinEngine extends js.Object {
    
    /**
      * Update a dynamic index buffer
      * @param indexBuffer defines the target index buffer
      * @param indices defines the data to update
      * @param offset defines the offset in the target index buffer where update should start
      */
    def updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: IndicesArray): Unit = js.native
    def updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: IndicesArray, offset: Double): Unit = js.native
    
    /**
      * Updates a dynamic vertex buffer.
      * @param vertexBuffer the vertex buffer to update
      * @param data the data used to update the vertex buffer
      * @param byteOffset the byte offset of the data
      * @param byteLength the byte length of the data
      */
    def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray): Unit = js.native
    def updateDynamicVertexBuffer(
      vertexBuffer: DataBuffer,
      data: DataArray,
      byteOffset: js.UndefOr[scala.Nothing],
      byteLength: Double
    ): Unit = js.native
    def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray, byteOffset: Double): Unit = js.native
    def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray, byteOffset: Double, byteLength: Double): Unit = js.native
  }
}
