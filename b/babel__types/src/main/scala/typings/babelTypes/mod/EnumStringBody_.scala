package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumStringBody_
  extends StObject
     with BaseNode {
  
  var explicitType: Boolean
  
  var hasUnknownMembers: Boolean
  
  var members: js.Array[EnumStringMember_ | EnumDefaultedMember_]
  
  @JSName("type")
  var type_EnumStringBody_ : "EnumStringBody"
}
object EnumStringBody_ {
  
  inline def apply(
    explicitType: Boolean,
    hasUnknownMembers: Boolean,
    members: js.Array[EnumStringMember_ | EnumDefaultedMember_]
  ): EnumStringBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumStringBody")
    __obj.asInstanceOf[EnumStringBody_]
  }
  
  extension [Self <: EnumStringBody_](x: Self) {
    
    inline def setExplicitType(value: Boolean): Self = StObject.set(x, "explicitType", value.asInstanceOf[js.Any])
    
    inline def setHasUnknownMembers(value: Boolean): Self = StObject.set(x, "hasUnknownMembers", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[EnumStringMember_ | EnumDefaultedMember_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: (EnumStringMember_ | EnumDefaultedMember_)*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: "EnumStringBody"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
