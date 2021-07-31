package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.EnumStringBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait EnumStringBody_
  extends StObject
     with BaseNode
     with EnumBody {
  
  var explicit: Boolean
  
  var members: js.Array[EnumStringMember_ | EnumDefaultedMember_]
  
  @JSName("type")
  var type_EnumStringBody_ : EnumStringBody
}
object EnumStringBody_ {
  
  @scala.inline
  def apply(explicit: Boolean, members: js.Array[EnumStringMember_ | EnumDefaultedMember_]): EnumStringBody_ = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumStringBody")
    __obj.asInstanceOf[EnumStringBody_]
  }
  
  @scala.inline
  implicit class EnumStringBody_MutableBuilder[Self <: EnumStringBody_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[EnumStringMember_ | EnumDefaultedMember_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: (EnumStringMember_ | EnumDefaultedMember_)*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: EnumStringBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
