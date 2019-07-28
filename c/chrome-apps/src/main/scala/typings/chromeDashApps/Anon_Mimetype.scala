package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mimetype extends js.Object {
  /** The MIME type for which the Native Client module will be registered as content handler. */
  var mime_type: String
  /** The location of a Native Client manifest (a .nmf file) within the app's directory. */
  var path: String
}

object Anon_Mimetype {
  @scala.inline
  def apply(mime_type: String, path: String): Anon_Mimetype = {
    val __obj = js.Dynamic.literal(mime_type = mime_type, path = path)
  
    __obj.asInstanceOf[Anon_Mimetype]
  }
}

