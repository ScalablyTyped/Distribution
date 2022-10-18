package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesChromaticAberrationPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/chromaticAberrationPostProcess", "ChromaticAberrationPostProcess")
  @js.native
  open class ChromaticAberrationPostProcess protected () extends PostProcess {
    /**
      * Creates a new instance ChromaticAberrationPostProcess
      * @param name The name of the effect.
      * @param screenWidth The width of the screen to apply the effect on.
      * @param screenHeight The height of the screen to apply the effect on.
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
      screenWidth: Double,
      screenHeight: Double,
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      blockCompilation: js.UndefOr[Boolean]
    ) = this()
    
    /**
      * The amount of separation of rgb channels (default: 30)
      */
    var aberrationAmount: Double = js.native
    
    /**
      * The center position where the radialIntensity should be around. [0.5,0.5 is center of screen, 1,1 is top right corner] (default: Vector2(0.5 ,0.5))
      */
    var centerPosition: Vector2 = js.native
    
    /**
      * The normalized direction in which the rgb channels should be separated. If set to 0,0 radial direction will be used. (default: Vector2(0.707,0.707))
      */
    var direction: Vector2 = js.native
    
    /**
      * The amount the effect will increase for pixels closer to the edge of the screen. (default: 0)
      */
    var radialIntensity: Double = js.native
    
    /** The height of the screen to apply the effect on */
    var screenHeight: Double = js.native
    
    /** The width of the screen to apply the effect on */
    var screenWidth: Double = js.native
  }
  /* static members */
  object ChromaticAberrationPostProcess {
    
    @JSImport("babylonjs/PostProcesses/chromaticAberrationPostProcess", "ChromaticAberrationPostProcess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def _Parse(parsedPostProcess: Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[ChromaticAberrationPostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[ChromaticAberrationPostProcess]]
  }
}
