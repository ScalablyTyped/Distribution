package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumNumberMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait EnumNumberMember_
  extends EnumMember
     with BaseNode {
  
  var id: Identifier_ = js.native
  
  var init: NumericLiteral_ = js.native
  
  @JSName("type")
  var type_EnumNumberMember_ : EnumNumberMember = js.native
}
object EnumNumberMember_ {
  
  @scala.inline
  def apply(id: Identifier_, init: NumericLiteral_, `type`: EnumNumberMember): EnumNumberMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumNumberMember_]
  }
  
  @scala.inline
  implicit class EnumNumberMember_MutableBuilder[Self <: EnumNumberMember_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: NumericLiteral_): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EnumNumberMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
