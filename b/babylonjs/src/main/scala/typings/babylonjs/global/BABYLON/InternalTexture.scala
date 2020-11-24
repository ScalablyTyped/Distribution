package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.InternalTexture")
@js.native
class InternalTexture protected ()
  extends typings.babylonjs.BABYLON.InternalTexture {
  /**
    * Creates a new InternalTexture
    * @param engine defines the engine to use
    * @param source defines the type of data that will be used
    * @param delayAllocation if the texture allocation should be delayed (default: false)
    */
  def this(
    engine: typings.babylonjs.BABYLON.ThinEngine,
    source: typings.babylonjs.BABYLON.InternalTextureSource
  ) = this()
  def this(
    engine: typings.babylonjs.BABYLON.ThinEngine,
    source: typings.babylonjs.BABYLON.InternalTextureSource,
    delayAllocation: Boolean
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.InternalTexture")
@js.native
object InternalTexture extends js.Object {
  
  /** @hidden */
  def _UpdateRGBDAsync(
    internalTexture: typings.babylonjs.BABYLON.InternalTexture,
    data: js.Array[js.Array[ArrayBufferView]],
    sphericalPolynomial: Nullable[typings.babylonjs.BABYLON.SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
}
