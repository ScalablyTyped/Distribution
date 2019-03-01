package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var line: scala.Double
  var name: java.lang.String
}

object Tag {
  @scala.inline
  def apply(line: scala.Double, name: java.lang.String): Tag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Tag]
  }
}

