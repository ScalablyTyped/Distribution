package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "InternalTexture")
@js.native
class InternalTexture protected ()
  extends typings.babylonjs.legacyMod.InternalTexture {
  /**
    * Creates a new InternalTexture
    * @param engine defines the engine to use
    * @param source defines the type of data that will be used
    * @param delayAllocation if the texture allocation should be delayed (default: false)
    */
  def this(
    engine: typings.babylonjs.thinEngineMod.ThinEngine,
    source: typings.babylonjs.internalTextureMod.InternalTextureSource
  ) = this()
  def this(
    engine: typings.babylonjs.thinEngineMod.ThinEngine,
    source: typings.babylonjs.internalTextureMod.InternalTextureSource,
    delayAllocation: Boolean
  ) = this()
}
/* static members */
object InternalTexture {
  
  /** @hidden */
  @JSImport("babylonjs", "InternalTexture._UpdateRGBDAsync")
  @js.native
  def _UpdateRGBDAsync(
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: js.Array[js.Array[ArrayBufferView]],
    sphericalPolynomial: Nullable[typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
}
