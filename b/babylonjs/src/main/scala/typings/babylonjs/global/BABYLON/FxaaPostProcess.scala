package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FxaaPostProcess")
@js.native
class FxaaPostProcess protected ()
  extends typings.babylonjs.BABYLON.FxaaPostProcess {
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double]
  ) = this()
}
/* static members */
object FxaaPostProcess {
  
  /** @hidden */
  @JSGlobal("BABYLON.FxaaPostProcess._Parse")
  @js.native
  def _Parse(
    parsedPostProcess: js.Any,
    targetCamera: typings.babylonjs.BABYLON.Camera,
    scene: typings.babylonjs.BABYLON.Scene,
    rootUrl: String
  ): typings.babylonjs.BABYLON.FxaaPostProcess = js.native
}
