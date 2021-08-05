package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSFunctionType
  extends StObject
     with Node
     with TSType {
  
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null
  
  var typeAnnotation: TSTypeAnnotation | Null
  
  var typeParameters: TypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_TSFunctionType: typings.babelTypes.babelTypesStrings.TSFunctionType
}
object TSFunctionType {
  
  @JSImport("babel-types/ts3.6", "TSFunctionType")
  @js.native
  def apply(): TSFunctionType = js.native
  @JSImport("babel-types/ts3.6", "TSFunctionType")
  @js.native
  def apply(typeParameters: Unit, typeAnnotation: TSTypeAnnotation): TSFunctionType = js.native
  @JSImport("babel-types/ts3.6", "TSFunctionType")
  @js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSFunctionType = js.native
  @JSImport("babel-types/ts3.6", "TSFunctionType")
  @js.native
  def apply(typeParameters: TypeParameterDeclaration_, typeAnnotation: TSTypeAnnotation): TSFunctionType = js.native
  
  extension [Self <: TSFunctionType](x: Self) {
    
    inline def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSFunctionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
