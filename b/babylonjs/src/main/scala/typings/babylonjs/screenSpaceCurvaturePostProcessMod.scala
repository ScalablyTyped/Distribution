package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/screenSpaceCurvaturePostProcess", JSImport.Namespace)
@js.native
object screenSpaceCurvaturePostProcessMod extends js.Object {
  
  @js.native
  class ScreenSpaceCurvaturePostProcess protected () extends PostProcess {
    /**
      * Creates a new instance ScreenSpaceCurvaturePostProcess
      * @param name The name of the effect.
      * @param scene The scene containing the objects to blur according to their velocity.
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
      scene: Scene,
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      blockCompilation: js.UndefOr[Boolean]
    ) = this()
    
    var _geometryBufferRenderer: js.Any = js.native
    
    /**
      * Defines how much ridge the curvature effect displays.
      */
    var ridge: Double = js.native
    
    /**
      * Defines how much valley the curvature effect displays.
      */
    var valley: Double = js.native
  }
  /* static members */
  @js.native
  object ScreenSpaceCurvaturePostProcess extends js.Object {
    
    /**
      * Support test.
      */
    def IsSupported: Boolean = js.native
    
    /** @hidden */
    def _Parse(parsedPostProcess: js.Any, targetCamera: Camera, scene: Scene, rootUrl: String): ScreenSpaceCurvaturePostProcess = js.native
  }
}
