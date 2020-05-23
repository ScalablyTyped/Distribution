package typings.cssGlobalVariables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autoprefix extends js.Object {
  var autoprefix: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var normalize: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
}

object Autoprefix {
  @scala.inline
  def apply(
    autoprefix: js.UndefOr[Boolean] = js.undefined,
    filter: String = null,
    normalize: /* name */ String => String = null
  ): Autoprefix = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoprefix)) __obj.updateDynamic("autoprefix")(autoprefix.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction1(normalize))
    __obj.asInstanceOf[Autoprefix]
  }
}

