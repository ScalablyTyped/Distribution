package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeInternalSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ObjectTypeInternalSlot_
  extends Flow
     with BaseNode
     with UserWhitespacable {
  
  var id: Identifier_ = js.native
  
  var method: Boolean = js.native
  
  var optional: Boolean = js.native
  
  var static: Boolean = js.native
  
  @JSName("type")
  var type_ObjectTypeInternalSlot_ : ObjectTypeInternalSlot = js.native
  
  var value: FlowType = js.native
}
object ObjectTypeInternalSlot_ {
  
  @scala.inline
  def apply(
    id: Identifier_,
    method: Boolean,
    optional: Boolean,
    static: Boolean,
    `type`: ObjectTypeInternalSlot,
    value: FlowType
  ): ObjectTypeInternalSlot_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeInternalSlot_]
  }
  
  @scala.inline
  implicit class ObjectTypeInternalSlot_MutableBuilder[Self <: ObjectTypeInternalSlot_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeInternalSlot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FlowType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
