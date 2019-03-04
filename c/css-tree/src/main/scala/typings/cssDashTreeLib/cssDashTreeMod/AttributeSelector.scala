package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var flags: java.lang.String | scala.Null
  var matcher: java.lang.String | scala.Null
  var name: Identifier
  @JSName("type")
  var type_AttributeSelector: cssDashTreeLib.cssDashTreeLibStrings.AttributeSelector
  var value: StringNode | Identifier | scala.Null
}

object AttributeSelector {
  @scala.inline
  def apply(
    name: Identifier,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.AttributeSelector,
    flags: java.lang.String = null,
    loc: CssLocation = null,
    matcher: java.lang.String = null,
    value: StringNode | Identifier = null
  ): AttributeSelector = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (matcher != null) __obj.updateDynamic("matcher")(matcher)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeSelector]
  }
}

