package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThinRenderTargetTexture
  extends StObject
     with ThinTexture
     with IRenderTargetTexture {
  
  /* private */ var _renderTarget: Any = js.native
  
  /* private */ val _renderTargetOptions: Any = js.native
  
  /* private */ var _size: Any = js.native
  
  def dispose(disposeOnlyFramebuffers: Boolean): Unit = js.native
  
  /**
    * Gets the render target wrapper associated with this render target
    */
  @JSName("renderTarget")
  def renderTarget_MThinRenderTargetTexture: Nullable[RenderTargetWrapper] = js.native
  
  /**
    * Resize the texture to a new desired size.
    * Be careful as it will recreate all the data in the new texture.
    * @param size Define the new size. It can be:
    *   - a number for squared texture,
    *   - an object containing { width: number, height: number }
    */
  def resize(size: TextureSize): Unit = js.native
}
