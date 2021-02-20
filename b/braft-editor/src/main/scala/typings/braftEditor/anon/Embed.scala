package typings.braftEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Embed extends StObject {
  
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
  implicit class EmbedMutableBuilder[Self <: Embed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setEmbed(value: Boolean): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
    
    @scala.inline
    def setImage(value: Boolean): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
