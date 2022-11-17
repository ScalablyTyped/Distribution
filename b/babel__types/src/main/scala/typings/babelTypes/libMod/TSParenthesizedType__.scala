package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSParenthesizedType__
  extends StObject
     with BaseNode {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSParenthesizedType__ : "TSParenthesizedType"
}
object TSParenthesizedType__ {
  
  inline def apply(typeAnnotation: TSType): TSParenthesizedType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[TSParenthesizedType__]
  }
  
  extension [Self <: TSParenthesizedType__](x: Self) {
    
    inline def setType(value: "TSParenthesizedType"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
