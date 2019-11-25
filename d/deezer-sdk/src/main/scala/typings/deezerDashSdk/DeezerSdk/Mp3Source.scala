package typings.deezerDashSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
  */
trait Mp3Source extends js.Object {
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
}

