package typings.deezerDashSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
  */
trait Artist extends js.Object {
  val id: String
  val name: String
}

object Artist {
  @scala.inline
  def apply(id: String, name: String): Artist = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[Artist]
  }
}

