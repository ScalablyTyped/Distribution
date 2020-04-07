package typings.babylonjs.mod

import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "ImageProcessingPostProcess")
@js.native
class ImageProcessingPostProcess protected ()
  extends typings.babylonjs.legacyMod.ImageProcessingPostProcess {
  def this(
    name: String,
    options: Double,
    camera: js.UndefOr[Nullable[typings.babylonjs.cameraMod.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    imageProcessingConfiguration: js.UndefOr[typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration]
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: js.UndefOr[Nullable[typings.babylonjs.cameraMod.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    imageProcessingConfiguration: js.UndefOr[typings.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration]
  ) = this()
}

