package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXOpeningElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait JSXOpeningElement_
  extends Immutable
     with BaseNode
     with JSX {
  var attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_] = js.native
  var name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_ = js.native
  var selfClosing: Boolean = js.native
  var typeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ | Null = js.native
  @JSName("type")
  var type_JSXOpeningElement_ : JSXOpeningElement = js.native
}

object JSXOpeningElement_ {
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean,
    `type`: JSXOpeningElement
  ): JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXOpeningElement_]
  }
  @scala.inline
  implicit class JSXOpeningElement_Ops[Self <: JSXOpeningElement_] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: (JSXAttribute_ | JSXSpreadAttribute_)*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[JSXAttribute_ | JSXSpreadAttribute_]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelfClosing(value: Boolean): Self = this.set("selfClosing", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: JSXOpeningElement): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeParameters(value: TypeParameterInstantiation_ | TSTypeParameterInstantiation_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
  
}

