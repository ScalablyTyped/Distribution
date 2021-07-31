package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ObjectPattern_
  extends StObject
     with BaseNode
     with LVal
     with Pattern
     with PatternLike {
  
  var decorators: js.Array[Decorator_] | Null
  
  var properties: js.Array[RestElement_ | ObjectProperty_]
  
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null
  
  @JSName("type")
  var type_ObjectPattern_ : ObjectPattern
}
object ObjectPattern_ {
  
  @scala.inline
  def apply(properties: js.Array[RestElement_ | ObjectProperty_]): ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[ObjectPattern_]
  }
  
  @scala.inline
  implicit class ObjectPattern_MutableBuilder[Self <: ObjectPattern_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[RestElement_ | ObjectProperty_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: (RestElement_ | ObjectProperty_)*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
