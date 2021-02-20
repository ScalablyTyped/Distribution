package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumDefaultedMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait EnumDefaultedMember_
  extends EnumMember
     with BaseNode {
  
  var id: Identifier_ = js.native
  
  @JSName("type")
  var type_EnumDefaultedMember_ : EnumDefaultedMember = js.native
}
object EnumDefaultedMember_ {
  
  @scala.inline
  def apply(id: Identifier_, `type`: EnumDefaultedMember): EnumDefaultedMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
