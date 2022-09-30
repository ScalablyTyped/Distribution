package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Minimum
import typings.std.WebGLVertexArrayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry
  extends StObject
     with IGetSetVerticesData {
  
  /* private */ var _applyToMesh: Any = js.native
  
  /**
    * @internal
    */
  def _bind(effect: Nullable[Effect]): Unit = js.native
  def _bind(
    effect: Nullable[Effect],
    indexToBind: Unit,
    overrideVertexBuffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]]
  ): Unit = js.native
  def _bind(
    effect: Nullable[Effect],
    indexToBind: Unit,
    overrideVertexBuffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]],
    overrideVertexArrayObjects: org.scalablytyped.runtime.StringDictionary[WebGLVertexArrayObject]
  ): Unit = js.native
  def _bind(
    effect: Nullable[Effect],
    indexToBind: Unit,
    overrideVertexBuffers: Unit,
    overrideVertexArrayObjects: org.scalablytyped.runtime.StringDictionary[WebGLVertexArrayObject]
  ): Unit = js.native
  def _bind(effect: Nullable[Effect], indexToBind: Nullable[DataBuffer]): Unit = js.native
  def _bind(
    effect: Nullable[Effect],
    indexToBind: Nullable[DataBuffer],
    overrideVertexBuffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]]
  ): Unit = js.native
  def _bind(
    effect: Nullable[Effect],
    indexToBind: Nullable[DataBuffer],
    overrideVertexBuffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]],
    overrideVertexArrayObjects: org.scalablytyped.runtime.StringDictionary[WebGLVertexArrayObject]
  ): Unit = js.native
  def _bind(
    effect: Nullable[Effect],
    indexToBind: Nullable[DataBuffer],
    overrideVertexBuffers: Unit,
    overrideVertexArrayObjects: org.scalablytyped.runtime.StringDictionary[WebGLVertexArrayObject]
  ): Unit = js.native
  
  /* private */ var _boundingBias: Any = js.native
  
  /** @internal */
  var _boundingInfo: Nullable[BoundingInfo] = js.native
  
  /** @internal */
  var _delayInfo: js.Array[String] = js.native
  
  /** @internal */
  var _delayLoadingFunction: Nullable[js.Function2[/* any */ Any, /* geometry */ this.type, Unit]] = js.native
  
  /* private */ var _disposeVertexArrayObjects: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  /* private */ var _extend: Any = js.native
  
  /** @internal */
  def _generatePointsArray(): Boolean = js.native
  
  /* private */ var _indexBuffer: Any = js.native
  
  /* private */ var _indexBufferIsUpdatable: Any = js.native
  
  /** @internal */
  var _indices: IndicesArray = js.native
  
  /* private */ var _isDisposed: Any = js.native
  
  /** @internal */
  var _loadedUniqueId: String = js.native
  
  /* private */ var _meshes: Any = js.native
  
  /* private */ var _notifyUpdate: Any = js.native
  
  /** @internal */
  var _parentContainer: Nullable[AbstractScene] = js.native
  
  /** @internal */
  var _positions: Nullable[js.Array[Vector3]] = js.native
  
  /* private */ var _positionsCache: Any = js.native
  
  /* private */ var _queueLoad: Any = js.native
  
  /** @internal */
  def _rebuild(): Unit = js.native
  
  /**
    * @internal
    */
  def _releaseVertexArrayObject(): Unit = js.native
  def _releaseVertexArrayObject(effect: Nullable[Effect]): Unit = js.native
  
  /** @internal */
  def _resetPointsArrayCache(): Unit = js.native
  
  /* private */ var _scene: Any = js.native
  
  /** @internal */
  var _softwareSkinningFrameId: Double = js.native
  
  /* private */ var _toNumberArray: Any = js.native
  
  /* private */ var _totalVertices: Any = js.native
  
  /* private */ var _updatable: Any = js.native
  
  /* private */ var _updateBoundingInfo: Any = js.native
  
  /* private */ var _updateExtend: Any = js.native
  
  /* private */ var _vertexArrayObjects: Any = js.native
  
  /** @internal */
  var _vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer] = js.native
  
  /**
    * Apply current geometry to a given mesh
    * @param mesh defines the mesh to apply geometry to
    */
  def applyToMesh(mesh: Mesh): Unit = js.native
  
  /**
    *  Gets or sets the Bias Vector to apply on the bounding elements (box/sphere), the max extend is computed as v += v * bias.x + bias.y, the min is computed as v -= v * bias.x + bias.y
    */
  def boundingBias: Vector2 = js.native
  /**
    *  Gets or sets the Bias Vector to apply on the bounding elements (box/sphere), the max extend is computed as v += v * bias.x + bias.y, the min is computed as v -= v * bias.x + bias.y
    */
  def boundingBias_=(value: Vector2): Unit = js.native
  
  /**
    * Release any memory retained by the cached data on the Geometry.
    *
    * Call this function to reduce memory footprint of the mesh.
    * Vertex buffers will not store CPU data anymore (this will prevent picking, collisions or physics to work correctly)
    */
  def clearCachedData(): Unit = js.native
  
  /**
    * Clone the current geometry into a new geometry
    * @param id defines the unique ID of the new geometry
    * @returns a new geometry object
    */
  def copy(id: String): Geometry = js.native
  
  /**
    * Gets the delay loading state of the geometry (none by default which means not delayed)
    */
  var delayLoadState: Double = js.native
  
  /**
    * Gets the file containing the data to load when running in delay load state
    */
  var delayLoadingFile: Nullable[String] = js.native
  
  /**
    * Free all associated resources
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets a value indicating that the geometry should not be serialized
    */
  def doNotSerialize: Boolean = js.native
  
  /**
    * Gets the current extend of the geometry
    */
  def extend: Minimum = js.native
  
  /**
    * Gets the hosting engine
    * @returns the hosting Engine
    */
  def getEngine(): Engine = js.native
  
  /**
    * Gets the index buffer
    * @returns the index buffer
    */
  def getIndexBuffer(): Nullable[DataBuffer] = js.native
  
  /**
    * Gets the hosting scene
    * @returns the hosting Scene
    */
  def getScene(): Scene = js.native
  
  /**
    * Return the total number of indices
    * @returns the total number of indices
    */
  def getTotalIndices(): Double = js.native
  
  /**
    * Gets total number of vertices
    * @returns the total number of vertices
    */
  def getTotalVertices(): Double = js.native
  
  /**
    * Gets a specific vertex buffer
    * @param kind defines the data kind (Position, normal, etc...)
    * @returns a VertexBuffer
    */
  def getVertexBuffer(kind: String): Nullable[VertexBuffer] = js.native
  
  /**
    * Returns all vertex buffers
    * @returns an object holding all vertex buffers indexed by kind
    */
  def getVertexBuffers(): Nullable[org.scalablytyped.runtime.StringDictionary[VertexBuffer]] = js.native
  
  /**
    * Gets a list of all attached data kinds (Position, normal, etc...)
    * @returns a list of string containing all kinds
    */
  def getVerticesDataKinds(): js.Array[String] = js.native
  
  /**
    * Gets or sets the ID of the geometry
    */
  var id: String = js.native
  
  /**
    * Gets a value indicating if the geometry is disposed
    * @returns true if the geometry was disposed
    */
  def isDisposed(): Boolean = js.native
  
  /**
    * Defines if the geometry is ready to use
    * @returns true if the geometry is ready to be used
    */
  def isReady(): Boolean = js.native
  
  /**
    * Returns a boolean defining if the vertex data for the requested `kind` is updatable
    * @param kind defines the data kind (Position, normal, etc...)
    * @returns true if the vertex buffer with the specified kind is updatable
    */
  def isVertexBufferUpdatable(kind: String): Boolean = js.native
  
  /**
    * Load the geometry if it was flagged as delay loaded
    * @param scene defines the hosting scene
    * @param onLoaded defines a callback called when the geometry is loaded
    */
  def load(scene: Scene): Unit = js.native
  def load(scene: Scene, onLoaded: js.Function0[Unit]): Unit = js.native
  
  /** Get the list of meshes using this geometry */
  def meshes: js.Array[Mesh] = js.native
  
  /**
    * Callback called when the geometry is updated
    */
  def onGeometryUpdated(geometry: Geometry): Unit = js.native
  def onGeometryUpdated(geometry: Geometry, kind: String): Unit = js.native
  
  /**
    * Release the associated resources for a specific mesh
    * @param mesh defines the source mesh
    * @param shouldDispose defines if the geometry must be disposed if there is no more mesh pointing to it
    */
  def releaseForMesh(mesh: Mesh): Unit = js.native
  def releaseForMesh(mesh: Mesh, shouldDispose: Boolean): Unit = js.native
  
  /**
    * Removes a specific vertex data
    * @param kind defines the data kind (Position, normal, etc...)
    */
  def removeVerticesData(kind: String): Unit = js.native
  
  /**
    * Serialize the current geometry info (and not the vertices data) into a JSON object
    * @returns a JSON representation of the current geometry data (without the vertices data)
    */
  def serialize(): Any = js.native
  
  /**
    * Serialize all vertices data into a JSON object
    * @returns a JSON representation of the current geometry data
    */
  def serializeVerticeData(): Any = js.native
  
  /**
    * Affects all geometry data in one call
    * @param vertexData defines the geometry data
    * @param updatable defines if the geometry must be flagged as updatable (false as default)
    */
  def setAllVerticesData(vertexData: VertexData): Unit = js.native
  def setAllVerticesData(vertexData: VertexData, updatable: Boolean): Unit = js.native
  
  /**
    * Creates a new index buffer
    * @param indices defines the indices to store in the index buffer
    * @param totalVertices defines the total number of vertices (could be null)
    * @param updatable defines if the index buffer must be flagged as updatable (false by default)
    */
  def setIndices(indices: IndicesArray): Unit = js.native
  def setIndices(indices: IndicesArray, totalVertices: Unit, updatable: Boolean): Unit = js.native
  
  /**
    * Affect a vertex buffer to the geometry. the vertexBuffer.getKind() function is used to determine where to store the data
    * @param buffer defines the vertex buffer to use
    * @param totalVertices defines the total number of vertices for position kind (could be null)
    * @param disposeExistingBuffer disposes the existing buffer, if any (default: true)
    */
  def setVerticesBuffer(buffer: VertexBuffer): Unit = js.native
  def setVerticesBuffer(buffer: VertexBuffer, totalVertices: Unit, disposeExistingBuffer: Boolean): Unit = js.native
  def setVerticesBuffer(buffer: VertexBuffer, totalVertices: Nullable[Double]): Unit = js.native
  def setVerticesBuffer(buffer: VertexBuffer, totalVertices: Nullable[Double], disposeExistingBuffer: Boolean): Unit = js.native
  
  /**
    * Set specific vertex data
    * @param kind defines the data kind (Position, normal, etc...)
    * @param data defines the vertex data to use
    * @param updatable defines if the vertex must be flagged as updatable (false as default)
    * @param stride defines the stride to use (0 by default). This value is deduced from the kind value if not specified
    */
  def setVerticesData(kind: String, data: FloatArray): Unit = js.native
  def setVerticesData(kind: String, data: FloatArray, updatable: Boolean, stride: Double): Unit = js.native
  def setVerticesData(kind: String, data: FloatArray, updatable: Unit, stride: Double): Unit = js.native
  
  /**
    * Invert the geometry to move from a right handed system to a left handed one.
    */
  def toLeftHanded(): Unit = js.native
  
  /**
    * Gets or sets the unique ID of the geometry
    */
  var uniqueId: Double = js.native
  
  /**
    * Update index buffer
    * @param indices defines the indices to store in the index buffer
    * @param offset defines the offset in the target buffer where to store the data
    * @param gpuMemoryOnly defines a boolean indicating that only the GPU memory must be updated leaving the CPU version of the indices unchanged (false by default)
    */
  def updateIndices(indices: IndicesArray): Unit = js.native
  def updateIndices(indices: IndicesArray, offset: Double): Unit = js.native
  def updateIndices(indices: IndicesArray, offset: Double, gpuMemoryOnly: Boolean): Unit = js.native
  def updateIndices(indices: IndicesArray, offset: Unit, gpuMemoryOnly: Boolean): Unit = js.native
  
  /**
    * Update a specific vertex buffer
    * This function will directly update the underlying DataBuffer according to the passed numeric array or Float32Array
    * It will do nothing if the buffer is not updatable
    * @param kind defines the data kind (Position, normal, etc...)
    * @param data defines the data to use
    * @param offset defines the offset in the target buffer where to store the data
    * @param useBytes set to true if the offset is in bytes
    */
  def updateVerticesDataDirectly(kind: String, data: DataArray, offset: Double): Unit = js.native
  def updateVerticesDataDirectly(kind: String, data: DataArray, offset: Double, useBytes: Boolean): Unit = js.native
  
  /**
    * If set to true (false by default), the bounding info applied to the meshes sharing this geometry will be the bounding info defined at the class level
    * and won't be computed based on the vertex positions (which is what we get when useBoundingInfoFromGeometry = false)
    */
  var useBoundingInfoFromGeometry: Boolean = js.native
}
