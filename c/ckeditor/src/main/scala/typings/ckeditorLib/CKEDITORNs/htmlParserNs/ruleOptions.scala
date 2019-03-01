package typings
package ckeditorLib.CKEDITORNs.htmlParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ruleOptions extends js.Object {
  var applyToAll: js.UndefOr[scala.Boolean] = js.undefined
  var excludeNestedEditable: js.UndefOr[scala.Boolean] = js.undefined
}

object ruleOptions {
  @scala.inline
  def apply(
    applyToAll: js.UndefOr[scala.Boolean] = js.undefined,
    excludeNestedEditable: js.UndefOr[scala.Boolean] = js.undefined
  ): ruleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyToAll)) __obj.updateDynamic("applyToAll")(applyToAll)
    if (!js.isUndefined(excludeNestedEditable)) __obj.updateDynamic("excludeNestedEditable")(excludeNestedEditable)
    __obj.asInstanceOf[ruleOptions]
  }
}

