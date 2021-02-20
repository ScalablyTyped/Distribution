package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSUnionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSUnionType_
  extends TSType
     with BaseNode {
  
  @JSName("type")
  var type_TSUnionType_ : TSUnionType = js.native
  
  var types: js.Array[TSType] = js.native
}
object TSUnionType_ {
  
  @scala.inline
  def apply(`type`: TSUnionType, types: js.Array[TSType]): TSUnionType_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSUnionType_]
  }
  
  @scala.inline
  implicit class TSUnionType_MutableBuilder[Self <: TSUnionType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[TSType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: TSType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
