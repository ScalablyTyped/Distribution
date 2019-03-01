package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mimetype extends js.Object {
  var mime_type: java.lang.String
  var path: java.lang.String
}

object Anon_Mimetype {
  @scala.inline
  def apply(mime_type: java.lang.String, path: java.lang.String): Anon_Mimetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mime_type")(mime_type)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_Mimetype]
  }
}

