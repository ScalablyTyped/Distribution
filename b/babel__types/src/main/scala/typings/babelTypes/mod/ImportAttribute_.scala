package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ImportAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportAttribute_
  extends BaseNode
     with _Node {
  
  var key: Identifier_ | StringLiteral_ = js.native
  
  @JSName("type")
  var type_ImportAttribute_ : ImportAttribute = js.native
  
  var value: StringLiteral_ = js.native
}
object ImportAttribute_ {
  
  @scala.inline
  def apply(key: Identifier_ | StringLiteral_, `type`: ImportAttribute, value: StringLiteral_): ImportAttribute_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAttribute_]
  }
  
  @scala.inline
  implicit class ImportAttribute_Ops[Self <: ImportAttribute_] (val x: Self) extends AnyVal {
    
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
    def setKey(value: Identifier_ | StringLiteral_): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ImportAttribute): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: StringLiteral_): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
