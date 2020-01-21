package typings.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExposeOptions extends js.Object {
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var since: js.UndefOr[Double] = js.undefined
  var toClassOnly: js.UndefOr[Boolean] = js.undefined
  var toPlainOnly: js.UndefOr[Boolean] = js.undefined
  var until: js.UndefOr[Double] = js.undefined
}

object ExposeOptions {
  @scala.inline
  def apply(
    groups: js.Array[String] = null,
    name: String = null,
    since: Int | Double = null,
    toClassOnly: js.UndefOr[Boolean] = js.undefined,
    toPlainOnly: js.UndefOr[Boolean] = js.undefined,
    until: Int | Double = null
  ): ExposeOptions = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (!js.isUndefined(toClassOnly)) __obj.updateDynamic("toClassOnly")(toClassOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(toPlainOnly)) __obj.updateDynamic("toPlainOnly")(toPlainOnly.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposeOptions]
  }
}

