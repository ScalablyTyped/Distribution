package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSCallSignatureDeclaration
  extends Node
     with TSTypeElement {
  
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null = js.native
  
  var typeAnnotation: TSTypeAnnotation | Null = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSCallSignatureDeclaration: typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration = js.native
}
object TSCallSignatureDeclaration {
  
  @JSImport("babel-types/ts3.6", "TSCallSignatureDeclaration")
  @js.native
  def apply(): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSCallSignatureDeclaration")
  @js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSCallSignatureDeclaration")
  @js.native
  def apply(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[Identifier_ | RestElement_]): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSCallSignatureDeclaration")
  @js.native
  def apply(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSCallSignatureDeclaration")
  @js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSCallSignatureDeclaration")
  @js.native
  def apply(
    typeParameters: TypeParameterDeclaration_,
    parameters: js.UndefOr[scala.Nothing],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSCallSignatureDeclaration")
  @js.native
  def apply(typeParameters: TypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): TSCallSignatureDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSCallSignatureDeclaration")
  @js.native
  def apply(
    typeParameters: TypeParameterDeclaration_,
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  
  @scala.inline
  implicit class TSCallSignatureDeclarationMutableBuilder[Self <: TSCallSignatureDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    @scala.inline
    def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
