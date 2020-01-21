package typings.deezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArtist extends js.Object {
  var artist: String
  var cover: String
  var title: String
}

object AnonArtist {
  @scala.inline
  def apply(artist: String, cover: String, title: String): AnonArtist = {
    val __obj = js.Dynamic.literal(artist = artist.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArtist]
  }
}

