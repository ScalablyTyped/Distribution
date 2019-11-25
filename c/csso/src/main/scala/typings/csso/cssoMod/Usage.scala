package typings.csso.cssoMod

import typings.csso.Anon_Classes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Usage extends js.Object {
  var blacklist: js.UndefOr[Anon_Classes] = js.undefined
  var classes: js.UndefOr[js.Array[String]] = js.undefined
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  var scopes: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Usage {
  @scala.inline
  def apply(
    blacklist: Anon_Classes = null,
    classes: js.Array[String] = null,
    ids: js.Array[String] = null,
    scopes: js.Array[js.Array[String]] = null,
    tags: js.Array[String] = null
  ): Usage = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Usage]
  }
}

