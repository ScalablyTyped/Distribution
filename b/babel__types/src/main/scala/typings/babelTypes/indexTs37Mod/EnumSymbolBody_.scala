package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.EnumSymbolBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait EnumSymbolBody_
  extends StObject
     with BaseNode
     with EnumBody {
  
  var members: js.Array[EnumDefaultedMember_]
  
  @JSName("type")
  var type_EnumSymbolBody_ : EnumSymbolBody
}
object EnumSymbolBody_ {
  
  @scala.inline
  def apply(members: js.Array[EnumDefaultedMember_]): EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumSymbolBody")
    __obj.asInstanceOf[EnumSymbolBody_]
  }
  
  @scala.inline
  implicit class EnumSymbolBody_MutableBuilder[Self <: EnumSymbolBody_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[EnumDefaultedMember_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnumDefaultedMember_ *): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: EnumSymbolBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
