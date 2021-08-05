package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSParenthesizedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSParenthesizedType_
  extends StObject
     with BaseNode
     with TSType {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSParenthesizedType_ : TSParenthesizedType
}
object TSParenthesizedType_ {
  
  inline def apply(typeAnnotation: TSType): TSParenthesizedType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[TSParenthesizedType_]
  }
  
  extension [Self <: TSParenthesizedType_](x: Self) {
    
    inline def setType(value: TSParenthesizedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
