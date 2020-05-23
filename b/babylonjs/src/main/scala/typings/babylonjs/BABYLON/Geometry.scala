package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Minimum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry extends IGetSetVerticesData {
  var _applyToMesh: js.Any = js.native
  var _boundingBias: js.Any = js.native
  /** @hidden */
  var _boundingInfo: Nullable[BoundingInfo] = js.native
  /** @hidden */
  var _delayInfo: js.Array[String] = js.native
  /** @hidden */
  var _delayLoadingFunction: Nullable[js.Function2[/* any */ _, /* geometry */ this.type, Unit]] = js.native
  var _disposeVertexArrayObjects: js.Any = js.native
  var _engine: js.Any = js.native
  var _extend: js.Any = js.native
  var _indexBuffer: js.Any = js.native
  var _indexBufferIsUpdatable: js.Any = js.native
  /** @hidden */
  var _indices: IndicesArray = js.native
  var _isDisposed: js.Any = js.native
  var _meshes: js.Any = js.native
  /** @hidden */
  var _positions: Nullable[js.Array[Vector3]] = js.native
  var _queueLoad: js.Any = js.native
  var _scene: js.Any = js.native
  /** @hidden */
  var _softwareSkinningFrameId: Double = js.native
  var _totalVertices: js.Any = js.native
  var _updatable: js.Any = js.native
  var _updateBoundingInfo: js.Any = js.native
  var _updateExtend: js.Any = js.native
  var _vertexArrayObjects: js.Any = js.native
  /** @hidden */
  var _vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer] = js.native
  /**
    * Gets the delay loading state of the geometry (none by default which means not delayed)
    */
  var delayLoadState: Double = js.native
  /**
    * Gets the file containing the data to load when running in delay load state
    */
  var delayLoadingFile: Nullable[String] = js.native
  /**
    * Gets or sets the ID of the geometry
    */
  var id: String = js.native
  var notifyUpdate: js.Any = js.native
  var toNumberArray: js.Any = js.native
  /**
    * Gets or sets the unique ID of the geometry
    */
  var uniqueId: Double = js.native
  /** @hidden */
  def _bind(effect: Nullable[Effect]): Unit = js.native
  def _bind(effect: Nullable[Effect], indexToBind: Nullable[DataBuffer]): Unit = js.native
  /** @hidden */
  def _generatePointsArray(): Boolean = js.native
  /** @hidden */
  def _rebuild(): Unit = js.native
  /** @hidden */
  def _releaseVertexArrayObject(): Unit = js.native
  def _releaseVertexArrayObject(effect: Nullable[Effect]): Unit = js.native
  /** @hidden */
  def _resetPointsArrayCache(): Unit = js.native
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
  def boundingBias(value: Vector2): js.Any = js.native
  /**
    * Clone the current geometry into a new geometry
    * @param id defines the unique ID of the new geometry
    * @returns a new geometry object
    */
  def copy(id: String): Geometry = js.native
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
    * @return the index buffer
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
    * @return an object holding all vertex buffers indexed by kind
    */
  def getVertexBuffers(): Nullable[org.scalablytyped.runtime.StringDictionary[VertexBuffer]] = js.native
  /**
    * Gets a list of all attached data kinds (Position, normal, etc...)
    * @returns a list of string containing all kinds
    */
  def getVerticesDataKinds(): js.Array[String] = js.native
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
    * @return a JSON representation of the current geometry data (without the vertices data)
    */
  def serialize(): js.Any = js.native
  /**
    * Serialize all vertices data into a JSON oject
    * @returns a JSON representation of the current geometry data
    */
  def serializeVerticeData(): js.Any = js.native
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
  /**
    * Affect a vertex buffer to the geometry. the vertexBuffer.getKind() function is used to determine where to store the data
    * @param buffer defines the vertex buffer to use
    * @param totalVertices defines the total number of vertices for position kind (could be null)
    */
  def setVerticesBuffer(buffer: VertexBuffer): Unit = js.native
  def setVerticesBuffer(buffer: VertexBuffer, totalVertices: Nullable[Double]): Unit = js.native
  /**
    * Set specific vertex data
    * @param kind defines the data kind (Position, normal, etc...)
    * @param data defines the vertex data to use
    * @param updatable defines if the vertex must be flagged as updatable (false as default)
    * @param stride defines the stride to use (0 by default). This value is deduced from the kind value if not specified
    */
  def setVerticesData(kind: String, data: FloatArray): Unit = js.native
  def setVerticesData(kind: String, data: FloatArray, updatable: Boolean, stride: Double): Unit = js.native
  /**
    * Invert the geometry to move from a right handed system to a left handed one.
    */
  def toLeftHanded(): Unit = js.native
  /**
    * Update index buffer
    * @param indices defines the indices to store in the index buffer
    * @param offset defines the offset in the target buffer where to store the data
    * @param gpuMemoryOnly defines a boolean indicating that only the GPU memory must be updated leaving the CPU version of the indices unchanged (false by default)
    */
  def updateIndices(indices: IndicesArray): Unit = js.native
  def updateIndices(indices: IndicesArray, offset: Double): Unit = js.native
  def updateIndices(indices: IndicesArray, offset: Double, gpuMemoryOnly: Boolean): Unit = js.native
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
}

