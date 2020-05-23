package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PostProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ImageProcessingPostProcess")
@js.native
class ImageProcessingPostProcess protected ()
  extends typings.babylonjs.BABYLON.ImageProcessingPostProcess {
  def this(
    name: String,
    options: Double,
    camera: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    imageProcessingConfiguration: js.UndefOr[typings.babylonjs.BABYLON.ImageProcessingConfiguration]
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    imageProcessingConfiguration: js.UndefOr[typings.babylonjs.BABYLON.ImageProcessingConfiguration]
  ) = this()
}

