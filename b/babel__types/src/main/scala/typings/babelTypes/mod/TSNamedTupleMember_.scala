package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSNamedTupleMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSNamedTupleMember_
  extends BaseNode
     with _Node {
  
  var elementType: TSType = js.native
  
  var label: Identifier_ = js.native
  
  var optional: Boolean = js.native
  
  @JSName("type")
  var type_TSNamedTupleMember_ : TSNamedTupleMember = js.native
}
object TSNamedTupleMember_ {
  
  @scala.inline
  def apply(elementType: TSType, label: Identifier_, optional: Boolean, `type`: TSNamedTupleMember): TSNamedTupleMember_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSNamedTupleMember_]
  }
  
  @scala.inline
  implicit class TSNamedTupleMember_MutableBuilder[Self <: TSNamedTupleMember_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementType(value: TSType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSNamedTupleMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
