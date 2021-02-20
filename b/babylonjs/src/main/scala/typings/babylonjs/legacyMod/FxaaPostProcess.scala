package typings.babylonjs.legacyMod

import typings.babylonjs.postProcessMod.PostProcessOptions
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "FxaaPostProcess")
@js.native
class FxaaPostProcess protected ()
  extends typings.babylonjs.indexMod.FxaaPostProcess {
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: js.UndefOr[Nullable[typings.babylonjs.cameraMod.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.engineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double]
  ) = this()
}
/* static members */
object FxaaPostProcess {
  
  /** @hidden */
  @JSImport("babylonjs/Legacy/legacy", "FxaaPostProcess._Parse")
  @js.native
  def _Parse(
    parsedPostProcess: js.Any,
    targetCamera: typings.babylonjs.cameraMod.Camera,
    scene: typings.babylonjs.sceneMod.Scene,
    rootUrl: String
  ): typings.babylonjs.fxaaPostProcessMod.FxaaPostProcess = js.native
}
