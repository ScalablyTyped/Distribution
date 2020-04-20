package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMimetype extends js.Object {
  /** The MIME type for which the Native Client module will be registered as content handler. */
  var mime_type: String
  /** The location of a Native Client manifest (a .nmf file) within the app's directory. */
  var path: String
}

object AnonMimetype {
  @scala.inline
  def apply(mime_type: String, path: String): AnonMimetype = {
    val __obj = js.Dynamic.literal(mime_type = mime_type.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMimetype]
  }
}

