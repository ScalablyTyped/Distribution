package typings.babylonjs.indexMod

import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ColorCorrectionPostProcess")
@js.native
open class ColorCorrectionPostProcess protected ()
  extends typings.babylonjs.postProcessesIndexMod.ColorCorrectionPostProcess {
  def this(name: String, colorTableUrl: String, options: Double, camera: typings.babylonjs.cameraMod.Camera) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.cameraMod.Camera
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.cameraMod.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
}
/* static members */
object ColorCorrectionPostProcess {
  
  @JSImport("babylonjs/index", "ColorCorrectionPostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param parsedPostProcess
    * @param targetCamera
    * @param scene
    * @param rootUrl
    * @hidden
    */
  inline def _Parse(
    parsedPostProcess: Any,
    targetCamera: typings.babylonjs.cameraMod.Camera,
    scene: typings.babylonjs.sceneMod.Scene,
    rootUrl: String
  ): Nullable[typings.babylonjs.colorCorrectionPostProcessMod.ColorCorrectionPostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.colorCorrectionPostProcessMod.ColorCorrectionPostProcess]]
}
