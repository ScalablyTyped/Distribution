package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSTypePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypePredicate__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var asserts: js.UndefOr[Boolean | Null] = js.undefined
  
  var parameterName: Identifier_ | TSThisType__
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotation__ | Null] = js.undefined
  
  @JSName("type")
  var type_TSTypePredicate__ : TSTypePredicate
}
object TSTypePredicate__ {
  
  inline def apply(parameterName: Identifier_ | TSThisType__): TSTypePredicate__ = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[TSTypePredicate__]
  }
  
  extension [Self <: TSTypePredicate__](x: Self) {
    
    inline def setAsserts(value: Boolean): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    inline def setAssertsNull: Self = StObject.set(x, "asserts", null)
    
    inline def setAssertsUndefined: Self = StObject.set(x, "asserts", js.undefined)
    
    inline def setParameterName(value: Identifier_ | TSThisType__): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSTypePredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation__): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
