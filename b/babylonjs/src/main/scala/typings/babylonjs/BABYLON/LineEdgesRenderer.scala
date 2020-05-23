package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineEdgesRenderer extends EdgesRenderer

object LineEdgesRenderer {
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
  ): LineEdgesRenderer = {
    val __obj = js.Dynamic.literal(_buffers = _buffers.asInstanceOf[js.Any], _checkEdge = js.Any.fromFunction5(_checkEdge), _checkVerticesInsteadOfIndices = _checkVerticesInsteadOfIndices.asInstanceOf[js.Any], _epsilon = _epsilon.asInstanceOf[js.Any], _generateEdgesLines = js.Any.fromFunction0(_generateEdgesLines), _ib = _ib.asInstanceOf[js.Any], _indicesCount = _indicesCount.asInstanceOf[js.Any], _lineShader = _lineShader.asInstanceOf[js.Any], _linesIndices = _linesIndices.asInstanceOf[js.Any], _linesNormals = _linesNormals.asInstanceOf[js.Any], _linesPositions = _linesPositions.asInstanceOf[js.Any], _meshDisposeObserver = _meshDisposeObserver.asInstanceOf[js.Any], _meshRebuildObserver = _meshRebuildObserver.asInstanceOf[js.Any], _prepareRessources = js.Any.fromFunction0(_prepareRessources), _processEdgeForAdjacencies = js.Any.fromFunction5(_processEdgeForAdjacencies), _processEdgeForAdjacenciesWithVertices = js.Any.fromFunction5(_processEdgeForAdjacenciesWithVertices), _rebuild = js.Any.fromFunction0(_rebuild), _source = _source.asInstanceOf[js.Any], createLine = js.Any.fromFunction3(createLine), dispose = js.Any.fromFunction0(dispose), edgesWidthScalerForOrthographic = edgesWidthScalerForOrthographic.asInstanceOf[js.Any], edgesWidthScalerForPerspective = edgesWidthScalerForPerspective.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isReady = js.Any.fromFunction0(isReady), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[LineEdgesRenderer]
  }
}

