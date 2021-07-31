package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ArrayPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait ArrayPattern_
  extends StObject
     with BaseNode
     with LVal
     with Pattern
     with PatternLike {
  
  var decorators: js.Array[Decorator_] | Null
  
  var elements: js.Array[Null | PatternLike]
  
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null
  
  @JSName("type")
  var type_ArrayPattern_ : ArrayPattern
}
object ArrayPattern_ {
  
  @scala.inline
  def apply(elements: js.Array[Null | PatternLike]): ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[ArrayPattern_]
  }
  
  @scala.inline
  implicit class ArrayPattern_MutableBuilder[Self <: ArrayPattern_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[Null | PatternLike]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: (Null | PatternLike)*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ArrayPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
