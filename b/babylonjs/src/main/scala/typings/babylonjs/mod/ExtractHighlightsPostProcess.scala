package typings.babylonjs.mod

import typings.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ExtractHighlightsPostProcess")
@js.native
open class ExtractHighlightsPostProcess protected ()
  extends typings.babylonjs.legacyLegacyMod.ExtractHighlightsPostProcess {
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.enginesEngineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}
