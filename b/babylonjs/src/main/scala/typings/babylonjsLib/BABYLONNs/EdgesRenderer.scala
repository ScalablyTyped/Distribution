package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is used to generate edges of the mesh that could then easily be rendered in a scene.
  */
@JSGlobal("BABYLON.EdgesRenderer")
@js.native
class EdgesRenderer protected () extends IEdgesRenderer {
  /**
    * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
    * Beware when you use this class with complex objects as the adjacencies computation can be really long
    * @param  source Mesh used to create edges
    * @param  epsilon sum of angles in adjacency to check for edge
    * @param  checkVerticesInsteadOfIndices
    * @param  generateEdgesLines - should generate Lines or only prepare resources.
    */
  def this(source: AbstractMesh) = this()
  def this(source: AbstractMesh, epsilon: scala.Double) = this()
  def this(source: AbstractMesh, epsilon: scala.Double, checkVerticesInsteadOfIndices: scala.Boolean) = this()
  def this(source: AbstractMesh, epsilon: scala.Double, checkVerticesInsteadOfIndices: scala.Boolean, generateEdgesLines: scala.Boolean) = this()
  var _buffers: org.scalablytyped.runtime.StringDictionary[Nullable[VertexBuffer]] = js.native
  var _checkVerticesInsteadOfIndices: scala.Boolean = js.native
  var _epsilon: scala.Double = js.native
  var _ib: babylonjsLib.WebGLBuffer = js.native
  var _indicesCount: scala.Double = js.native
  var _lineShader: ShaderMaterial = js.native
  var _linesIndices: js.Array[scala.Double] = js.native
  var _linesNormals: js.Array[scala.Double] = js.native
  var _linesPositions: js.Array[scala.Double] = js.native
  var _meshDisposeObserver: js.Any = js.native
  var _meshRebuildObserver: js.Any = js.native
  var _source: AbstractMesh = js.native
  /**
    * Define the size of the edges with an orthographic camera
    */
  var edgesWidthScalerForOrthographic: scala.Double = js.native
  /**
    * Define the size of the edges with a perspective camera
    */
  var edgesWidthScalerForPerspective: scala.Double = js.native
  /**
    * Gets or sets a boolean indicating if the edgesRenderer is active
    */
  /* CompleteClass */
  override var isEnabled: scala.Boolean = js.native
  /**
    * Checks if the pair of p0 and p1 is en edge
    * @param faceIndex
    * @param edge
    * @param faceNormals
    * @param  p0
    * @param  p1
    * @private
    */
  /* protected */ def _checkEdge(
    faceIndex: scala.Double,
    edge: scala.Double,
    faceNormals: js.Array[Vector3],
    p0: Vector3,
    p1: Vector3
  ): scala.Unit = js.native
  /**
    * Generates lines edges from adjacencjes
    * @private
    */
  def _generateEdgesLines(): scala.Unit = js.native
  /* protected */ def _prepareRessources(): scala.Unit = js.native
  /* protected */ def _processEdgeForAdjacencies(pa: scala.Double, pb: scala.Double, p0: scala.Double, p1: scala.Double, p2: scala.Double): scala.Double = js.native
  /* protected */ def _processEdgeForAdjacenciesWithVertices(pa: Vector3, pb: Vector3, p0: Vector3, p1: Vector3, p2: Vector3): scala.Double = js.native
  /** @hidden */
  def _rebuild(): scala.Unit = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Checks wether or not the edges renderer is ready to render.
    * @return true if ready, otherwise false.
    */
  /* CompleteClass */
  override def isReady(): scala.Boolean = js.native
  /**
    * Renders the edges of the attached mesh,
    */
  /* CompleteClass */
  override def render(): scala.Unit = js.native
}

