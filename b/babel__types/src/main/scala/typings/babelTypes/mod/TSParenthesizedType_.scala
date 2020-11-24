package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSParenthesizedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSParenthesizedType_
  extends TSType
     with BaseNode {
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSParenthesizedType_ : TSParenthesizedType = js.native
}
object TSParenthesizedType_ {
  
  @scala.inline
  def apply(`type`: TSParenthesizedType, typeAnnotation: TSType): TSParenthesizedType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSParenthesizedType_]
  }
  
  @scala.inline
  implicit class TSParenthesizedType_Ops[Self <: TSParenthesizedType_] (val x: Self) extends AnyVal {
    
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
    def setType(value: TSParenthesizedType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
  }
}
