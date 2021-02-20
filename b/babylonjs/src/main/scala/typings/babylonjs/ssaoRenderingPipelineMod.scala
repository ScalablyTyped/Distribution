package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.postProcessRenderPipelineMod.PostProcessRenderPipeline
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssaoRenderingPipelineMod {
  
  @JSImport("babylonjs/PostProcesses/RenderPipeline/Pipelines/ssaoRenderingPipeline", "SSAORenderingPipeline")
  @js.native
  class SSAORenderingPipeline protected () extends PostProcessRenderPipeline {
    /**
      * @constructor
      * @param name - The rendering pipeline name
      * @param scene - The scene linked to this pipeline
      * @param ratio - The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, combineRatio: 1.0 }
      * @param cameras - The array of cameras that the rendering pipeline will be attached to
      */
    def this(name: String, scene: Scene, ratio: js.Any) = this()
    def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera]) = this()
    
    /**
      * @ignore
      * The horizontal blur PostProcess id in the pipeline
      */
    var SSAOBlurHRenderEffect: String = js.native
    
    /**
      * @ignore
      * The vertical blur PostProcess id in the pipeline
      */
    var SSAOBlurVRenderEffect: String = js.native
    
    /**
      * @ignore
      * The PostProcess id in the pipeline that combines the SSAO-Blur output with the original scene color (SSAOOriginalSceneColorEffect)
      */
    var SSAOCombineRenderEffect: String = js.native
    
    /**
      * @ignore
      * The PassPostProcess id in the pipeline that contains the original scene color
      */
    var SSAOOriginalSceneColorEffect: String = js.native
    
    /**
      * @ignore
      * The SSAO PostProcess id in the pipeline
      */
    var SSAORenderEffect: String = js.native
    
    var _blurHPostProcess: js.Any = js.native
    
    var _blurVPostProcess: js.Any = js.native
    
    var _createBlurPostProcess: js.Any = js.native
    
    var _createRandomTexture: js.Any = js.native
    
    var _createSSAOCombinePostProcess: js.Any = js.native
    
    var _createSSAOPostProcess: js.Any = js.native
    
    var _depthTexture: js.Any = js.native
    
    var _firstUpdate: js.Any = js.native
    
    var _originalColorPostProcess: js.Any = js.native
    
    var _randomTexture: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _ssaoCombinePostProcess: js.Any = js.native
    
    var _ssaoPostProcess: js.Any = js.native
    
    /**
      * Related to fallOff, used to interpolate SSAO samples (first interpolate function input) based on the occlusion difference of each pixel
      * Must not be equal to fallOff and superior to fallOff.
      * Default value is 0.0075
      */
    var area: Double = js.native
    
    /**
      * The base color of the SSAO post-process
      * The final result is "base + ssao" between [0, 1]
      */
    var base: Double = js.native
    
    def dispose(disableDepthRender: Boolean): Unit = js.native
    
    /**
      * Related to area, used to interpolate SSAO samples (second interpolate function input) based on the occlusion difference of each pixel
      * Must not be equal to area and inferior to area.
      * Default value is 0.000001
      */
    var fallOff: Double = js.native
    
    /**
      * The radius around the analyzed pixel used by the SSAO post-process. Default value is 0.0006
      */
    var radius: Double = js.native
    
    /**
      * Gets active scene
      */
    def scene: Scene = js.native
    
    /**
      * The output strength of the SSAO post-process. Default value is 1.0.
      */
    var totalStrength: Double = js.native
  }
}
