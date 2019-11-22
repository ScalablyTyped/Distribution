package typings.classDashTransformer.metadataExposeExcludeOptionsMod

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
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (name != null) __obj.updateDynamic("name")(name)
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (!js.isUndefined(toClassOnly)) __obj.updateDynamic("toClassOnly")(toClassOnly)
    if (!js.isUndefined(toPlainOnly)) __obj.updateDynamic("toPlainOnly")(toPlainOnly)
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposeOptions]
  }
}

