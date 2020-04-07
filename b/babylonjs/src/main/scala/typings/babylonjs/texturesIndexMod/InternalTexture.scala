package typings.babylonjs.texturesIndexMod

import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Textures/index", "InternalTexture")
@js.native
class InternalTexture protected ()
  extends typings.babylonjs.internalTextureMod.InternalTexture {
  /**
    * Creates a new InternalTexture
    * @param engine defines the engine to use
    * @param source defines the type of data that will be used
    * @param delayAllocation if the texture allocation should be delayed (default: false)
    */
  def this(engine: ThinEngine, source: typings.babylonjs.internalTextureMod.InternalTextureSource) = this()
  def this(
    engine: ThinEngine,
    source: typings.babylonjs.internalTextureMod.InternalTextureSource,
    delayAllocation: Boolean
  ) = this()
}

/* static members */
@JSImport("babylonjs/Materials/Textures/index", "InternalTexture")
@js.native
object InternalTexture extends js.Object {
  /** @hidden */
  def _UpdateRGBDAsync(
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: js.Array[js.Array[ArrayBufferView]],
    sphericalPolynomial: Nullable[SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
}

