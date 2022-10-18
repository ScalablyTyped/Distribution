package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.postProcessesPostProcessMod.PostProcess
import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesExtractHighlightsPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/extractHighlightsPostProcess", "ExtractHighlightsPostProcess")
  @js.native
  open class ExtractHighlightsPostProcess protected () extends PostProcess {
    def this(
      name: String,
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double],
      blockCompilation: js.UndefOr[Boolean]
    ) = this()
    
    /** @internal */
    var _exposure: Double = js.native
    
    /**
      * Post process which has the input texture to be used when performing highlight extraction
      * @internal
      */
    var _inputPostProcess: Nullable[PostProcess] = js.native
    
    /**
      * The luminance threshold, pixels below this value will be set to black.
      */
    var threshold: Double = js.native
  }
}
