package typings.deezerSdk.DeezerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
  */
trait Track extends StObject {
  
  val album: Album
  
  val artist: Artist
  
  /** Duration in seconds (int) */
  val duration: Double
  
  val id: String
  
  val title: String
}
object Track {
  
  @scala.inline
  def apply(album: Album, artist: Artist, duration: Double, id: String, title: String): Track = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
  
  @scala.inline
  implicit class TrackMutableBuilder[Self <: Track] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum(value: Album): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtist(value: Artist): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
