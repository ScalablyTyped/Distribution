package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoTextureSettings extends StObject {
  
  /**
    * Applies `autoplay` to video, if specified
    */
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  /**
    * Automatically updates internal texture from video at every frame in the render loop
    */
  var autoUpdateTexture: Boolean = js.native
  
  /**
    * Applies `loop` to video, if specified
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * Applies `muted` to video, if specified
    */
  var muted: js.UndefOr[Boolean] = js.native
  
  /**
    * Image src displayed during the video loading or until the user interacts with the video.
    */
  var poster: js.UndefOr[String] = js.native
}
object VideoTextureSettings {
  
  @scala.inline
  def apply(autoUpdateTexture: Boolean): VideoTextureSettings = {
    val __obj = js.Dynamic.literal(autoUpdateTexture = autoUpdateTexture.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTextureSettings]
  }
  
  @scala.inline
  implicit class VideoTextureSettingsMutableBuilder[Self <: VideoTextureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    @scala.inline
    def setAutoUpdateTexture(value: Boolean): Self = StObject.set(x, "autoUpdateTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
  }
}
