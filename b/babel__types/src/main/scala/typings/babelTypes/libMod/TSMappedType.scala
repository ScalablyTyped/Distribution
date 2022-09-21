package typings.babelTypes.libMod

import typings.babelTypes.babelTypesBooleans.`false`
import typings.babelTypes.babelTypesBooleans.`true`
import typings.babelTypes.babelTypesStrings.Plussign
import typings.babelTypes.babelTypesStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSMappedType
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var nameType: js.UndefOr[TSType | Null] = js.undefined
  
  var optional: js.UndefOr[`true` | `false` | Plussign | `-_` | Null] = js.undefined
  
  var readonly: js.UndefOr[`true` | `false` | Plussign | `-_` | Null] = js.undefined
  
  var typeAnnotation: js.UndefOr[TSType | Null] = js.undefined
  
  var typeParameter: TSTypeParameter
  
  @JSName("type")
  var type_TSMappedType: typings.babelTypes.babelTypesStrings.TSMappedType
}
object TSMappedType {
  
  inline def apply(typeParameter: TSTypeParameter): TSMappedType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[TSMappedType]
  }
  
  extension [Self <: TSMappedType](x: Self) {
    
    inline def setNameType(value: TSType): Self = StObject.set(x, "nameType", value.asInstanceOf[js.Any])
    
    inline def setNameTypeNull: Self = StObject.set(x, "nameType", null)
    
    inline def setNameTypeUndefined: Self = StObject.set(x, "nameType", js.undefined)
    
    inline def setOptional(value: `true` | `false` | Plussign | `-_`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setReadonly(value: `true` | `false` | Plussign | `-_`): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSMappedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
    
    inline def setTypeParameter(value: TSTypeParameter): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
  }
}
