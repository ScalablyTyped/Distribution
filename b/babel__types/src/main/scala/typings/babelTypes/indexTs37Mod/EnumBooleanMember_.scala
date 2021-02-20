package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.EnumBooleanMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait EnumBooleanMember_
  extends EnumMember
     with BaseNode {
  
  var id: Identifier_ = js.native
  
  var init: BooleanLiteral_ = js.native
  
  @JSName("type")
  var type_EnumBooleanMember_ : EnumBooleanMember = js.native
}
object EnumBooleanMember_ {
  
  @scala.inline
  def apply(id: Identifier_, init: BooleanLiteral_, `type`: EnumBooleanMember): EnumBooleanMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumBooleanMember_]
  }
  
  @scala.inline
  implicit class EnumBooleanMember_MutableBuilder[Self <: EnumBooleanMember_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: BooleanLiteral_): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EnumBooleanMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
