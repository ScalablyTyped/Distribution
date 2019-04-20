package typings
package deezerDashSdkLib.DeezerSdkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
  */
trait Mp3Source extends js.Object {
  val artist: java.lang.String
  val title: java.lang.String
  val url: java.lang.String
}

object Mp3Source {
  @scala.inline
  def apply(artist: java.lang.String, title: java.lang.String, url: java.lang.String): Mp3Source = {
    val __obj = js.Dynamic.literal(artist = artist, title = title, url = url)
  
    __obj.asInstanceOf[Mp3Source]
  }
}

