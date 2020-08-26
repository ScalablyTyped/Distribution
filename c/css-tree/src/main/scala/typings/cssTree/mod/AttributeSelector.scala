package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var flags: String | Null = js.native
  var matcher: String | Null = js.native
  var name: Identifier = js.native
  @JSName("type")
  var type_AttributeSelector: typings.cssTree.cssTreeStrings.AttributeSelector = js.native
  var value: StringNode | Identifier | Null = js.native
}

object AttributeSelector {
  @scala.inline
  def apply(name: Identifier, `type`: typings.cssTree.cssTreeStrings.AttributeSelector): AttributeSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeSelector]
  }
  @scala.inline
  implicit class AttributeSelectorOps[Self <: AttributeSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: Identifier): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.AttributeSelector): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlagsNull: Self = this.set("flags", null)
    @scala.inline
    def setMatcher(value: String): Self = this.set("matcher", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatcherNull: Self = this.set("matcher", null)
    @scala.inline
    def setValue(value: StringNode | Identifier): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

