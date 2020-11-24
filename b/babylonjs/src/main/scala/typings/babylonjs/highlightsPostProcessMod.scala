package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/highlightsPostProcess", JSImport.Namespace)
@js.native
object highlightsPostProcessMod extends js.Object {
  
  @js.native
  class HighlightsPostProcess protected () extends PostProcess {
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
    def this(name: String, options: Double, camera: Nullable[Camera]) = this()
    def this(name: String, options: PostProcessOptions, camera: Nullable[Camera]) = this()
    def this(name: String, options: Double, camera: Nullable[Camera], samplingMode: Double) = this()
    def this(name: String, options: PostProcessOptions, camera: Nullable[Camera], samplingMode: Double) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine
    ) = this()
    def this(name: String, options: Double, camera: Nullable[Camera], samplingMode: Double, engine: Engine) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: Double,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[scala.Nothing],
      engine: Engine,
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: js.UndefOr[scala.Nothing],
      reusable: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      options: PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: Double,
      engine: Engine,
      reusable: Boolean,
      textureType: Double
    ) = this()
  }
}
