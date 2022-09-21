package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSConstructSignatureDeclaration
  extends StObject
     with BaseNode
     with Node
     with TSTypeElement
     with TypeScript {
  
  var parameters: js.Array[Identifier_ | RestElement_]
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotation | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration | Null] = js.undefined
  
  @JSName("type")
  var type_TSConstructSignatureDeclaration: typings.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration
}
object TSConstructSignatureDeclaration {
  
  inline def apply(parameters: js.Array[Identifier_ | RestElement_]): TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[TSConstructSignatureDeclaration]
  }
  
  extension [Self <: TSConstructSignatureDeclaration](x: Self) {
    
    inline def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
    
    inline def setTypeParameters(value: TSTypeParameterDeclaration): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
