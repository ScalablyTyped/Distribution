package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.EnumNumberBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumNumberBody_
  extends StObject
     with BaseNode
     with EnumBody
     with Flow
     with Node {
  
  var explicitType: Boolean
  
  var hasUnknownMembers: Boolean
  
  var members: js.Array[EnumNumberMember_]
  
  @JSName("type")
  var type_EnumNumberBody_ : EnumNumberBody
}
object EnumNumberBody_ {
  
  inline def apply(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumNumberMember_]): EnumNumberBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumNumberBody")
    __obj.asInstanceOf[EnumNumberBody_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumNumberBody_] (val x: Self) extends AnyVal {
    
    inline def setExplicitType(value: Boolean): Self = StObject.set(x, "explicitType", value.asInstanceOf[js.Any])
    
    inline def setHasUnknownMembers(value: Boolean): Self = StObject.set(x, "hasUnknownMembers", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[EnumNumberMember_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: EnumNumberMember_ *): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: EnumNumberBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
