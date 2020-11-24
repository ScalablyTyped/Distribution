package typings.babylonjs.indexMod

import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "FilterPostProcess")
@js.native
class FilterPostProcess protected ()
  extends typings.babylonjs.postProcessesIndexMod.FilterPostProcess {
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
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typings.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typings.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: Double,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    kernelMatrix: typings.babylonjs.mathVectorMod.Matrix,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.cameraMod.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
}
/* static members */
@JSImport("babylonjs/index", "FilterPostProcess")
@js.native
object FilterPostProcess extends js.Object {
  
  /** @hidden */
  def _Parse(
    parsedPostProcess: js.Any,
    targetCamera: typings.babylonjs.cameraMod.Camera,
    scene: typings.babylonjs.sceneMod.Scene,
    rootUrl: String
  ): Nullable[typings.babylonjs.filterPostProcessMod.FilterPostProcess] = js.native
}
