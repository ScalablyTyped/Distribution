package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGetSetVerticesData extends StObject {
  
  /**
    * Returns an array of integers or a typed array (Int32Array, Uint32Array, Uint16Array) populated with the mesh indices.
    * @param copyWhenShared If true (default false) and and if the mesh geometry is shared among some other meshes, the returned array is a copy of the internal one.
    * @param forceCopy defines a boolean indicating that the returned array must be cloned upon returning it
    * @returns the indices array or an empty array if the mesh has no geometry
    */
  def getIndices(): Nullable[IndicesArray] = js.native
  def getIndices(copyWhenShared: js.UndefOr[scala.Nothing], forceCopy: Boolean): Nullable[IndicesArray] = js.native
  def getIndices(copyWhenShared: Boolean): Nullable[IndicesArray] = js.native
  def getIndices(copyWhenShared: Boolean, forceCopy: Boolean): Nullable[IndicesArray] = js.native
  
  /**
    * Gets a specific vertex data attached to this geometry. Float data is constructed if the vertex buffer data cannot be returned directly.
    * @param kind defines the data kind (Position, normal, etc...)
    * @param copyWhenShared defines if the returned array must be cloned upon returning it if the current geometry is shared between multiple meshes
    * @param forceCopy defines a boolean indicating that the returned array must be cloned upon returning it
    * @returns a float array containing vertex data
    */
  def getVerticesData(kind: String): Nullable[FloatArray] = js.native
  def getVerticesData(kind: String, copyWhenShared: js.UndefOr[scala.Nothing], forceCopy: Boolean): Nullable[FloatArray] = js.native
  def getVerticesData(kind: String, copyWhenShared: Boolean): Nullable[FloatArray] = js.native
  def getVerticesData(kind: String, copyWhenShared: Boolean, forceCopy: Boolean): Nullable[FloatArray] = js.native
  
  /**
    * Gets a boolean indicating if specific vertex data is present
    * @param kind defines the vertex data kind to use
    * @returns true is data kind is present
    */
  def isVerticesDataPresent(kind: String): Boolean = js.native
  
  /**
    * Creates a new index buffer
    * @param indices defines the indices to store in the index buffer
    * @param totalVertices defines the total number of vertices (could be null)
    * @param updatable defines if the index buffer must be flagged as updatable (false by default)
    */
  def setIndices(indices: IndicesArray, totalVertices: Nullable[Double]): Unit = js.native
  def setIndices(indices: IndicesArray, totalVertices: Nullable[Double], updatable: Boolean): Unit = js.native
  
  /**
    * Set specific vertex data
    * @param kind defines the data kind (Position, normal, etc...)
    * @param data defines the vertex data to use
    * @param updatable defines if the vertex must be flagged as updatable (false as default)
    * @param stride defines the stride to use (0 by default). This value is deduced from the kind value if not specified
    */
  def setVerticesData(kind: String, data: FloatArray, updatable: Boolean): Unit = js.native
  
  /**
    * Update a specific associated vertex buffer
    * @param kind defines which buffer to write to (positions, indices, normals, etc). Possible `kind` values :
    * - VertexBuffer.PositionKind
    * - VertexBuffer.UVKind
    * - VertexBuffer.UV2Kind
    * - VertexBuffer.UV3Kind
    * - VertexBuffer.UV4Kind
    * - VertexBuffer.UV5Kind
    * - VertexBuffer.UV6Kind
    * - VertexBuffer.ColorKind
    * - VertexBuffer.MatricesIndicesKind
    * - VertexBuffer.MatricesIndicesExtraKind
    * - VertexBuffer.MatricesWeightsKind
    * - VertexBuffer.MatricesWeightsExtraKind
    * @param data defines the data source
    * @param updateExtends defines if extends info of the mesh must be updated (can be null). This is mostly useful for "position" kind
    * @param makeItUnique defines if the geometry associated with the mesh must be cloned to make the change only for this mesh (and not all meshes associated with the same geometry)
    */
  def updateVerticesData(kind: String, data: FloatArray): Unit = js.native
  def updateVerticesData(kind: String, data: FloatArray, updateExtends: js.UndefOr[scala.Nothing], makeItUnique: Boolean): Unit = js.native
  def updateVerticesData(kind: String, data: FloatArray, updateExtends: Boolean): Unit = js.native
  def updateVerticesData(kind: String, data: FloatArray, updateExtends: Boolean, makeItUnique: Boolean): Unit = js.native
}
