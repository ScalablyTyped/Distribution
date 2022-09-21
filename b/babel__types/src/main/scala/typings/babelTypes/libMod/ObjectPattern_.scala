package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ObjectPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPattern_
  extends StObject
     with BaseNode
     with LVal
     with Node
     with Pattern
     with PatternLike
     with Standardized {
  
  var decorators: js.UndefOr[js.Array[Decorator_] | Null] = js.undefined
  
  var properties: js.Array[RestElement_ | ObjectProperty_]
  
  var typeAnnotation: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null] = js.undefined
  
  @JSName("type")
  var type_ObjectPattern_ : ObjectPattern
}
object ObjectPattern_ {
  
  inline def apply(properties: js.Array[RestElement_ | ObjectProperty_]): ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[ObjectPattern_]
  }
  
  extension [Self <: ObjectPattern_](x: Self) {
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setProperties(value: js.Array[RestElement_ | ObjectProperty_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: (RestElement_ | ObjectProperty_)*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation | Noop_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
