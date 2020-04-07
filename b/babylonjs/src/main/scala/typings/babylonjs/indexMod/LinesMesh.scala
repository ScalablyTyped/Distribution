package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "LinesMesh")
@js.native
class LinesMesh protected ()
  extends typings.babylonjs.babylonjsIndexMod.LinesMesh {
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
    scene: js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]],
    parent: js.UndefOr[Nullable[typings.babylonjs.nodeMod.Node]],
    source: js.UndefOr[Nullable[typings.babylonjs.linesMeshMod.LinesMesh]],
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
}

