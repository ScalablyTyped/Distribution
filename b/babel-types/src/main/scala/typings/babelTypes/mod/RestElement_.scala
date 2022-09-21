package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.RestElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestElement_
  extends StObject
     with Node
     with LVal {
  
  var argument: LVal
  
  var typeAnnotation: js.UndefOr[TypeAnnotation_] = js.undefined
  
  @JSName("type")
  var type_RestElement_ : RestElement
}
object RestElement_ {
  
  inline def apply(argument: LVal, end: Double, loc: SourceLocation, start: Double): RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[RestElement_]
  }
  
  extension [Self <: RestElement_](x: Self) {
    
    inline def setArgument(value: LVal): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: RestElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
