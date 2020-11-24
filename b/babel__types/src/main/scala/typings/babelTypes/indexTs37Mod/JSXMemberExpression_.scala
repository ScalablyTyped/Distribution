package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait JSXMemberExpression_
  extends JSX
     with BaseNode {
  
  var `object`: JSXMemberExpression_ | JSXIdentifier_ = js.native
  
  var property: JSXIdentifier_ = js.native
  
  @JSName("type")
  var type_JSXMemberExpression_ : JSXMemberExpression = js.native
}
object JSXMemberExpression_ {
  
  @scala.inline
  def apply(
    `object`: JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    `type`: JSXMemberExpression
  ): JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXMemberExpression_]
  }
  
  @scala.inline
  implicit class JSXMemberExpression_Ops[Self <: JSXMemberExpression_] (val x: Self) extends AnyVal {
    
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
    def setObject(value: JSXMemberExpression_ | JSXIdentifier_): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: JSXIdentifier_): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXMemberExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
