package typings.config.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigSource extends js.Object {
  var name: String
  var original: js.UndefOr[String] = js.undefined
  var parsed: js.Any
}

object IConfigSource {
  @scala.inline
  def apply(name: String, parsed: js.Any, original: String = null): IConfigSource = {
    val __obj = js.Dynamic.literal(name = name, parsed = parsed)
    if (original != null) __obj.updateDynamic("original")(original)
    __obj.asInstanceOf[IConfigSource]
  }
}

