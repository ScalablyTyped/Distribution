package typings.deezerDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Artist extends js.Object {
  var artist: String
  var cover: String
  var title: String
}

object Anon_Artist {
  @scala.inline
  def apply(artist: String, cover: String, title: String): Anon_Artist = {
    val __obj = js.Dynamic.literal(artist = artist.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Artist]
  }
}

