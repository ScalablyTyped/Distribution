package typings.deezerSdk.DeezerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
  */
trait Mp3Source extends StObject {
  
  val artist: String
  
  val title: String
  
  val url: String
}
object Mp3Source {
  
  @scala.inline
  def apply(artist: String, title: String, url: String): Mp3Source = {
    val __obj = js.Dynamic.literal(artist = artist.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mp3Source]
  }
  
  @scala.inline
  implicit class Mp3SourceMutableBuilder[Self <: Mp3Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
