package typings.babylonjs.global.BABYLON

import typings.babylonjs.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ExternalTexture")
@js.native
open class ExternalTexture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ExternalTexture {
  /**
    * Constructs the texture
    * @param video The video the texture should be wrapped around
    */
  def this(video: HTMLVideoElement) = this()
}
/* static members */
object ExternalTexture {
  
  @JSGlobal("BABYLON.ExternalTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks if a texture is an external or internal texture
    * @param texture the external or internal texture
    * @returns true if the texture is an external texture, else false
    */
  inline def IsExternalTexture(texture: typings.babylonjs.BABYLON.ExternalTexture): /* is babylonjs.BABYLON.ExternalTexture */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsExternalTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.BABYLON.ExternalTexture */ Boolean]
  inline def IsExternalTexture(texture: typings.babylonjs.BABYLON.InternalTexture): /* is babylonjs.BABYLON.ExternalTexture */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsExternalTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.BABYLON.ExternalTexture */ Boolean]
}
