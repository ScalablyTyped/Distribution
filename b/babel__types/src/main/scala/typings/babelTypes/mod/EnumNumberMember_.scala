package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumNumberMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait EnumNumberMember_
  extends StObject
     with BaseNode
     with EnumMember {
  
  var id: Identifier_
  
  var init: NumericLiteral_
  
  @JSName("type")
  var type_EnumNumberMember_ : EnumNumberMember
}
object EnumNumberMember_ {
  
  @scala.inline
  def apply(id: Identifier_, init: NumericLiteral_): EnumNumberMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumNumberMember")
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
