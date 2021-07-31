package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassPrivateProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ClassPrivateProperty_
  extends StObject
     with BaseNode
     with Private
     with Property {
  
  var decorators: js.Array[Decorator_] | Null
  
  var key: PrivateName_
  
  var static: js.Any
  
  @JSName("type")
  var type_ClassPrivateProperty_ : ClassPrivateProperty
  
  var value: Expression | Null
}
object ClassPrivateProperty_ {
  
  @scala.inline
  def apply(key: PrivateName_, static: js.Any): ClassPrivateProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, value = null)
    __obj.updateDynamic("type")("ClassPrivateProperty")
    __obj.asInstanceOf[ClassPrivateProperty_]
  }
  
  @scala.inline
  implicit class ClassPrivateProperty_MutableBuilder[Self <: ClassPrivateProperty_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: PrivateName_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: js.Any): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ClassPrivateProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
