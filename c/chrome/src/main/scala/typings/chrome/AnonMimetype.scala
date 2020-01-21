package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMimetype extends js.Object {
  var mime_type: String
  var path: String
}

object AnonMimetype {
  @scala.inline
  def apply(mime_type: String, path: String): AnonMimetype = {
    val __obj = js.Dynamic.literal(mime_type = mime_type.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMimetype]
  }
}

