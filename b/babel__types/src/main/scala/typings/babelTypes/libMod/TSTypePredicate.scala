package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypePredicate
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var asserts: js.UndefOr[Boolean | Null] = js.undefined
  
  var parameterName: Identifier_ | TSThisType
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotation | Null] = js.undefined
  
  @JSName("type")
  var type_TSTypePredicate: typings.babelTypes.babelTypesStrings.TSTypePredicate
}
object TSTypePredicate {
  
  inline def apply(parameterName: Identifier_ | TSThisType): TSTypePredicate = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[TSTypePredicate]
  }
  
  extension [Self <: TSTypePredicate](x: Self) {
    
    inline def setAsserts(value: Boolean): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    inline def setAssertsNull: Self = StObject.set(x, "asserts", null)
    
    inline def setAssertsUndefined: Self = StObject.set(x, "asserts", js.undefined)
    
    inline def setParameterName(value: Identifier_ | TSThisType): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSTypePredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
