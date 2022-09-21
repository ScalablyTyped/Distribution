package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anaglyphPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/anaglyphPostProcess", "AnaglyphPostProcess")
  @js.native
  open class AnaglyphPostProcess protected () extends PostProcess {
    /**
      * Creates a new AnaglyphPostProcess
      * @param name defines postprocess name
      * @param options defines creation options or target ratio scale
      * @param rigCameras defines cameras using this postprocess
      * @param samplingMode defines required sampling mode (BABYLON.Texture.NEAREST_SAMPLINGMODE by default)
      * @param engine defines hosting engine
      * @param reusable defines if the postprocess will be reused multiple times per frame
      */
    def this(name: String, options: Double, rigCameras: js.Array[Camera]) = this()
    def this(name: String, options: PostProcessOptions, rigCameras: js.Array[Camera]) = this()
    def this(name: String, options: Double, rigCameras: js.Array[Camera], samplingMode: Double) = this()
    def this(name: String, options: PostProcessOptions, rigCameras: js.Array[Camera], samplingMode: Double) = this()
    def this(name: String, options: Double, rigCameras: js.Array[Camera], samplingMode: Double, engine: Engine) = this()
    def this(name: String, options: Double, rigCameras: js.Array[Camera], samplingMode: Unit, engine: Engine) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      rigCameras: js.Array[Camera],
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      rigCameras: js.Array[Camera],
      samplingMode: Unit,
      engine: Engine
    ) = this()
    def this(
      name: String,
      options: Double,
      rigCameras: js.Array[Camera],
      samplingMode: Double,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: Double,
      rigCameras: js.Array[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: Double,
      rigCameras: js.Array[Camera],
      samplingMode: Unit,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: Double,
      rigCameras: js.Array[Camera],
      samplingMode: Unit,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      rigCameras: js.Array[Camera],
      samplingMode: Double,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      rigCameras: js.Array[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      rigCameras: js.Array[Camera],
      samplingMode: Unit,
      engine: Unit,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      rigCameras: js.Array[Camera],
      samplingMode: Unit,
      engine: Engine,
      reusable: Boolean
    ) = this()
    
    /* private */ var _passedProcess: Any = js.native
  }
}
