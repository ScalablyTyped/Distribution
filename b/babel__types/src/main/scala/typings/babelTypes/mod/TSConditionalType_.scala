package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSConditionalType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSConditionalType_
  extends TSType
     with BaseNode {
  
  var checkType: TSType = js.native
  
  var extendsType: TSType = js.native
  
  var falseType: TSType = js.native
  
  var trueType: TSType = js.native
  
  @JSName("type")
  var type_TSConditionalType_ : TSConditionalType = js.native
}
object TSConditionalType_ {
  
  @scala.inline
  def apply(
    checkType: TSType,
    extendsType: TSType,
    falseType: TSType,
    trueType: TSType,
    `type`: TSConditionalType
  ): TSConditionalType_ = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSConditionalType_]
  }
  
  @scala.inline
  implicit class TSConditionalType_Ops[Self <: TSConditionalType_] (val x: Self) extends AnyVal {
    
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
    def setCheckType(value: TSType): Self = this.set("checkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsType(value: TSType): Self = this.set("extendsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalseType(value: TSType): Self = this.set("falseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueType(value: TSType): Self = this.set("trueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSConditionalType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
