package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExpression_
  extends StObject
     with Node
     with Expression {
  
  var properties: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadProperty_]
  
  @JSName("type")
  var type_ObjectExpression_ : ObjectExpression
}
object ObjectExpression_ {
  
  inline def apply(
    end: Double,
    loc: SourceLocation,
    properties: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadProperty_],
    start: Double
  ): ObjectExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[ObjectExpression_]
  }
  
  extension [Self <: ObjectExpression_](x: Self) {
    
    inline def setProperties(value: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadProperty_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: (ObjectProperty_ | ObjectMethod_ | SpreadProperty_)*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: ObjectExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
