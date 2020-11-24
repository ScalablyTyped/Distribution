package typings.braftEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Embed extends js.Object {
  
  var audio: js.UndefOr[Boolean] = js.native
  
  var embed: js.UndefOr[Boolean] = js.native
  
  var image: js.UndefOr[Boolean] = js.native
  
  var video: js.UndefOr[Boolean] = js.native
}
object Embed {
  
  @scala.inline
  def apply(): Embed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Embed]
  }
  
  @scala.inline
  implicit class EmbedOps[Self <: Embed] (val x: Self) extends AnyVal {
    
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
    def setAudio(value: Boolean): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setEmbed(value: Boolean): Self = this.set("embed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbed: Self = this.set("embed", js.undefined)
    
    @scala.inline
    def setImage(value: Boolean): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setVideo(value: Boolean): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
}
