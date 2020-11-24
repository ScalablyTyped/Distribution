package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSQualifiedName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSQualifiedName_
  extends TSEntityName
     with BaseNode {
  
  var left: TSEntityName = js.native
  
  var right: Identifier_ = js.native
  
  @JSName("type")
  var type_TSQualifiedName_ : TSQualifiedName = js.native
}
object TSQualifiedName_ {
  
  @scala.inline
  def apply(left: TSEntityName, right: Identifier_, `type`: TSQualifiedName): TSQualifiedName_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSQualifiedName_]
  }
  
  @scala.inline
  implicit class TSQualifiedName_Ops[Self <: TSQualifiedName_] (val x: Self) extends AnyVal {
    
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
    def setLeft(value: TSEntityName): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Identifier_): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSQualifiedName): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
