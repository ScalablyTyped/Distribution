package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSLiteralType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSLiteralType_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  var literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_ = js.native
  
  @JSName("type")
  var type_TSLiteralType_ : TSLiteralType = js.native
}
object TSLiteralType_ {
  
  @scala.inline
  def apply(
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_,
    `type`: TSLiteralType
  ): TSLiteralType_ = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSLiteralType_]
  }
  
  @scala.inline
  implicit class TSLiteralType_Ops[Self <: TSLiteralType_] (val x: Self) extends AnyVal {
    
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
    def setLiteral(value: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_): Self = this.set("literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSLiteralType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
