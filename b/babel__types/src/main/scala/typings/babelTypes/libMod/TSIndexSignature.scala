package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSIndexSignature
  extends StObject
     with BaseNode
     with Node
     with TSTypeElement
     with TypeScript {
  
  var parameters: js.Array[Identifier_]
  
  var readonly: js.UndefOr[Boolean | Null] = js.undefined
  
  var static: js.UndefOr[Boolean | Null] = js.undefined
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotation | Null] = js.undefined
  
  @JSName("type")
  var type_TSIndexSignature: typings.babelTypes.babelTypesStrings.TSIndexSignature
}
object TSIndexSignature {
  
  inline def apply(parameters: js.Array[Identifier_]): TSIndexSignature = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[TSIndexSignature]
  }
  
  extension [Self <: TSIndexSignature](x: Self) {
    
    inline def setParameters(value: js.Array[Identifier_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Identifier_ *): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticNull: Self = StObject.set(x, "static", null)
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSIndexSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
