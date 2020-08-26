package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait JSXAttribute_
  extends Immutable
     with BaseNode
     with JSX {
  var name: JSXIdentifier_ | JSXNamespacedName_ = js.native
  @JSName("type")
  var type_JSXAttribute_ : JSXAttribute = js.native
  var value: JSXElement_ | JSXFragment_ | StringLiteral_ | JSXExpressionContainer_ | Null = js.native
}

object JSXAttribute_ {
  @scala.inline
  def apply(name: JSXIdentifier_ | JSXNamespacedName_, `type`: JSXAttribute): JSXAttribute_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute_]
  }
  @scala.inline
  implicit class JSXAttribute_Ops[Self <: JSXAttribute_] (val x: Self) extends AnyVal {
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
    def setName(value: JSXIdentifier_ | JSXNamespacedName_): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: JSXAttribute): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: JSXElement_ | JSXFragment_ | StringLiteral_ | JSXExpressionContainer_): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

