package typings.csso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Classes extends js.Object {
  var classes: js.UndefOr[js.Array[String]] = js.undefined
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Classes {
  @scala.inline
  def apply(classes: js.Array[String] = null, ids: js.Array[String] = null, tags: js.Array[String] = null): Anon_Classes = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_Classes]
  }
}

