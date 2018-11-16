package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Define an interface for all classes that will get and set the data on vertices
     */
@js.native
trait IGetSetVerticesData extends js.Object {
  /**
           * Returns an array of integers or a typed array (Int32Array, Uint32Array, Uint16Array) populated with the mesh indices.
           * @param copyWhenShared If true (default false) and and if the mesh geometry is shared among some other meshes, the returned array is a copy of the internal one.
           * @param forceCopy defines a boolean indicating that the returned array must be cloned upon returning it
           * @returns the indices array or an empty array if the mesh has no geometry
           */
  def getIndices(): Nullable[IndicesArray] = js.native
  /**
           * Returns an array of integers or a typed array (Int32Array, Uint32Array, Uint16Array) populated with the mesh indices.
           * @param copyWhenShared If true (default false) and and if the mesh geometry is shared among some other meshes, the returned array is a copy of the internal one.
           * @param forceCopy defines a boolean indicating that the returned array must be cloned upon returning it
           * @returns the indices array or an empty array if the mesh has no geometry
           */
  def getIndices(copyWhenShared: scala.Boolean): Nullable[IndicesArray] = js.native
  /**
           * Returns an array of integers or a typed array (Int32Array, Uint32Array, Uint16Array) populated with the mesh indices.
           * @param copyWhenShared If true (default false) and and if the mesh geometry is shared among some other meshes, the returned array is a copy of the internal one.
           * @param forceCopy defines a boolean indicating that the returned array must be cloned upon returning it
           * @returns the indices array or an empty array if the mesh has no geometry
           */
  def getIndices(copyWhenShared: scala.Boolean, forceCopy: scala.Boolean): Nullable[IndicesArray] = js.native
  /**
           * Gets a specific vertex data attached to this geometry. Float data is constructed if the vertex buffer data cannot be returned directly.
           * @param kind defines the data kind (Position, normal, etc...)
           * @param copyWhenShared defines if the returned array must be cloned upon returning it if the current geometry is shared between multiple meshes
           * @param forceCopy defines a boolean indicating that the returned array must be cloned upon returning it
           * @returns a float array containing vertex data
           */
  def getVerticesData(kind: java.lang.String): Nullable[FloatArray] = js.native
  /**
           * Gets a specific vertex data attached to this geometry. Float data is constructed if the vertex buffer data cannot be returned directly.
           * @param kind defines the data kind (Position, normal, etc...)
           * @param copyWhenShared defines if the returned array must be cloned upon returning it if the current geometry is shared between multiple meshes
           * @param forceCopy defines a boolean indicating that the returned array must be cloned upon returning it
           * @returns a float array containing vertex data
           */
  def getVerticesData(kind: java.lang.String, copyWhenShared: scala.Boolean): Nullable[FloatArray] = js.native
  /**
           * Gets a specific vertex data attached to this geometry. Float data is constructed if the vertex buffer data cannot be returned directly.
           * @param kind defines the data kind (Position, normal, etc...)
           * @param copyWhenShared defines if the returned array must be cloned upon returning it if the current geometry is shared between multiple meshes
           * @param forceCopy defines a boolean indicating that the returned array must be cloned upon returning it
           * @returns a float array containing vertex data
           */
  def getVerticesData(kind: java.lang.String, copyWhenShared: scala.Boolean, forceCopy: scala.Boolean): Nullable[FloatArray] = js.native
  /**
           * Gets a boolean indicating if specific vertex data is present
           * @param kind defines the vertex data kind to use
           * @returns true is data kind is present
           */
  def isVerticesDataPresent(kind: java.lang.String): scala.Boolean = js.native
  /**
           * Creates a new index buffer
           * @param indices defines the indices to store in the index buffer
           * @param totalVertices defines the total number of vertices (could be null)
           * @param updatable defines if the index buffer must be flagged as updatable (false by default)
           */
  def setIndices(indices: IndicesArray, totalVertices: Nullable[scala.Double]): scala.Unit = js.native
  /**
           * Creates a new index buffer
           * @param indices defines the indices to store in the index buffer
           * @param totalVertices defines the total number of vertices (could be null)
           * @param updatable defines if the index buffer must be flagged as updatable (false by default)
           */
  def setIndices(indices: IndicesArray, totalVertices: Nullable[scala.Double], updatable: scala.Boolean): scala.Unit = js.native
  /**
           * Set specific vertex data
           * @param kind defines the data kind (Position, normal, etc...)
           * @param data defines the vertex data to use
           * @param updatable defines if the vertex must be flagged as updatable (false as default)
           * @param stride defines the stride to use (0 by default). This value is deduced from the kind value if not specified
           */
  def setVerticesData(kind: java.lang.String, data: FloatArray, updatable: scala.Boolean): scala.Unit = js.native
  /**
           * Update a specific associated vertex buffer
           * @param kind defines which buffer to write to (positions, indices, normals, etc). Possible `kind` values :
           * - BABYLON.VertexBuffer.PositionKind
           * - BABYLON.VertexBuffer.UVKind
           * - BABYLON.VertexBuffer.UV2Kind
           * - BABYLON.VertexBuffer.UV3Kind
           * - BABYLON.VertexBuffer.UV4Kind
           * - BABYLON.VertexBuffer.UV5Kind
           * - BABYLON.VertexBuffer.UV6Kind
           * - BABYLON.VertexBuffer.ColorKind
           * - BABYLON.VertexBuffer.MatricesIndicesKind
           * - BABYLON.VertexBuffer.MatricesIndicesExtraKind
           * - BABYLON.VertexBuffer.MatricesWeightsKind
           * - BABYLON.VertexBuffer.MatricesWeightsExtraKind
           * @param data defines the data source
           * @param updateExtends defines if extends info of the mesh must be updated (can be null). This is mostly useful for "position" kind
           * @param makeItUnique defines if the geometry associated with the mesh must be cloned to make the change only for this mesh (and not all meshes associated with the same geometry)
           */
  def updateVerticesData(kind: java.lang.String, data: FloatArray): scala.Unit = js.native
  /**
           * Update a specific associated vertex buffer
           * @param kind defines which buffer to write to (positions, indices, normals, etc). Possible `kind` values :
           * - BABYLON.VertexBuffer.PositionKind
           * - BABYLON.VertexBuffer.UVKind
           * - BABYLON.VertexBuffer.UV2Kind
           * - BABYLON.VertexBuffer.UV3Kind
           * - BABYLON.VertexBuffer.UV4Kind
           * - BABYLON.VertexBuffer.UV5Kind
           * - BABYLON.VertexBuffer.UV6Kind
           * - BABYLON.VertexBuffer.ColorKind
           * - BABYLON.VertexBuffer.MatricesIndicesKind
           * - BABYLON.VertexBuffer.MatricesIndicesExtraKind
           * - BABYLON.VertexBuffer.MatricesWeightsKind
           * - BABYLON.VertexBuffer.MatricesWeightsExtraKind
           * @param data defines the data source
           * @param updateExtends defines if extends info of the mesh must be updated (can be null). This is mostly useful for "position" kind
           * @param makeItUnique defines if the geometry associated with the mesh must be cloned to make the change only for this mesh (and not all meshes associated with the same geometry)
           */
  def updateVerticesData(kind: java.lang.String, data: FloatArray, updateExtends: scala.Boolean): scala.Unit = js.native
  /**
           * Update a specific associated vertex buffer
           * @param kind defines which buffer to write to (positions, indices, normals, etc). Possible `kind` values :
           * - BABYLON.VertexBuffer.PositionKind
           * - BABYLON.VertexBuffer.UVKind
           * - BABYLON.VertexBuffer.UV2Kind
           * - BABYLON.VertexBuffer.UV3Kind
           * - BABYLON.VertexBuffer.UV4Kind
           * - BABYLON.VertexBuffer.UV5Kind
           * - BABYLON.VertexBuffer.UV6Kind
           * - BABYLON.VertexBuffer.ColorKind
           * - BABYLON.VertexBuffer.MatricesIndicesKind
           * - BABYLON.VertexBuffer.MatricesIndicesExtraKind
           * - BABYLON.VertexBuffer.MatricesWeightsKind
           * - BABYLON.VertexBuffer.MatricesWeightsExtraKind
           * @param data defines the data source
           * @param updateExtends defines if extends info of the mesh must be updated (can be null). This is mostly useful for "position" kind
           * @param makeItUnique defines if the geometry associated with the mesh must be cloned to make the change only for this mesh (and not all meshes associated with the same geometry)
           */
  def updateVerticesData(
    kind: java.lang.String,
    data: FloatArray,
    updateExtends: scala.Boolean,
    makeItUnique: scala.Boolean
  ): scala.Unit = js.native
}

