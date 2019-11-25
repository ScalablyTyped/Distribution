package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var flags: String | Null
  var matcher: String | Null
  var name: Identifier
  @JSName("type")
  var type_AttributeSelector: typings.cssDashTree.cssDashTreeStrings.AttributeSelector
  var value: StringNode | Identifier | Null
}

object AttributeSelector {
  @scala.inline
  def apply(
    name: Identifier,
    `type`: typings.cssDashTree.cssDashTreeStrings.AttributeSelector,
    flags: String = null,
    loc: CssLocation = null,
    matcher: String = null,
    value: StringNode | Identifier = null
  ): AttributeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(matcher.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeSelector]
  }
}

