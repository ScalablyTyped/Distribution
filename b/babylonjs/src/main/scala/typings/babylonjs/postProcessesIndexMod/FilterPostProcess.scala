package typings.babylonjs.postProcessesIndexMod

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "FilterPostProcess")
@js.native
open class FilterPostProcess protected ()
  extends typings.babylonjs.postProcessesFilterPostProcessMod.FilterPostProcess {
  /**
    *
    * @param name The name of the effect.
    * @param kernelMatrix The matrix to be applied to the image
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(name: String, kernelMatrix: Matrix, options: Double, camera: Nullable[Camera]) = this()
  def this(name: String, kernelMatrix: Matrix, options: PostProcessOptions, camera: Nullable[Camera]) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Engine
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Engine
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: Matrix,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Engine,
    reusable: Boolean
  ) = this()
}
/* static members */
object FilterPostProcess {
  
  @JSImport("babylonjs/PostProcesses/index", "FilterPostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _Parse(parsedPostProcess: Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[typings.babylonjs.postProcessesFilterPostProcessMod.FilterPostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.postProcessesFilterPostProcessMod.FilterPostProcess]]
}
