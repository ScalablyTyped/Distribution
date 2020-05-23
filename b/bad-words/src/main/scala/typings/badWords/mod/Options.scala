package typings.badWords.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var emptyList: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var list: js.UndefOr[js.Array[String]] = js.undefined
  var placeHolder: js.UndefOr[String] = js.undefined
  var regex: js.UndefOr[RegExp] = js.undefined
  var replaceRegex: js.UndefOr[RegExp] = js.undefined
  var splitRegex: js.UndefOr[RegExp] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    emptyList: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[String] = null,
    list: js.Array[String] = null,
    placeHolder: String = null,
    regex: RegExp = null,
    replaceRegex: RegExp = null,
    splitRegex: RegExp = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emptyList)) __obj.updateDynamic("emptyList")(emptyList.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (replaceRegex != null) __obj.updateDynamic("replaceRegex")(replaceRegex.asInstanceOf[js.Any])
    if (splitRegex != null) __obj.updateDynamic("splitRegex")(splitRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

