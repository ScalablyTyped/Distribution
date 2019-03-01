package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Groups extends js.Object {
  var groups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var items: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
}

object Anon_Groups {
  @scala.inline
  def apply(
    name: java.lang.String,
    groups: js.Array[java.lang.String] = null,
    items: js.Array[java.lang.String] = null
  ): Anon_Groups = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Anon_Groups]
  }
}

