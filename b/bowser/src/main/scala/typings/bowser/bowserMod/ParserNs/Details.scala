package typings.bowser.bowserMod.ParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Details {
  @scala.inline
  def apply(name: String = null, version: String = null): Details = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Details]
  }
}

