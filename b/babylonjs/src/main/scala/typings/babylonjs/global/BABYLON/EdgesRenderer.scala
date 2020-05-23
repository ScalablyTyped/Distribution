package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EdgesRenderer")
@js.native
class EdgesRenderer protected ()
  extends typings.babylonjs.BABYLON.EdgesRenderer {
  /**
    * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
    * Beware when you use this class with complex objects as the adjacencies computation can be really long
    * @param  source Mesh used to create edges
    * @param  epsilon sum of angles in adjacency to check for edge
    * @param  checkVerticesInsteadOfIndices bases the edges detection on vertices vs indices
    * @param  generateEdgesLines - should generate Lines or only prepare resources.
    */
  def this(source: typings.babylonjs.BABYLON.AbstractMesh) = this()
  def this(source: typings.babylonjs.BABYLON.AbstractMesh, epsilon: Double) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
  /* CompleteClass */
  override var _buffers: org.scalablytyped.runtime.StringDictionary[Nullable[typings.babylonjs.BABYLON.VertexBuffer]] = js.native
  /* CompleteClass */
  override var _checkVerticesInsteadOfIndices: Boolean = js.native
  /* CompleteClass */
  override var _epsilon: Double = js.native
  /* CompleteClass */
  override var _ib: typings.babylonjs.BABYLON.DataBuffer = js.native
  /* CompleteClass */
  override var _indicesCount: Double = js.native
  /* CompleteClass */
  override var _lineShader: typings.babylonjs.BABYLON.ShaderMaterial = js.native
  /* CompleteClass */
  override var _linesIndices: js.Array[Double] = js.native
  /* CompleteClass */
  override var _linesNormals: js.Array[Double] = js.native
  /* CompleteClass */
  override var _linesPositions: js.Array[Double] = js.native
  /* CompleteClass */
  override var _meshDisposeObserver: js.Any = js.native
  /* CompleteClass */
  override var _meshRebuildObserver: js.Any = js.native
  /* CompleteClass */
  override var _source: typings.babylonjs.BABYLON.AbstractMesh = js.native
  /**
    * Define the size of the edges with an orthographic camera
    */
  /* CompleteClass */
  override var edgesWidthScalerForOrthographic: Double = js.native
  /**
    * Define the size of the edges with a perspective camera
    */
  /* CompleteClass */
  override var edgesWidthScalerForPerspective: Double = js.native
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
  /* CompleteClass */
  /* protected */ override def _checkEdge(
    faceIndex: Double,
    edge: Double,
    faceNormals: js.Array[typings.babylonjs.BABYLON.Vector3],
    p0: typings.babylonjs.BABYLON.Vector3,
    p1: typings.babylonjs.BABYLON.Vector3
  ): Unit = js.native
  /**
    * Generates lines edges from adjacencjes
    * @private
    */
  /* CompleteClass */
  override def _generateEdgesLines(): Unit = js.native
  /* CompleteClass */
  /* protected */ override def _prepareRessources(): Unit = js.native
  /* CompleteClass */
  /* protected */ override def _processEdgeForAdjacencies(pa: Double, pb: Double, p0: Double, p1: Double, p2: Double): Double = js.native
  /* CompleteClass */
  /* protected */ override def _processEdgeForAdjacenciesWithVertices(
    pa: typings.babylonjs.BABYLON.Vector3,
    pb: typings.babylonjs.BABYLON.Vector3,
    p0: typings.babylonjs.BABYLON.Vector3,
    p1: typings.babylonjs.BABYLON.Vector3,
    p2: typings.babylonjs.BABYLON.Vector3
  ): Double = js.native
  /** @hidden */
  /* CompleteClass */
  override def _rebuild(): Unit = js.native
  /**
    * push line into the position, normal and index buffer
    * @protected
    */
  /* CompleteClass */
  /* protected */ override def createLine(p0: typings.babylonjs.BABYLON.Vector3, p1: typings.babylonjs.BABYLON.Vector3, offset: Double): Unit = js.native
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

