package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "LensRenderingPipeline")
@js.native
class LensRenderingPipeline protected ()
  extends typings.babylonjs.postProcessesIndexMod.LensRenderingPipeline {
  /**
    * @constructor
    *
    * Effect parameters are as follow:
    * {
    *      chromatic_aberration: number;       // from 0 to x (1 for realism)
    *      edge_blur: number;                  // from 0 to x (1 for realism)
    *      distortion: number;                 // from 0 to x (1 for realism)
    *      grain_amount: number;               // from 0 to 1
    *      grain_texture: BABYLON.Texture;     // texture to use for grain effect; if unset, use random B&W noise
    *      dof_focus_distance: number;         // depth-of-field: focus distance; unset to disable (disabled by default)
    *      dof_aperture: number;               // depth-of-field: focus blur bias (default: 1)
    *      dof_darken: number;                 // depth-of-field: darken that which is out of focus (from 0 to 1, disabled by default)
    *      dof_pentagon: boolean;              // depth-of-field: makes a pentagon-like "bokeh" effect
    *      dof_gain: number;                   // depth-of-field: highlights gain; unset to disable (disabled by default)
    *      dof_threshold: number;              // depth-of-field: highlights threshold (default: 1)
    *      blur_noise: boolean;                // add a little bit of noise to the blur (default: true)
    * }
    * Note: if an effect parameter is unset, effect is disabled
    *
    * @param name The rendering pipeline name
    * @param parameters - An object containing all parameters (see above)
    * @param scene The scene linked to this pipeline
    * @param ratio The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
    * @param cameras The array of cameras that the rendering pipeline will be attached to
    */
  def this(name: String, parameters: js.Any, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: String, parameters: js.Any, scene: typings.babylonjs.sceneMod.Scene, ratio: Double) = this()
  def this(
    name: String,
    parameters: js.Any,
    scene: typings.babylonjs.sceneMod.Scene,
    ratio: js.UndefOr[scala.Nothing],
    cameras: js.Array[typings.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    name: String,
    parameters: js.Any,
    scene: typings.babylonjs.sceneMod.Scene,
    ratio: Double,
    cameras: js.Array[typings.babylonjs.cameraMod.Camera]
  ) = this()
}
