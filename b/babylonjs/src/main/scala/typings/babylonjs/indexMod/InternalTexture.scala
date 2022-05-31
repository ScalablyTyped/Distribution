package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "InternalTexture")
@js.native
class InternalTexture protected ()
  extends typings.babylonjs.materialsIndexMod.InternalTexture {
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
  
  @JSImport("babylonjs/index", "InternalTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  inline def _UpdateRGBDAsync(
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: js.Array[js.Array[ArrayBufferView]],
    sphericalPolynomial: Nullable[typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_UpdateRGBDAsync")(internalTexture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], sphericalPolynomial.asInstanceOf[js.Any], lodScale.asInstanceOf[js.Any], lodOffset.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
