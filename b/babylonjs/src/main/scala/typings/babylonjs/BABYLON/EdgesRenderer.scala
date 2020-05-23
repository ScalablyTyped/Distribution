package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgesRenderer extends IEdgesRenderer {
  var _buffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]]
  var _checkVerticesInsteadOfIndices: Boolean
  var _epsilon: Double
  var _ib: DataBuffer
  var _indicesCount: Double
  var _lineShader: ShaderMaterial
  var _linesIndices: js.Array[Double]
  var _linesNormals: js.Array[Double]
  var _linesPositions: js.Array[Double]
  var _meshDisposeObserver: js.Any
  var _meshRebuildObserver: js.Any
  var _source: AbstractMesh
  /**
    * Define the size of the edges with an orthographic camera
    */
  var edgesWidthScalerForOrthographic: Double
  /**
    * Define the size of the edges with a perspective camera
    */
  var edgesWidthScalerForPerspective: Double
  /**
    * Checks if the pair of p0 and p1 is en edge
    * @param faceIndex
    * @param edge
    * @param faceNormals
    * @param  p0
    * @param  p1
    * @private
    */
  /* protected */ def _checkEdge(faceIndex: Double, edge: Double, faceNormals: js.Array[Vector3], p0: Vector3, p1: Vector3): Unit
  /**
    * Generates lines edges from adjacencjes
    * @private
    */
  def _generateEdgesLines(): Unit
  /* protected */ def _prepareRessources(): Unit
  /* protected */ def _processEdgeForAdjacencies(pa: Double, pb: Double, p0: Double, p1: Double, p2: Double): Double
  /* protected */ def _processEdgeForAdjacenciesWithVertices(pa: Vector3, pb: Vector3, p0: Vector3, p1: Vector3, p2: Vector3): Double
  /** @hidden */
  def _rebuild(): Unit
  /**
    * push line into the position, normal and index buffer
    * @protected
    */
  /* protected */ def createLine(p0: Vector3, p1: Vector3, offset: Double): Unit
}

object EdgesRenderer {
  @scala.inline
  def apply(
    _buffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]],
    _checkEdge: (Double, Double, js.Array[Vector3], Vector3, Vector3) => Unit,
    _checkVerticesInsteadOfIndices: Boolean,
    _epsilon: Double,
    _generateEdgesLines: () => Unit,
    _ib: DataBuffer,
    _indicesCount: Double,
    _lineShader: ShaderMaterial,
    _linesIndices: js.Array[Double],
    _linesNormals: js.Array[Double],
    _linesPositions: js.Array[Double],
    _meshDisposeObserver: js.Any,
    _meshRebuildObserver: js.Any,
    _prepareRessources: () => Unit,
    _processEdgeForAdjacencies: (Double, Double, Double, Double, Double) => Double,
    _processEdgeForAdjacenciesWithVertices: (Vector3, Vector3, Vector3, Vector3, Vector3) => Double,
    _rebuild: () => Unit,
    _source: AbstractMesh,
    createLine: (Vector3, Vector3, Double) => Unit,
    dispose: () => Unit,
    edgesWidthScalerForOrthographic: Double,
    edgesWidthScalerForPerspective: Double,
    isEnabled: Boolean,
    isReady: () => Boolean,
    render: () => Unit
  ): EdgesRenderer = {
    val __obj = js.Dynamic.literal(_buffers = _buffers.asInstanceOf[js.Any], _checkEdge = js.Any.fromFunction5(_checkEdge), _checkVerticesInsteadOfIndices = _checkVerticesInsteadOfIndices.asInstanceOf[js.Any], _epsilon = _epsilon.asInstanceOf[js.Any], _generateEdgesLines = js.Any.fromFunction0(_generateEdgesLines), _ib = _ib.asInstanceOf[js.Any], _indicesCount = _indicesCount.asInstanceOf[js.Any], _lineShader = _lineShader.asInstanceOf[js.Any], _linesIndices = _linesIndices.asInstanceOf[js.Any], _linesNormals = _linesNormals.asInstanceOf[js.Any], _linesPositions = _linesPositions.asInstanceOf[js.Any], _meshDisposeObserver = _meshDisposeObserver.asInstanceOf[js.Any], _meshRebuildObserver = _meshRebuildObserver.asInstanceOf[js.Any], _prepareRessources = js.Any.fromFunction0(_prepareRessources), _processEdgeForAdjacencies = js.Any.fromFunction5(_processEdgeForAdjacencies), _processEdgeForAdjacenciesWithVertices = js.Any.fromFunction5(_processEdgeForAdjacenciesWithVertices), _rebuild = js.Any.fromFunction0(_rebuild), _source = _source.asInstanceOf[js.Any], createLine = js.Any.fromFunction3(createLine), dispose = js.Any.fromFunction0(dispose), edgesWidthScalerForOrthographic = edgesWidthScalerForOrthographic.asInstanceOf[js.Any], edgesWidthScalerForPerspective = edgesWidthScalerForPerspective.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isReady = js.Any.fromFunction0(isReady), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[EdgesRenderer]
  }
}

