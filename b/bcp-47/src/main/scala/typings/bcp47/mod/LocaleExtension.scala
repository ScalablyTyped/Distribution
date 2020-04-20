package typings.bcp47.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleExtension extends js.Object {
  var extensions: js.Array[String]
  var singleton: String
}

object LocaleExtension {
  @scala.inline
  def apply(extensions: js.Array[String], singleton: String): LocaleExtension = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], singleton = singleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleExtension]
  }
}

