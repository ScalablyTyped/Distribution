package typings
package cssoLib.cssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Usage extends js.Object {
  var blacklist: js.UndefOr[cssoLib.Anon_Classes] = js.undefined
  var classes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var scopes: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Usage {
  @scala.inline
  def apply(
    blacklist: cssoLib.Anon_Classes = null,
    classes: js.Array[java.lang.String] = null,
    ids: js.Array[java.lang.String] = null,
    scopes: js.Array[js.Array[java.lang.String]] = null,
    tags: js.Array[java.lang.String] = null
  ): Usage = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Usage]
  }
}

