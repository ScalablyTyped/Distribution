package typings
package backboneDotPaginatorLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableParseLinksOptions extends js.Object {
  var xhr: js.UndefOr[jqueryLib.JQueryXHR] = js.undefined
}

object PageableParseLinksOptions {
  @scala.inline
  def apply(xhr: jqueryLib.JQueryXHR = null): PageableParseLinksOptions = {
    val __obj = js.Dynamic.literal()
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[PageableParseLinksOptions]
  }
}

