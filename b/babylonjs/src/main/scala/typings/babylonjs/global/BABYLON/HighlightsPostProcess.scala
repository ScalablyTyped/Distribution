package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PostProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.HighlightsPostProcess")
@js.native
class HighlightsPostProcess protected ()
  extends typings.babylonjs.BABYLON.HighlightsPostProcess {
  /**
    * Extracts highlights from the image
    * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses
    * @param name The name of the effect.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of texture for the post process (default: Engine.TEXTURETYPE_UNSIGNED_INT)
    */
  def this(name: String, options: Double, camera: Nullable[typings.babylonjs.BABYLON.Camera]) = this()
  def this(name: String, options: PostProcessOptions, camera: Nullable[typings.babylonjs.BABYLON.Camera]) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: js.UndefOr[scala.Nothing],
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: js.UndefOr[scala.Nothing],
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: js.UndefOr[scala.Nothing],
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: js.UndefOr[scala.Nothing],
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: js.UndefOr[scala.Nothing],
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: js.UndefOr[scala.Nothing],
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: js.UndefOr[scala.Nothing],
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: js.UndefOr[scala.Nothing],
    textureType: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typings.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typings.babylonjs.BABYLON.Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
}
