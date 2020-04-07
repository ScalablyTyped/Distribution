package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EdgesRenderer")
@js.native
class EdgesRenderer protected () extends IEdgesRenderer {
  /**
    * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
    * Beware when you use this class with complex objects as the adjacencies computation can be really long
    * @param  source Mesh used to create edges
    * @param  epsilon sum of angles in adjacency to check for edge
    * @param  checkVerticesInsteadOfIndices bases the edges detection on vertices vs indices
    * @param  generateEdgesLines - should generate Lines or only prepare resources.
    */
  def this(source: AbstractMesh) = this()
  def this(source: AbstractMesh, epsilon: Double) = this()
  def this(source: AbstractMesh, epsilon: Double, checkVerticesInsteadOfIndices: Boolean) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
  var _buffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]] = js.native
  var _checkVerticesInsteadOfIndices: Boolean = js.native
  var _epsilon: Double = js.native
  var _ib: DataBuffer = js.native
  var _indicesCount: Double = js.native
  var _lineShader: ShaderMaterial = js.native
  var _linesIndices: js.Array[Double] = js.native
  var _linesNormals: js.Array[Double] = js.native
  var _linesPositions: js.Array[Double] = js.native
  var _meshDisposeObserver: js.Any = js.native
  var _meshRebuildObserver: js.Any = js.native
  var _source: AbstractMesh = js.native
  /**
    * Define the size of the edges with an orthographic camera
    */
  var edgesWidthScalerForOrthographic: Double = js.native
  /**
    * Define the size of the edges with a perspective camera
    */
  var edgesWidthScalerForPerspective: Double = js.native
  /**
    * Gets or sets a boolean indicating if the edgesRenderer is active
    */
  /* CompleteClass */
  override var isEnabled: Boolean = js.native
  /**
    * Checks if the pair of p0 and p1 is en edge
    * @param faceIndex
    * @param edge
    * @param faceNormals
    * @param  p0
    * @param  p1
    * @private
    */
  /* protected */ def _checkEdge(faceIndex: Double, edge: Double, faceNormals: js.Array[Vector3], p0: Vector3, p1: Vector3): Unit = js.native
  /**
    * Generates lines edges from adjacencjes
    * @private
    */
  def _generateEdgesLines(): Unit = js.native
  /* protected */ def _prepareRessources(): Unit = js.native
  /* protected */ def _processEdgeForAdjacencies(pa: Double, pb: Double, p0: Double, p1: Double, p2: Double): Double = js.native
  /* protected */ def _processEdgeForAdjacenciesWithVertices(pa: Vector3, pb: Vector3, p0: Vector3, p1: Vector3, p2: Vector3): Double = js.native
  /** @hidden */
  def _rebuild(): Unit = js.native
  /**
    * push line into the position, normal and index buffer
    * @protected
    */
  /* protected */ def createLine(p0: Vector3, p1: Vector3, offset: Double): Unit = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Checks wether or not the edges renderer is ready to render.
    * @return true if ready, otherwise false.
    */
  /* CompleteClass */
  override def isReady(): Boolean = js.native
  /**
    * Renders the edges of the attached mesh,
    */
  /* CompleteClass */
  override def render(): Unit = js.native
}

