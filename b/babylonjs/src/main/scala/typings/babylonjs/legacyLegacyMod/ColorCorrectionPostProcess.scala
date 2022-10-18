package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ColorCorrectionPostProcess")
@js.native
open class ColorCorrectionPostProcess protected ()
  extends typings.babylonjs.indexMod.ColorCorrectionPostProcess {
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.enginesEngineMod.Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.enginesEngineMod.Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.enginesEngineMod.Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.enginesEngineMod.Engine
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.enginesEngineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: Double,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.enginesEngineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.enginesEngineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    colorTableUrl: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: Unit,
    engine: typings.babylonjs.enginesEngineMod.Engine,
    reusable: Boolean
  ) = this()
}
/* static members */
object ColorCorrectionPostProcess {
  
  @JSImport("babylonjs/Legacy/legacy", "ColorCorrectionPostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _Parse(
    parsedPostProcess: Any,
    targetCamera: typings.babylonjs.camerasCameraMod.Camera,
    scene: typings.babylonjs.sceneMod.Scene,
    rootUrl: String
  ): Nullable[
    typings.babylonjs.postProcessesColorCorrectionPostProcessMod.ColorCorrectionPostProcess
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[
    typings.babylonjs.postProcessesColorCorrectionPostProcessMod.ColorCorrectionPostProcess
  ]]
}
