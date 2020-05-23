package typings.ckeditor.CKEDITOR.htmlParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ruleOptions extends js.Object {
  var applyToAll: js.UndefOr[Boolean] = js.undefined
  var excludeNestedEditable: js.UndefOr[Boolean] = js.undefined
}

object ruleOptions {
  @scala.inline
  def apply(
    applyToAll: js.UndefOr[Boolean] = js.undefined,
    excludeNestedEditable: js.UndefOr[Boolean] = js.undefined
  ): ruleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyToAll)) __obj.updateDynamic("applyToAll")(applyToAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeNestedEditable)) __obj.updateDynamic("excludeNestedEditable")(excludeNestedEditable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ruleOptions]
  }
}

