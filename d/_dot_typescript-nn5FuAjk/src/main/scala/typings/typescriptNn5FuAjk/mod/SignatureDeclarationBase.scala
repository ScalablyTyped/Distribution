package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.mod.SyntaxKind.CallSignature
import typings.typescriptNn5FuAjk.mod.SyntaxKind.ConstructSignature
import typings.typescriptNn5FuAjk.mod.SyntaxKind.Constructor
import typings.typescriptNn5FuAjk.mod.SyntaxKind.ConstructorType
import typings.typescriptNn5FuAjk.mod.SyntaxKind.FunctionType
import typings.typescriptNn5FuAjk.mod.SyntaxKind.GetAccessor
import typings.typescriptNn5FuAjk.mod.SyntaxKind.IndexSignature
import typings.typescriptNn5FuAjk.mod.SyntaxKind.SetAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureDeclarationBase
  extends StObject
     with NamedDeclaration
     with JSDocContainer {
  
  @JSName("kind")
  val kind_SignatureDeclarationBase: CallSignature | ConstructSignature | typings.typescriptNn5FuAjk.mod.SyntaxKind.MethodSignature | IndexSignature | FunctionType | ConstructorType | typings.typescriptNn5FuAjk.mod.SyntaxKind.JSDocFunctionType | typings.typescriptNn5FuAjk.mod.SyntaxKind.FunctionDeclaration | typings.typescriptNn5FuAjk.mod.SyntaxKind.MethodDeclaration | Constructor | GetAccessor | SetAccessor | typings.typescriptNn5FuAjk.mod.SyntaxKind.FunctionExpression | typings.typescriptNn5FuAjk.mod.SyntaxKind.ArrowFunction = js.native
  
  @JSName("name")
  val name_SignatureDeclarationBase: js.UndefOr[PropertyName] = js.native
  
  val parameters: NodeArray[ParameterDeclaration] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
