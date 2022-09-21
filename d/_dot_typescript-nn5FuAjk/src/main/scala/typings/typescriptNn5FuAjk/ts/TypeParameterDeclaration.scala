package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeParameterDeclaration
  extends StObject
     with NamedDeclaration {
  
  val default: js.UndefOr[TypeNode] = js.native
  
  /** Note: Consider calling `getEffectiveConstraintOfTypeParameter` */
  val constraint: js.UndefOr[TypeNode] = js.native
  
  var expression: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_TypeParameterDeclaration: typings.typescriptNn5FuAjk.ts.SyntaxKind.TypeParameter = js.native
  
  @JSName("name")
  val name_TypeParameterDeclaration: Identifier = js.native
  
  @JSName("parent")
  val parent_TypeParameterDeclaration: DeclarationWithTypeParameterChildren | InferTypeNode = js.native
}
