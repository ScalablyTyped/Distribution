package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * BABYLON.JS Chromatic Aberration GLSL Shader
     * Author: Olivier Guyot
     * Separates very slightly R, G and B colors on the edges of the screen
     * Inspired by Francois Tarlier & Martins Upitis
     */
@JSGlobal("BABYLON.LensRenderingPipeline")
@js.native
class LensRenderingPipeline protected () extends PostProcessRenderPipeline {
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
  def this(name: java.lang.String, parameters: js.Any, scene: Scene) = this()
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
  def this(name: java.lang.String, parameters: js.Any, scene: Scene, ratio: scala.Double) = this()
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
  def this(name: java.lang.String, parameters: js.Any, scene: Scene, ratio: scala.Double, cameras: js.Array[Camera]) = this()
  /**
           * @ignore
           * The highlights enhancing PostProcess id in the pipeline
           */
  var HighlightsEnhancingEffect: java.lang.String = js.native
  /**
           * @ignore
           * The chromatic aberration PostProcess id in the pipeline
           */
  var LensChromaticAberrationEffect: java.lang.String = js.native
  /**
           * @ignore
          * The depth-of-field PostProcess id in the pipeline
          */
  var LensDepthOfFieldEffect: java.lang.String = js.native
  var _blurNoise: js.Any = js.native
  var _chromaticAberration: js.Any = js.native
  var _chromaticAberrationPostProcess: js.Any = js.native
  var _createChromaticAberrationPostProcess: js.Any = js.native
  var _createDepthOfFieldPostProcess: js.Any = js.native
  var _createGrainTexture: js.Any = js.native
  var _createHighlightsPostProcess: js.Any = js.native
  var _depthOfFieldPostProcess: js.Any = js.native
  var _depthTexture: js.Any = js.native
  var _distortion: js.Any = js.native
  var _dofAperture: js.Any = js.native
  var _dofDarken: js.Any = js.native
  var _dofDistance: js.Any = js.native
  var _dofPentagon: js.Any = js.native
  var _edgeBlur: js.Any = js.native
  var _grainAmount: js.Any = js.native
  var _grainTexture: js.Any = js.native
  var _highlightsGain: js.Any = js.native
  var _highlightsPostProcess: js.Any = js.native
  var _highlightsThreshold: js.Any = js.native
  var _scene: js.Any = js.native
  /**
           * Sets chromatic aberration amount to 0
           */
  def disableChromaticAberration(): scala.Unit = js.native
  /**
          * Disables depth of field
          */
  def disableDepthOfField(): scala.Unit = js.native
  /**
           * Sets edge blur to 0
           */
  def disableEdgeBlur(): scala.Unit = js.native
  /**
           * Sets edge distortion to 0
           */
  def disableEdgeDistortion(): scala.Unit = js.native
  /**
           * Set grain amount to 0
           */
  def disableGrain(): scala.Unit = js.native
  /**
           * Disables highlights
           */
  def disableHighlights(): scala.Unit = js.native
  /**
           * Disables noise blur
           */
  def disableNoiseBlur(): scala.Unit = js.native
  /**
           * Disables the pentagon bokeh effect
           */
  def disablePentagonBokeh(): scala.Unit = js.native
  /**
           * Removes the internal pipeline assets and detaches the pipeline from the scene cameras
           * @param disableDepthRender If the scens depth rendering should be disabled (default: false)
           */
  def dispose(disableDepthRender: scala.Boolean): scala.Unit = js.native
  /**
           * Enables noise blur
           */
  def enableNoiseBlur(): scala.Unit = js.native
  /**
           * Creates a pentagon bokeh effect
           */
  def enablePentagonBokeh(): scala.Unit = js.native
  /**
           * Sets the Aperture amount
           * @param amount amount of Aperture
           */
  def setAperture(amount: scala.Double): scala.Unit = js.native
  /**
           * Sets the chromatic aberration amount
           * @param amount amount of chromatic aberration
           */
  def setChromaticAberration(amount: scala.Double): scala.Unit = js.native
  /**
           * Sets the DarkenOutOfFocus amount
           * @param amount amount of DarkenOutOfFocus
           */
  def setDarkenOutOfFocus(amount: scala.Double): scala.Unit = js.native
  /**
           * Sets the amount of blur at the edges
           * @param amount blur amount
           */
  def setEdgeBlur(amount: scala.Double): scala.Unit = js.native
  /**
           * Sets the EdgeDistortion amount
           * @param amount amount of EdgeDistortion
           */
  def setEdgeDistortion(amount: scala.Double): scala.Unit = js.native
  /**
           * Sets the FocusDistance amount
           * @param amount amount of FocusDistance
           */
  def setFocusDistance(amount: scala.Double): scala.Unit = js.native
  /**
           * Sets the amout of grain
           * @param amount Amount of grain
           */
  def setGrainAmount(amount: scala.Double): scala.Unit = js.native
  /**
           * Sets the HighlightsGain amount
           * @param amount amount of HighlightsGain
           */
  def setHighlightsGain(amount: scala.Double): scala.Unit = js.native
  /**
           * Sets the HighlightsThreshold amount
           * @param amount amount of HighlightsThreshold
           */
  def setHighlightsThreshold(amount: scala.Double): scala.Unit = js.native
}

