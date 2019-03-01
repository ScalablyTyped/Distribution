package typings
package configLib.configMod.cNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigSource extends js.Object {
  var name: java.lang.String
  var original: js.UndefOr[java.lang.String] = js.undefined
  var parsed: js.Any
}

object IConfigSource {
  @scala.inline
  def apply(name: java.lang.String, parsed: js.Any, original: java.lang.String = null): IConfigSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parsed")(parsed)
    if (original != null) __obj.updateDynamic("original")(original)
    __obj.asInstanceOf[IConfigSource]
  }
}

