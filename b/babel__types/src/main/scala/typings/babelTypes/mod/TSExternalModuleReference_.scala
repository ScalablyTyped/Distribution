package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSExternalModuleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSExternalModuleReference_
  extends BaseNode
     with _Node {
  
  var expression: StringLiteral_ = js.native
  
  @JSName("type")
  var type_TSExternalModuleReference_ : TSExternalModuleReference = js.native
}
object TSExternalModuleReference_ {
  
  @scala.inline
  def apply(expression: StringLiteral_, `type`: TSExternalModuleReference): TSExternalModuleReference_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSExternalModuleReference_]
  }
  
  @scala.inline
  implicit class TSExternalModuleReference_Ops[Self <: TSExternalModuleReference_] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: StringLiteral_): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSExternalModuleReference): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
