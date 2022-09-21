package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoDome
  extends StObject
     with TextureDome[VideoTexture] {
  
  /* protected */ def _initTexture(urlsOrElement: HTMLVideoElement, scene: Scene, options: Any): VideoTexture = js.native
  
  /* private */ var _pointerObserver: Any = js.native
  
  /* private */ var _textureObserver: Any = js.native
  
  /**
    * Get the video mode of this dome
    */
  def videoMode: Double = js.native
  /**
    * Set the video mode of this dome.
    * @see textureMode
    */
  def videoMode_=(value: Double): Unit = js.native
  
  /**
    * Get the video texture associated with this video dome
    */
  def videoTexture: VideoTexture = js.native
}
