package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ArrayPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayPattern_
  extends StObject
     with BaseNode
     with LVal
     with Node
     with Pattern
     with PatternLike
     with Standardized {
  
  var decorators: js.UndefOr[js.Array[Decorator_] | Null] = js.undefined
  
  var elements: js.Array[Null | PatternLike | LVal]
  
  var optional: js.UndefOr[Boolean | Null] = js.undefined
  
  var typeAnnotation: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null] = js.undefined
  
  @JSName("type")
  var type_ArrayPattern_ : ArrayPattern
}
object ArrayPattern_ {
  
  inline def apply(elements: js.Array[Null | PatternLike | LVal]): ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[ArrayPattern_]
  }
  
  extension [Self <: ArrayPattern_](x: Self) {
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setElements(value: js.Array[Null | PatternLike | LVal]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: (Null | PatternLike | LVal)*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setType(value: ArrayPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation | Noop_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
