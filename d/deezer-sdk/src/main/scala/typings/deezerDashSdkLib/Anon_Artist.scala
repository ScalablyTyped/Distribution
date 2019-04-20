package typings
package deezerDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Artist extends js.Object {
  var artist: java.lang.String
  var cover: java.lang.String
  var title: java.lang.String
}

object Anon_Artist {
  @scala.inline
  def apply(artist: java.lang.String, cover: java.lang.String, title: java.lang.String): Anon_Artist = {
    val __obj = js.Dynamic.literal(artist = artist, cover = cover, title = title)
  
    __obj.asInstanceOf[Anon_Artist]
  }
}

