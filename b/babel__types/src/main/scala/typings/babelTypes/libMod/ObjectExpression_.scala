package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ObjectExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExpression_
  extends StObject
     with BaseNode
     with Expression
     with Node
     with Standardized {
  
  var properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_]
  
  @JSName("type")
  var type_ObjectExpression_ : ObjectExpression
}
object ObjectExpression_ {
  
  inline def apply(properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_]): ObjectExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[ObjectExpression_]
  }
  
  extension [Self <: ObjectExpression_](x: Self) {
    
    inline def setProperties(value: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: (ObjectMethod_ | ObjectProperty_ | SpreadElement_)*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: ObjectExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
