package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Render pipeline to produce ssao effect
     */
@JSImport("babylonjs", "SSAORenderingPipeline")
@js.native
class SSAORenderingPipeline protected ()
  extends babylonjsLib.BABYLONNs.SSAORenderingPipeline {
  /**
           * @constructor
           * @param name - The rendering pipeline name
           * @param scene - The scene linked to this pipeline
           * @param ratio - The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, combineRatio: 1.0 }
           * @param cameras - The array of cameras that the rendering pipeline will be attached to
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, ratio: js.Any) = this()
  /**
           * @constructor
           * @param name - The rendering pipeline name
           * @param scene - The scene linked to this pipeline
           * @param ratio - The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, combineRatio: 1.0 }
           * @param cameras - The array of cameras that the rendering pipeline will be attached to
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, ratio: js.Any, cameras: js.Array[babylonjsLib.BABYLONNs.Camera]) = this()
}

