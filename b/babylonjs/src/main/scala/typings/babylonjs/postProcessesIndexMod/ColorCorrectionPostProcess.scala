package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "ColorCorrectionPostProcess")
@js.native
open class ColorCorrectionPostProcess protected ()
  extends typings.babylonjs.postProcessesColorCorrectionPostProcessMod.ColorCorrectionPostProcess {
  def this(name: String, colorTableUrl: String, options: Double, camera: Nullable[Camera]) = this()
  def this(name: String, colorTableUrl: String, options: PostProcessOptions, camera: Nullable[Camera]) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Engine,
    reusable: Boolean
  ) = this()
}
/* static members */
object ColorCorrectionPostProcess {
  
  @JSImport("babylonjs/PostProcesses/index", "ColorCorrectionPostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _Parse(parsedPostProcess: Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[
    typings.babylonjs.postProcessesColorCorrectionPostProcessMod.ColorCorrectionPostProcess
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[
    typings.babylonjs.postProcessesColorCorrectionPostProcessMod.ColorCorrectionPostProcess
  ]]
}
