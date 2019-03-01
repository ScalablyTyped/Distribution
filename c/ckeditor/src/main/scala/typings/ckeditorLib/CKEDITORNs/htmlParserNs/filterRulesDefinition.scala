package typings
package ckeditorLib.CKEDITORNs.htmlParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait filterRulesDefinition extends js.Object {
  var attributeNames: js.UndefOr[js.Any] = js.undefined
  var attributes: js.UndefOr[js.Any] = js.undefined
  var comment: js.UndefOr[js.Any] = js.undefined
  var elementNames: js.UndefOr[js.Any] = js.undefined
  var elements: js.UndefOr[js.Any] = js.undefined
  var root: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[js.Any] = js.undefined
}

object filterRulesDefinition {
  @scala.inline
  def apply(
    attributeNames: js.Any = null,
    attributes: js.Any = null,
    comment: js.Any = null,
    elementNames: js.Any = null,
    elements: js.Any = null,
    root: js.Any = null,
    text: js.Any = null
  ): filterRulesDefinition = {
    val __obj = js.Dynamic.literal()
    if (attributeNames != null) __obj.updateDynamic("attributeNames")(attributeNames)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (elementNames != null) __obj.updateDynamic("elementNames")(elementNames)
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (root != null) __obj.updateDynamic("root")(root)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[filterRulesDefinition]
  }
}

