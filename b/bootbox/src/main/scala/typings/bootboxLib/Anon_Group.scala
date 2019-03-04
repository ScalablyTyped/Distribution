package typings
package bootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Group extends js.Object {
  var group: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var value: java.lang.String
}

object Anon_Group {
  @scala.inline
  def apply(text: java.lang.String, value: java.lang.String, group: java.lang.String = null): Anon_Group = {
    val __obj = js.Dynamic.literal(text = text, value = value)
    if (group != null) __obj.updateDynamic("group")(group)
    __obj.asInstanceOf[Anon_Group]
  }
}

