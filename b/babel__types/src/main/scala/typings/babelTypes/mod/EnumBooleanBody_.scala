package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumBooleanBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait EnumBooleanBody_
  extends StObject
     with BaseNode
     with EnumBody {
  
  var explicit: Boolean
  
  var members: js.Array[EnumBooleanMember_]
  
  @JSName("type")
  var type_EnumBooleanBody_ : EnumBooleanBody
}
object EnumBooleanBody_ {
  
  inline def apply(explicit: Boolean, members: js.Array[EnumBooleanMember_]): EnumBooleanBody_ = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumBooleanBody")
    __obj.asInstanceOf[EnumBooleanBody_]
  }
  
  extension [Self <: EnumBooleanBody_](x: Self) {
    
    inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[EnumBooleanMember_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: EnumBooleanMember_ *): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setType(value: EnumBooleanBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
