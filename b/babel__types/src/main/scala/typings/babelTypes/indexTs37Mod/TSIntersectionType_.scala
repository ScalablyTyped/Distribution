package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSIntersectionType
import org.scalablytyped.runtime.StObject
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
  implicit class TSIntersectionType_MutableBuilder[Self <: TSIntersectionType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSIntersectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[TSType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: TSType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
