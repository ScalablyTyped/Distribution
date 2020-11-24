package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSIntersectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSIntersectionType_
  extends TSType
     with BaseNode {
  
  @JSName("type")
  var type_TSIntersectionType_ : TSIntersectionType = js.native
  
  var types: js.Array[TSType] = js.native
}
object TSIntersectionType_ {
  
  @scala.inline
  def apply(`type`: TSIntersectionType, types: js.Array[TSType]): TSIntersectionType_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSIntersectionType_]
  }
  
  @scala.inline
  implicit class TSIntersectionType_Ops[Self <: TSIntersectionType_] (val x: Self) extends AnyVal {
    
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
    def setType(value: TSIntersectionType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: TSType*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[TSType]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
}
