package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumStringMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait EnumStringMember_
  extends EnumMember
     with BaseNode {
  
  var id: Identifier_ = js.native
  
  var init: StringLiteral_ = js.native
  
  @JSName("type")
  var type_EnumStringMember_ : EnumStringMember = js.native
}
object EnumStringMember_ {
  
  @scala.inline
  def apply(id: Identifier_, init: StringLiteral_, `type`: EnumStringMember): EnumStringMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumStringMember_]
  }
  
  @scala.inline
  implicit class EnumStringMember_MutableBuilder[Self <: EnumStringMember_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: StringLiteral_): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EnumStringMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
