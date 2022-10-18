package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ImageProcessingPostProcess")
@js.native
open class ImageProcessingPostProcess protected ()
  extends typings.babylonjs.indexMod.ImageProcessingPostProcess {
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: js.UndefOr[Nullable[typings.babylonjs.camerasCameraMod.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.enginesEngineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    imageProcessingConfiguration: js.UndefOr[
        typings.babylonjs.materialsImageProcessingConfigurationMod.ImageProcessingConfiguration
      ]
  ) = this()
}
