package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSConstructorType
  extends StObject
     with Node
     with TSType {
  
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null
  
  var typeAnnotation: TSTypeAnnotation | Null
  
  var typeParameters: TypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_TSConstructorType: typings.babelTypes.babelTypesStrings.TSConstructorType
}
object TSConstructorType {
  
  @JSImport("babel-types", "TSConstructorType")
  @js.native
  def apply(): TSConstructorType = js.native
  @JSImport("babel-types", "TSConstructorType")
  @js.native
  def apply(typeParameters: Unit, typeAnnotation: TSTypeAnnotation): TSConstructorType = js.native
  @JSImport("babel-types", "TSConstructorType")
  @js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSConstructorType = js.native
  @JSImport("babel-types", "TSConstructorType")
  @js.native
  def apply(typeParameters: TypeParameterDeclaration_, typeAnnotation: TSTypeAnnotation): TSConstructorType = js.native
  
  extension [Self <: TSConstructorType](x: Self) {
    
    inline def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSConstructorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
