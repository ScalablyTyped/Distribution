package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlNode
  extends ValueNodeType
     with BaseNode {
  var innerSpacingAfter: js.UndefOr[String] = js.undefined
  var innerSpacingBefore: js.UndefOr[String] = js.undefined
  var stringType: js.UndefOr[String] = js.undefined
  var `type`: url
  var url: String
}

object UrlNode {
  @scala.inline
  def apply(
    `type`: url,
    url: String,
    after: String = null,
    before: String = null,
    innerSpacingAfter: String = null,
    innerSpacingBefore: String = null,
    name: String = null,
    stringType: String = null
  ): UrlNode = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (innerSpacingAfter != null) __obj.updateDynamic("innerSpacingAfter")(innerSpacingAfter.asInstanceOf[js.Any])
    if (innerSpacingBefore != null) __obj.updateDynamic("innerSpacingBefore")(innerSpacingBefore.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stringType != null) __obj.updateDynamic("stringType")(stringType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlNode]
  }
}

