package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var location: Height
  var words: String
}

object Location {
  @scala.inline
  def apply(location: Height, words: String): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

