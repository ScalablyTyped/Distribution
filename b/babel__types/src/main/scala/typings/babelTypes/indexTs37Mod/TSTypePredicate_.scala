package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSTypePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSTypePredicate_
  extends StObject
     with BaseNode
     with TSType {
  
  var asserts: Boolean | Null
  
  var parameterName: Identifier_ | TSThisType_
  
  var typeAnnotation: TSTypeAnnotation_ | Null
  
  @JSName("type")
  var type_TSTypePredicate_ : TSTypePredicate
}
object TSTypePredicate_ {
  
  inline def apply(parameterName: Identifier_ | TSThisType_): TSTypePredicate_ = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], asserts = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[TSTypePredicate_]
  }
  
  extension [Self <: TSTypePredicate_](x: Self) {
    
    inline def setAsserts(value: Boolean): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    inline def setAssertsNull: Self = StObject.set(x, "asserts", null)
    
    inline def setParameterName(value: Identifier_ | TSThisType_): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSTypePredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
