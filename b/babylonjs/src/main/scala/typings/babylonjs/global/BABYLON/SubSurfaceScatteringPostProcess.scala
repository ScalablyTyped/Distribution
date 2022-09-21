package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SubSurfaceScatteringPostProcess")
@js.native
open class SubSurfaceScatteringPostProcess protected ()
  extends StObject
     with typings.babylonjs.BABYLON.SubSurfaceScatteringPostProcess {
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    options: Double | PostProcessOptions,
    camera: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typings.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double]
  ) = this()
}
