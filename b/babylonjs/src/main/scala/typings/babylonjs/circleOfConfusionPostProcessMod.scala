package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleOfConfusionPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/circleOfConfusionPostProcess", "CircleOfConfusionPostProcess")
  @js.native
  open class CircleOfConfusionPostProcess protected () extends PostProcess {
    /**
      * Creates a new instance CircleOfConfusionPostProcess
      * @param name The name of the effect.
      * @param depthTexture The depth texture of the scene to compute the circle of confusion. This must be set in order for this to function but may be set after initialization if needed.
      * @param options The required width/height ratio to downsize to before computing the render pass.
      * @param camera The camera to apply the render pass to.
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      * @param textureType Type of textures used when performing the post process. (default: 0)
      * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
      */
    def this(
      name: String,
      depthTexture: Nullable[RenderTargetTexture],
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      blockCompilation: js.UndefOr[Boolean]
    ) = this()
    
    /* private */ var _depthTexture: Any = js.native
    
    /**
      * Depth texture to be used to compute the circle of confusion. This must be set here or in the constructor in order for the post process to function.
      */
    def depthTexture_=(value: RenderTargetTexture): Unit = js.native
    
    /**
      * F-Stop of the effect's camera. The diameter of the resulting aperture can be computed by lensSize/fStop. (default: 1.4)
      */
    var fStop: Double = js.native
    
    /**
      * Focal length of the effect's camera in scene units/1000 (eg. millimeter). (default: 50)
      */
    var focalLength: Double = js.native
    
    /**
      * Distance away from the camera to focus on in scene units/1000 (eg. millimeter). (default: 2000)
      */
    var focusDistance: Double = js.native
    
    /**
      * Max lens size in scene units/1000 (eg. millimeter). Standard cameras are 50mm. (default: 50) The diameter of the resulting aperture can be computed by lensSize/fStop.
      */
    var lensSize: Double = js.native
  }
}
