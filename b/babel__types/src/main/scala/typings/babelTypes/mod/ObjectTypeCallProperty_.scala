package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeCallProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ObjectTypeCallProperty_
  extends Flow
     with BaseNode
     with UserWhitespacable {
  
  var static: Boolean = js.native
  
  @JSName("type")
  var type_ObjectTypeCallProperty_ : ObjectTypeCallProperty = js.native
  
  var value: FlowType = js.native
}
object ObjectTypeCallProperty_ {
  
  @scala.inline
  def apply(static: Boolean, `type`: ObjectTypeCallProperty, value: FlowType): ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeCallProperty_]
  }
  
  @scala.inline
  implicit class ObjectTypeCallProperty_Ops[Self <: ObjectTypeCallProperty_] (val x: Self) extends AnyVal {
    
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
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeCallProperty): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FlowType): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
