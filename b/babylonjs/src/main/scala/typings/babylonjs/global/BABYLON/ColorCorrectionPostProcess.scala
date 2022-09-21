package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ColorCorrectionPostProcess")
@js.native
open class ColorCorrectionPostProcess protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ColorCorrectionPostProcess {
  def this(name: String, colorTableUrl: String, options: Double, camera: typings.babylonjs.BABYLON.Camera) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: typings.babylonjs.BABYLON.Camera,
    samplingMode: Unit,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
}
/* static members */
object ColorCorrectionPostProcess {
  
  @JSGlobal("BABYLON.ColorCorrectionPostProcess")
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
    targetCamera: typings.babylonjs.BABYLON.Camera,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: String
  ): Nullable[typings.babylonjs.BABYLON.ColorCorrectionPostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.ColorCorrectionPostProcess]]
}
