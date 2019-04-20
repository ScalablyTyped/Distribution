package typings
package deezerDashSdkLib.DeezerSdkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
  */
trait Album extends js.Object {
  val id: java.lang.String
  val title: java.lang.String
}

object Album {
  @scala.inline
  def apply(id: java.lang.String, title: java.lang.String): Album = {
    val __obj = js.Dynamic.literal(id = id, title = title)
  
    __obj.asInstanceOf[Album]
  }
}

