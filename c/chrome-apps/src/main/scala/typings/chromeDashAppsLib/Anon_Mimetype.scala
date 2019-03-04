package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mimetype extends js.Object {
  /** The MIME type for which the Native Client module will be registered as content handler. */
  var mime_type: java.lang.String
  /** The location of a Native Client manifest (a .nmf file) within the app's directory. */
  var path: java.lang.String
}

object Anon_Mimetype {
  @scala.inline
  def apply(mime_type: java.lang.String, path: java.lang.String): Anon_Mimetype = {
    val __obj = js.Dynamic.literal(mime_type = mime_type, path = path)
  
    __obj.asInstanceOf[Anon_Mimetype]
  }
}

