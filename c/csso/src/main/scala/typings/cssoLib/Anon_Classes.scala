package typings
package cssoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Classes extends js.Object {
  var classes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Classes {
  @scala.inline
  def apply(
    classes: js.Array[java.lang.String] = null,
    ids: js.Array[java.lang.String] = null,
    tags: js.Array[java.lang.String] = null
  ): Anon_Classes = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_Classes]
  }
}

