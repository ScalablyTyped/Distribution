package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.EnumDefaultedMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait EnumDefaultedMember_
  extends StObject
     with BaseNode
     with EnumMember {
  
  var id: Identifier_
  
  @JSName("type")
  var type_EnumDefaultedMember_ : EnumDefaultedMember
}
object EnumDefaultedMember_ {
  
  @scala.inline
  def apply(id: Identifier_): EnumDefaultedMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumDefaultedMember")
    __obj.asInstanceOf[EnumDefaultedMember_]
  }
  
  @scala.inline
  implicit class EnumDefaultedMember_MutableBuilder[Self <: EnumDefaultedMember_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EnumDefaultedMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
