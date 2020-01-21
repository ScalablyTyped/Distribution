package typings.backbonePaginator.mod

import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableParseLinksOptions extends js.Object {
  var xhr: js.UndefOr[JQueryXHR] = js.undefined
}

object PageableParseLinksOptions {
  @scala.inline
  def apply(xhr: JQueryXHR = null): PageableParseLinksOptions = {
    val __obj = js.Dynamic.literal()
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageableParseLinksOptions]
  }
}

