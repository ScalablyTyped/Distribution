package typings
package deezerDashSdkLib.DeezerSdkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player_object | The player properties}
  */
trait Artist extends js.Object {
  val id: java.lang.String
  val name: java.lang.String
}

object Artist {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): Artist = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[Artist]
  }
}

