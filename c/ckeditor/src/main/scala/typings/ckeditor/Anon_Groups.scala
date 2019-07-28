package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Groups extends js.Object {
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  var items: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
}

object Anon_Groups {
  @scala.inline
  def apply(name: String, groups: js.Array[String] = null, items: js.Array[String] = null): Anon_Groups = {
    val __obj = js.Dynamic.literal(name = name)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Anon_Groups]
  }
}

