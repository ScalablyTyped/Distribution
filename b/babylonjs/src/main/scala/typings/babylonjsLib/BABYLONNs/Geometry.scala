package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to store geometry data (vertex buffers + index buffer)
  */
@JSGlobal("BABYLON.Geometry")
@js.native
class Geometry protected () extends IGetSetVerticesData {
  /**
    * Creates a new geometry
    * @param id defines the unique ID
    * @param scene defines the hosting scene
    * @param vertexData defines the VertexData used to get geometry data
    * @param updatable defines if geometry must be updatable (false by default)
    * @param mesh defines the mesh that will be associated with the geometry
    */
  def this(id: java.lang.String, scene: Scene) = this()
  def this(id: java.lang.String, scene: Scene, vertexData: VertexData) = this()
  def this(id: java.lang.String, scene: Scene, vertexData: VertexData, updatable: scala.Boolean) = this()
  def this(id: java.lang.String, scene: Scene, vertexData: VertexData, updatable: scala.Boolean, mesh: Nullable[Mesh]) = this()
  var _applyToMesh: js.Any = js.native
  var _boundingBias: js.Any = js.native
  /** @hidden */
  var _boundingInfo: Nullable[BoundingInfo] = js.native
  /** @hidden */
  var _delayInfo: js.Array[java.lang.String] = js.native
  /** @hidden */
  var _delayLoadingFunction: Nullable[js.Function2[/* any */ _, /* geometry */ this.type, scala.Unit]] = js.native
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
  var _softwareSkinningFrameId: scala.Double = js.native
  var _totalVertices: js.Any = js.native
  var _updatable: js.Any = js.native
  var _updateBoundingInfo: js.Any = js.native
  var _updateExtend: js.Any = js.native
  var _vertexArrayObjects: js.Any = js.native
  /** @hidden */
  var _vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer] = js.native
  /**
    *  Gets or sets the Bias Vector to apply on the bounding elements (box/sphere), the max extend is computed as v += v * bias.x + bias.y, the min is computed as v -= v * bias.x + bias.y
    */
  /**
    *  Gets or sets the Bias Vector to apply on the bounding elements (box/sphere), the max extend is computed as v += v * bias.x + bias.y, the min is computed as v -= v * bias.x + bias.y
    */
  var boundingBias: Vector2 = js.native
  /**
    * Gets the delay loading state of the geometry (none by default which means not delayed)
    */
  var delayLoadState: scala.Double = js.native
  /**
    * Gets the file containing the data to load when running in delay load state
    */
  var delayLoadingFile: Nullable[java.lang.String] = js.native
  /**
    * Gets a value indicating that the geometry should not be serialized
    */
  val doNotSerialize: scala.Boolean = js.native
  /**
    * Gets the current extend of the geometry
    */
  val extend: babylonjsLib.Anon_Maximum = js.native
  /**
    * Gets or sets the unique ID of the geometry
    */
  var id: java.lang.String = js.native
  var notifyUpdate: js.Any = js.native
  var toNumberArray: js.Any = js.native
  /** @hidden */
  def _bind(effect: Nullable[Effect]): scala.Unit = js.native
  def _bind(effect: Nullable[Effect], indexToBind: Nullable[babylonjsLib.WebGLBuffer]): scala.Unit = js.native
  /** @hidden */
  def _generatePointsArray(): scala.Boolean = js.native
  /** @hidden */
  def _rebuild(): scala.Unit = js.native
  /** @hidden */
  def _releaseVertexArrayObject(): scala.Unit = js.native
  def _releaseVertexArrayObject(effect: Nullable[Effect]): scala.Unit = js.native
  /** @hidden */
  def _resetPointsArrayCache(): scala.Unit = js.native
  /**
    * Apply current geometry to a given mesh
    * @param mesh defines the mesh to apply geometry to
    */
  def applyToMesh(mesh: Mesh): scala.Unit = js.native
  /**
    * Clone the current geometry into a new geometry
    * @param id defines the unique ID of the new geometry
    * @returns a new geometry object
    */
  def copy(id: java.lang.String): Geometry = js.native
  /**
    * Free all associated resources
    */
  def dispose(): scala.Unit = js.native
  /**
    * Gets the hosting engine
    * @returns the hosting Engine
    */
  def getEngine(): Engine = js.native
  /**
    * Gets the index buffer
    * @return the index buffer
    */
  def getIndexBuffer(): Nullable[babylonjsLib.WebGLBuffer] = js.native
  /**
    * Gets the hosting scene
    * @returns the hosting Scene
    */
  def getScene(): Scene = js.native
  /**
    * Return the total number of indices
    * @returns the total number of indices
    */
  def getTotalIndices(): scala.Double = js.native
  /**
    * Gets total number of vertices
    * @returns the total number of vertices
    */
  def getTotalVertices(): scala.Double = js.native
  /**
    * Gets a specific vertex buffer
    * @param kind defines the data kind (Position, normal, etc...)
    * @returns a VertexBuffer
    */
  def getVertexBuffer(kind: java.lang.String): Nullable[VertexBuffer] = js.native
  /**
    * Returns all vertex buffers
    * @return an object holding all vertex buffers indexed by kind
    */
  def getVertexBuffers(): Nullable[org.scalablytyped.runtime.StringDictionary[VertexBuffer]] = js.native
  /**
    * Gets a list of all attached data kinds (Position, normal, etc...)
    * @returns a list of string containing all kinds
    */
  def getVerticesDataKinds(): js.Array[java.lang.String] = js.native
  /**
    * Gets a value indicating if the geometry is disposed
    * @returns true if the geometry was disposed
    */
  def isDisposed(): scala.Boolean = js.native
  /**
    * Defines if the geometry is ready to use
    * @returns true if the geometry is ready to be used
    */
  def isReady(): scala.Boolean = js.native
  /**
    * Returns a boolean defining if the vertex data for the requested `kind` is updatable
    * @param kind defines the data kind (Position, normal, etc...)
    * @returns true if the vertex buffer with the specified kind is updatable
    */
  def isVertexBufferUpdatable(kind: java.lang.String): scala.Boolean = js.native
  /**
    * Load the geometry if it was flagged as delay loaded
    * @param scene defines the hosting scene
    * @param onLoaded defines a callback called when the geometry is loaded
    */
  def load(scene: Scene): scala.Unit = js.native
  def load(scene: Scene, onLoaded: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Callback called when the geometry is updated
    */
  def onGeometryUpdated(geometry: Geometry): scala.Unit = js.native
  def onGeometryUpdated(geometry: Geometry, kind: java.lang.String): scala.Unit = js.native
  /**
    * Release the associated resources for a specific mesh
    * @param mesh defines the source mesh
    * @param shouldDispose defines if the geometry must be disposed if there is no more mesh pointing to it
    */
  def releaseForMesh(mesh: Mesh): scala.Unit = js.native
  def releaseForMesh(mesh: Mesh, shouldDispose: scala.Boolean): scala.Unit = js.native
  /**
    * Removes a specific vertex data
    * @param kind defines the data kind (Position, normal, etc...)
    */
  def removeVerticesData(kind: java.lang.String): scala.Unit = js.native
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
  def setAllVerticesData(vertexData: VertexData): scala.Unit = js.native
  def setAllVerticesData(vertexData: VertexData, updatable: scala.Boolean): scala.Unit = js.native
  /**
    * Creates a new index buffer
    * @param indices defines the indices to store in the index buffer
    * @param totalVertices defines the total number of vertices (could be null)
    * @param updatable defines if the index buffer must be flagged as updatable (false by default)
    */
  def setIndices(indices: IndicesArray): scala.Unit = js.native
  /**
    * Affect a vertex buffer to the geometry. the vertexBuffer.getKind() function is used to determine where to store the data
    * @param buffer defines the vertex buffer to use
    * @param totalVertices defines the total number of vertices for position kind (could be null)
    */
  def setVerticesBuffer(buffer: VertexBuffer): scala.Unit = js.native
  def setVerticesBuffer(buffer: VertexBuffer, totalVertices: Nullable[scala.Double]): scala.Unit = js.native
  /**
    * Set specific vertex data
    * @param kind defines the data kind (Position, normal, etc...)
    * @param data defines the vertex data to use
    * @param updatable defines if the vertex must be flagged as updatable (false as default)
    * @param stride defines the stride to use (0 by default). This value is deduced from the kind value if not specified
    */
  def setVerticesData(kind: java.lang.String, data: FloatArray): scala.Unit = js.native
  def setVerticesData(kind: java.lang.String, data: FloatArray, updatable: scala.Boolean, stride: scala.Double): scala.Unit = js.native
  /**
    * Invert the geometry to move from a right handed system to a left handed one.
    */
  def toLeftHanded(): scala.Unit = js.native
  /**
    * Update index buffer
    * @param indices defines the indices to store in the index buffer
    * @param offset defines the offset in the target buffer where to store the data
    */
  def updateIndices(indices: IndicesArray): scala.Unit = js.native
  def updateIndices(indices: IndicesArray, offset: scala.Double): scala.Unit = js.native
  /**
    * Update a specific vertex buffer
    * This function will directly update the underlying WebGLBuffer according to the passed numeric array or Float32Array
    * It will do nothing if the buffer is not updatable
    * @param kind defines the data kind (Position, normal, etc...)
    * @param data defines the data to use
    * @param offset defines the offset in the target buffer where to store the data
    * @param useBytes set to true if the offset is in bytes
    */
  def updateVerticesDataDirectly(kind: java.lang.String, data: DataArray, offset: scala.Double): scala.Unit = js.native
  def updateVerticesDataDirectly(kind: java.lang.String, data: DataArray, offset: scala.Double, useBytes: scala.Boolean): scala.Unit = js.native
}

/**
  * Class used to store geometry data (vertex buffers + index buffer)
  */
@JSGlobal("BABYLON.Geometry")
@js.native
object Geometry extends js.Object {
  var _CleanMatricesWeights: js.Any = js.native
  /**
    * Static function used to attach a new empty geometry to a mesh
    * @param mesh defines the mesh to attach the geometry to
    * @returns the new Geometry
    */
  def CreateGeometryForMesh(mesh: babylonjsLib.BABYLONNs.Mesh): babylonjsLib.BABYLONNs.Geometry = js.native
  /**
    * Extracts a clone of a mesh geometry
    * @param mesh defines the source mesh
    * @param id defines the unique ID of the new geometry object
    * @returns the new geometry object
    */
  def ExtractFromMesh(mesh: babylonjsLib.BABYLONNs.Mesh, id: java.lang.String): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Geometry] = js.native
  /**
    * Create a new geometry from persisted data (Using .babylon file format)
    * @param parsedVertexData defines the persisted data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root url to use to load assets (like delayed data)
    * @returns the new geometry object
    */
  def Parse(parsedVertexData: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Geometry] = js.native
  /**
    * You should now use Tools.RandomId(), this method is still here for legacy reasons.
    * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
    * Be aware Math.random() could cause collisions, but:
    * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
    * @returns a string containing a new GUID
    */
  def RandomId(): java.lang.String = js.native
  /** @hidden */
  def _ImportGeometry(parsedGeometry: js.Any, mesh: babylonjsLib.BABYLONNs.Mesh): scala.Unit = js.native
}

