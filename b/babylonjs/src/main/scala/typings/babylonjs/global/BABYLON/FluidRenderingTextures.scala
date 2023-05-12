package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FluidRenderingTextures")
@js.native
open class FluidRenderingTextures protected ()
  extends StObject
     with typings.babylonjs.BABYLON.FluidRenderingTextures {
  def this(
    name: String,
    scene: typings.babylonjs.BABYLON.Scene,
    width: Double,
    height: Double,
    blurTextureSizeX: Double,
    blurTextureSizeY: Double,
    textureType: js.UndefOr[Double],
    textureFormat: js.UndefOr[Double],
    blurTextureType: js.UndefOr[Double],
    blurTextureFormat: js.UndefOr[Double],
    useStandardBlur: js.UndefOr[Boolean],
    camera: js.UndefOr[Nullable[typings.babylonjs.BABYLON.Camera]],
    generateDepthBuffer: js.UndefOr[Boolean],
    samples: js.UndefOr[Double]
  ) = this()
}
