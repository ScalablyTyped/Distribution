package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeInternalSlot
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
  implicit class ObjectTypeInternalSlot_Ops[Self <: ObjectTypeInternalSlot_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: Boolean): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeInternalSlot): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FlowType): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
