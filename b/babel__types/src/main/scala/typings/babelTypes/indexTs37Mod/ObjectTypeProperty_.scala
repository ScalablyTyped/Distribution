package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ObjectTypeProperty
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.init
import typings.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ObjectTypeProperty_
  extends Flow
     with BaseNode
     with UserWhitespacable {
  
  var key: Identifier_ | StringLiteral_ = js.native
  
  var kind: init | get | set = js.native
  
  var optional: Boolean = js.native
  
  var proto: Boolean = js.native
  
  var static: Boolean = js.native
  
  @JSName("type")
  var type_ObjectTypeProperty_ : ObjectTypeProperty = js.native
  
  var value: FlowType = js.native
  
  var variance: Variance_ | Null = js.native
}
object ObjectTypeProperty_ {
  
  @scala.inline
  def apply(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    `type`: ObjectTypeProperty,
    value: FlowType
  ): ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeProperty_]
  }
  
  @scala.inline
  implicit class ObjectTypeProperty_Ops[Self <: ObjectTypeProperty_] (val x: Self) extends AnyVal {
    
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
    def setKey(value: Identifier_ | StringLiteral_): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: init | get | set): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProto(value: Boolean): Self = this.set("proto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectTypeProperty): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FlowType): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariance(value: Variance_): Self = this.set("variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarianceNull: Self = this.set("variance", null)
  }
}
