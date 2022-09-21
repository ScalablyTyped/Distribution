package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.RenderTargetCreationOptions
import typings.babylonjs.BABYLON.TextureSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ThinRenderTargetTexture")
@js.native
open class ThinRenderTargetTexture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ThinRenderTargetTexture {
  /**
    * Instantiates a new ThinRenderTargetTexture.
    * Tiny helper class to wrap a RenderTargetWrapper in a texture.
    * This can be used as an internal texture wrapper in ThinEngine to benefit from the cache and to hold on the associated RTT
    * @param engine Define the internalTexture to wrap
    * @param size Define the size of the RTT to create
    * @param options Define rendertarget options
    */
  def this(
    engine: typings.babylonjs.BABYLON.ThinEngine,
    size: TextureSize,
    options: RenderTargetCreationOptions
  ) = this()
  
  /**
    * Entry point to access the wrapper on a texture.
    */
  /* CompleteClass */
  var renderTarget: Nullable[typings.babylonjs.BABYLON.RenderTargetWrapper] = js.native
}
