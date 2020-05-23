package typings.csso.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classes extends js.Object {
  var classes: js.UndefOr[js.Array[String]] = js.undefined
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Classes {
  @scala.inline
  def apply(classes: js.Array[String] = null, ids: js.Array[String] = null, tags: js.Array[String] = null): Classes = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
}

