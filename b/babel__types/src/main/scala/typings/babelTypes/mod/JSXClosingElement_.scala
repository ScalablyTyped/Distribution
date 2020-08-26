package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXClosingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait JSXClosingElement_
  extends Immutable
     with BaseNode
     with JSX {
  var name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_ = js.native
  @JSName("type")
  var type_JSXClosingElement_ : JSXClosingElement = js.native
}

object JSXClosingElement_ {
  @scala.inline
  def apply(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_, `type`: JSXClosingElement): JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingElement_]
  }
  @scala.inline
  implicit class JSXClosingElement_Ops[Self <: JSXClosingElement_] (val x: Self) extends AnyVal {
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
    def setName(value: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: JSXClosingElement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

