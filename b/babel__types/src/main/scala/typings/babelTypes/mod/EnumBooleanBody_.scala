package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumBooleanBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait EnumBooleanBody_
  extends EnumBody
     with BaseNode {
  
  var explicit: Boolean = js.native
  
  var members: js.Array[EnumBooleanMember_] = js.native
  
  @JSName("type")
  var type_EnumBooleanBody_ : EnumBooleanBody = js.native
}
object EnumBooleanBody_ {
  
  @scala.inline
  def apply(explicit: Boolean, members: js.Array[EnumBooleanMember_], `type`: EnumBooleanBody): EnumBooleanBody_ = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumBooleanBody_]
  }
  
  @scala.inline
  implicit class EnumBooleanBody_MutableBuilder[Self <: EnumBooleanBody_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[EnumBooleanMember_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnumBooleanMember_ *): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: EnumBooleanBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
