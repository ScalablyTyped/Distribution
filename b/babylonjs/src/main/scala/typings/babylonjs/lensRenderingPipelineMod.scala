package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.postProcessRenderPipelineMod.PostProcessRenderPipeline
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/lensRenderingPipeline", JSImport.Namespace)
@js.native
object lensRenderingPipelineMod extends js.Object {
  
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
    def this(name: String, parameters: js.Any, scene: Scene) = this()
    def this(name: String, parameters: js.Any, scene: Scene, ratio: Double) = this()
    def this(
      name: String,
      parameters: js.Any,
      scene: Scene,
      ratio: js.UndefOr[scala.Nothing],
      cameras: js.Array[Camera]
    ) = this()
    def this(name: String, parameters: js.Any, scene: Scene, ratio: Double, cameras: js.Array[Camera]) = this()
    
    /**
      * @ignore
      * The highlights enhancing PostProcess id in the pipeline
      */
    var HighlightsEnhancingEffect: String = js.native
    
    /**
      * @ignore
      * The chromatic aberration PostProcess id in the pipeline
      */
    var LensChromaticAberrationEffect: String = js.native
    
    /**
      * @ignore
      * The depth-of-field PostProcess id in the pipeline
      */
    var LensDepthOfFieldEffect: String = js.native
    
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
    
    var _pentagonBokehIsEnabled: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    /**
      * Gets or sets a boolean indicating if blur noise is enabled
      */
    def blurNoise: Boolean = js.native
    def blurNoise_=(value: Boolean): Unit = js.native
    
    /**
      * Gets or sets the chromatic aberration amount
      */
    def chromaticAberration: Double = js.native
    def chromaticAberration_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the darken out of focus amount
      */
    def darkenOutOfFocus: Double = js.native
    def darkenOutOfFocus_=(value: Double): Unit = js.native
    
    /**
      * Sets chromatic aberration amount to 0
      */
    def disableChromaticAberration(): Unit = js.native
    
    /**
      * Disables depth of field
      */
    def disableDepthOfField(): Unit = js.native
    
    /**
      * Sets edge blur to 0
      */
    def disableEdgeBlur(): Unit = js.native
    
    /**
      * Sets edge distortion to 0
      */
    def disableEdgeDistortion(): Unit = js.native
    
    /**
      * Set grain amount to 0
      */
    def disableGrain(): Unit = js.native
    
    /**
      * Disables highlights
      */
    def disableHighlights(): Unit = js.native
    
    /**
      * Disables noise blur
      */
    def disableNoiseBlur(): Unit = js.native
    
    /**
      * Disables the pentagon bokeh effect
      */
    def disablePentagonBokeh(): Unit = js.native
    
    def dispose(disableDepthRender: Boolean): Unit = js.native
    
    /**
      * Gets or sets the depth of field aperture
      */
    def dofAperture: Double = js.native
    def dofAperture_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the depth of field distortion
      */
    def dofDistortion: Double = js.native
    def dofDistortion_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the edge blur
      */
    def edgeBlur: Double = js.native
    def edgeBlur_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the edge distortion
      */
    def edgeDistortion: Double = js.native
    def edgeDistortion_=(value: Double): Unit = js.native
    
    /**
      * Enables noise blur
      */
    def enableNoiseBlur(): Unit = js.native
    
    /**
      * Creates a pentagon bokeh effect
      */
    def enablePentagonBokeh(): Unit = js.native
    
    /**
      * Gets or sets the grain amount
      */
    def grainAmount: Double = js.native
    def grainAmount_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the highlight grain amount
      */
    def highlightsGain: Double = js.native
    def highlightsGain_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the highlight threshold
      */
    def highlightsThreshold: Double = js.native
    def highlightsThreshold_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating if pentagon bokeh is enabled
      */
    def pentagonBokeh: Boolean = js.native
    def pentagonBokeh_=(value: Boolean): Unit = js.native
    
    /**
      * Gets associated scene
      */
    def scene: Scene = js.native
    
    /**
      * Sets the Aperture amount
      * @param amount amount of Aperture
      */
    def setAperture(amount: Double): Unit = js.native
    
    /**
      * Sets the chromatic aberration amount
      * @param amount amount of chromatic aberration
      */
    def setChromaticAberration(amount: Double): Unit = js.native
    
    /**
      * Sets the DarkenOutOfFocus amount
      * @param amount amount of DarkenOutOfFocus
      */
    def setDarkenOutOfFocus(amount: Double): Unit = js.native
    
    /**
      * Sets the amount of blur at the edges
      * @param amount blur amount
      */
    def setEdgeBlur(amount: Double): Unit = js.native
    
    /**
      * Sets the EdgeDistortion amount
      * @param amount amount of EdgeDistortion
      */
    def setEdgeDistortion(amount: Double): Unit = js.native
    
    /**
      * Sets the FocusDistance amount
      * @param amount amount of FocusDistance
      */
    def setFocusDistance(amount: Double): Unit = js.native
    
    /**
      * Sets the amout of grain
      * @param amount Amount of grain
      */
    def setGrainAmount(amount: Double): Unit = js.native
    
    /**
      * Sets the HighlightsGain amount
      * @param amount amount of HighlightsGain
      */
    def setHighlightsGain(amount: Double): Unit = js.native
    
    /**
      * Sets the HighlightsThreshold amount
      * @param amount amount of HighlightsThreshold
      */
    def setHighlightsThreshold(amount: Double): Unit = js.native
  }
}
