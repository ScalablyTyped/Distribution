package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.media.Media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaSessionEventData extends EventData {
  
  var mediaSession: Media = js.native
}
object MediaSessionEventData {
  
  @scala.inline
  def apply(mediaSession: Media, `type`: String): MediaSessionEventData = {
    val __obj = js.Dynamic.literal(mediaSession = mediaSession.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSessionEventData]
  }
  
  @scala.inline
  implicit class MediaSessionEventDataMutableBuilder[Self <: MediaSessionEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaSession(value: Media): Self = StObject.set(x, "mediaSession", value.asInstanceOf[js.Any])
  }
}
