package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSCallSignatureDeclaration
  extends StObject
     with Node
     with TSTypeElement {
  
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null
  
  var typeAnnotation: TSTypeAnnotation | Null
  
  var typeParameters: TypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_TSCallSignatureDeclaration: typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration
}
object TSCallSignatureDeclaration {
  
  @JSImport("babel-types", "TSCallSignatureDeclaration")
  @js.native
  def apply(): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types", "TSCallSignatureDeclaration")
  @js.native
  def apply(typeParameters: Unit, parameters: js.Array[Identifier_ | RestElement_]): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types", "TSCallSignatureDeclaration")
  @js.native
  def apply(
    typeParameters: Unit,
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types", "TSCallSignatureDeclaration")
  @js.native
  def apply(typeParameters: Unit, parameters: Unit, typeAnnotation: TSTypeAnnotation): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types", "TSCallSignatureDeclaration")
  @js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types", "TSCallSignatureDeclaration")
  @js.native
  def apply(typeParameters: TypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types", "TSCallSignatureDeclaration")
  @js.native
  def apply(
    typeParameters: TypeParameterDeclaration_,
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types", "TSCallSignatureDeclaration")
  @js.native
  def apply(typeParameters: TypeParameterDeclaration_, parameters: Unit, typeAnnotation: TSTypeAnnotation): TSCallSignatureDeclaration = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSCallSignatureDeclaration] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
