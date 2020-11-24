package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ClassPrivateProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ClassPrivateProperty_
  extends Private
     with BaseNode
     with Property {
  
  var decorators: js.Array[Decorator_] | Null = js.native
  
  var key: PrivateName_ = js.native
  
  var static: js.Any = js.native
  
  @JSName("type")
  var type_ClassPrivateProperty_ : ClassPrivateProperty = js.native
  
  var value: Expression | Null = js.native
}
object ClassPrivateProperty_ {
  
  @scala.inline
  def apply(key: PrivateName_, static: js.Any, `type`: ClassPrivateProperty): ClassPrivateProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassPrivateProperty_]
  }
  
  @scala.inline
  implicit class ClassPrivateProperty_Ops[Self <: ClassPrivateProperty_] (val x: Self) extends AnyVal {
    
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
    def setKey(value: PrivateName_): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: js.Any): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ClassPrivateProperty): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = this.set("decorators", js.Array(value :_*))
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = this.set("decorators", null)
    
    @scala.inline
    def setValue(value: Expression): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
