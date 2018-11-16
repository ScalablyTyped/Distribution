package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Line mesh
     * @see https://doc.babylonjs.com/babylon101/parametric_shapes
     */
@JSImport("babylonjs", "LinesMesh")
@js.native
class LinesMesh protected ()
  extends babylonjsLib.BABYLONNs.LinesMesh {
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
  def this(name: java.lang.String, scene: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]], parent: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Node]], source: js.UndefOr[babylonjsLib.BABYLONNs.LinesMesh], doNotCloneChildren: js.UndefOr[scala.Boolean], /**
           * If vertex color should be applied to the mesh
           */
  useVertexColor: js.UndefOr[scala.Boolean | js.UndefOr[scala.Nothing]], /**
           * If vertex alpha should be applied to the mesh
           */
  useVertexAlpha: js.UndefOr[scala.Boolean | js.UndefOr[scala.Nothing]]) = this()
}

