package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends js.Object {
  var location: AnonHeight
  var words: String
}

object AnonLocation {
  @scala.inline
  def apply(location: AnonHeight, words: String): AnonLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocation]
  }
}

