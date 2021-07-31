package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ArrayPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayPattern_
  extends StObject
     with Node
     with LVal
     with Pattern {
  
  var elements: js.Array[Expression]
  
  var typeAnnotation: js.UndefOr[TypeAnnotation_] = js.undefined
  
  @JSName("type")
  var type_ArrayPattern_ : ArrayPattern
}
object ArrayPattern_ {
  
  @scala.inline
  def apply(elements: js.Array[Expression], end: Double, loc: SourceLocation, start: Double): ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[ArrayPattern_]
  }
  
  @scala.inline
  implicit class ArrayPattern_MutableBuilder[Self <: ArrayPattern_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[Expression]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: Expression*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ArrayPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
