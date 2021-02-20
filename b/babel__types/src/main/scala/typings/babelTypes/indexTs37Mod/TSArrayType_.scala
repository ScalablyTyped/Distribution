package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSArrayType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSArrayType_
  extends TSType
     with BaseNode {
  
  var elementType: TSType = js.native
  
  @JSName("type")
  var type_TSArrayType_ : TSArrayType = js.native
}
object TSArrayType_ {
  
  @scala.inline
  def apply(elementType: TSType, `type`: TSArrayType): TSArrayType_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSArrayType_]
  }
  
  @scala.inline
  implicit class TSArrayType_MutableBuilder[Self <: TSArrayType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementType(value: TSType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
