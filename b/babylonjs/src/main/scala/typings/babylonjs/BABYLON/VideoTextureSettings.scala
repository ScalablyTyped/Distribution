package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoTextureSettings extends js.Object {
  
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
  implicit class VideoTextureSettingsOps[Self <: VideoTextureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoUpdateTexture(value: Boolean): Self = this.set("autoUpdateTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
  }
}
