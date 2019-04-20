package typings
package deezerDashSdkLib.DeezerSdkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
  */
trait Track extends js.Object {
  val album: Album
  val artist: Artist
  /** Duration in seconds (int) */
  val duration: scala.Double
  val id: java.lang.String
  val title: java.lang.String
}

object Track {
  @scala.inline
  def apply(
    album: Album,
    artist: Artist,
    duration: scala.Double,
    id: java.lang.String,
    title: java.lang.String
  ): Track = {
    val __obj = js.Dynamic.literal(album = album, artist = artist, duration = duration, id = id, title = title)
  
    __obj.asInstanceOf[Track]
  }
}

