package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSParenthesizedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSParenthesizedType__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSParenthesizedType__ : TSParenthesizedType
}
object TSParenthesizedType__ {
  
  inline def apply(typeAnnotation: TSType): TSParenthesizedType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[TSParenthesizedType__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSParenthesizedType__] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSParenthesizedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
