package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.LinesMesh")
@js.native
class LinesMesh protected () extends Mesh {
  /**
    * Creates a new LinesMesh
    * @param name defines the name
    * @param scene defines the hosting scene
    * @param parent defines the parent mesh if any
    * @param source defines the optional source LinesMesh used to clone data from
    * @param doNotCloneChildren When cloning, skip cloning child meshes of source, default False.
    * When false, achieved by calling a clone(), also passing False.
    * This will make creation of children, recursive.
    * @param useVertexColor defines if this LinesMesh supports vertex color
    * @param useVertexAlpha defines if this LinesMesh supports vertex alpha
    */
  def this(
    name: String,
    scene: js.UndefOr[Nullable[Scene]],
    parent: js.UndefOr[Nullable[Node]],
    source: js.UndefOr[Nullable[LinesMesh]],
    doNotCloneChildren: js.UndefOr[Boolean],
    /**
    * If vertex color should be applied to the mesh
    */
  useVertexColor: js.UndefOr[Boolean],
    /**
    * If vertex alpha should be applied to the mesh
    */
  useVertexAlpha: js.UndefOr[Boolean]
  ) = this()
  var _addClipPlaneDefine: js.Any = js.native
  var _colorShader: js.Any = js.native
  var _removeClipPlaneDefine: js.Any = js.native
  /**
    * Alpha of the line (Default: 1)
    */
  var alpha: Double = js.native
  /**
    * Color of the line (Default: White)
    */
  var color: Color3 = js.native
  var color4: js.Any = js.native
  /**
    * The intersection Threshold is the margin applied when intersection a segment of the LinesMesh with a Ray.
    * This margin is expressed in world space coordinates, so its value may vary.
    * Default value is 0.1
    */
  var intersectionThreshold: Double = js.native
  /**
    * If vertex alpha should be applied to the mesh
    */
  val useVertexAlpha: js.UndefOr[Boolean] = js.native
  /**
    * If vertex color should be applied to the mesh
    */
  val useVertexColor: js.UndefOr[Boolean] = js.native
  /**
    * @hidden
    */
  def material(value: Material): js.Any = js.native
}

