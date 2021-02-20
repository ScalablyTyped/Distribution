package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumNumberBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait EnumNumberBody_
  extends EnumBody
     with BaseNode {
  
  var explicit: Boolean = js.native
  
  var members: js.Array[EnumNumberMember_] = js.native
  
  @JSName("type")
  var type_EnumNumberBody_ : EnumNumberBody = js.native
}
object EnumNumberBody_ {
  
  @scala.inline
  def apply(explicit: Boolean, members: js.Array[EnumNumberMember_], `type`: EnumNumberBody): EnumNumberBody_ = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumNumberBody_]
  }
  
  @scala.inline
  implicit class EnumNumberBody_MutableBuilder[Self <: EnumNumberBody_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[EnumNumberMember_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnumNumberMember_ *): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: EnumNumberBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
