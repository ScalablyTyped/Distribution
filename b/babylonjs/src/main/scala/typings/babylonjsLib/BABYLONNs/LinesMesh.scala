package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Line mesh
     * @see https://doc.babylonjs.com/babylon101/parametric_shapes
     */
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
  def this(name: java.lang.String, scene: js.UndefOr[Nullable[Scene]], parent: js.UndefOr[Nullable[Node]], source: js.UndefOr[LinesMesh], doNotCloneChildren: js.UndefOr[scala.Boolean], /**
           * If vertex color should be applied to the mesh
           */
  useVertexColor: js.UndefOr[scala.Boolean | js.UndefOr[scala.Nothing]], /**
           * If vertex alpha should be applied to the mesh
           */
  useVertexAlpha: js.UndefOr[scala.Boolean | js.UndefOr[scala.Nothing]]) = this()
  var _colorShader: js.Any = js.native
  var _intersectionThreshold: js.Any = js.native
  /**
           * Alpha of the line (Default: 1)
           */
  var alpha: scala.Double = js.native
  /**
           * Color of the line (Default: White)
           */
  var color: Color3 = js.native
  /**
           * The intersection Threshold is the margin applied when intersection a segment of the LinesMesh with a Ray.
           * This margin is expressed in world space coordinates, so its value may vary.
           * Default value is 0.1
           * @returns the intersection Threshold value.
           */
  /**
          * The intersection Threshold is the margin applied when intersection a segment of the LinesMesh with a Ray.
          * This margin is expressed in world space coordinates, so its value may vary.
          */
  var intersectionThreshold: scala.Double = js.native
  /**
           * @hidden
           */
  /**
          * @hidden
          */
  @JSName("material")
  var material_LinesMesh: Material = js.native
  /**
           * If vertex alpha should be applied to the mesh
           */
  var useVertexAlpha: js.UndefOr[scala.Boolean] = js.native
  /**
           * If vertex color should be applied to the mesh
           */
  var useVertexColor: js.UndefOr[scala.Boolean] = js.native
}

