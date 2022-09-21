package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.ts.SyntaxKind.CallSignature
import typings.typescriptNn5FuAjk.ts.SyntaxKind.ConstructSignature
import typings.typescriptNn5FuAjk.ts.SyntaxKind.Constructor
import typings.typescriptNn5FuAjk.ts.SyntaxKind.ConstructorType
import typings.typescriptNn5FuAjk.ts.SyntaxKind.FunctionType
import typings.typescriptNn5FuAjk.ts.SyntaxKind.GetAccessor
import typings.typescriptNn5FuAjk.ts.SyntaxKind.IndexSignature
import typings.typescriptNn5FuAjk.ts.SyntaxKind.SetAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureDeclarationBase
  extends StObject
     with NamedDeclaration
     with JSDocContainer {
  
  @JSName("kind")
  val kind_SignatureDeclarationBase: CallSignature | ConstructSignature | typings.typescriptNn5FuAjk.ts.SyntaxKind.MethodSignature | IndexSignature | FunctionType | ConstructorType | typings.typescriptNn5FuAjk.ts.SyntaxKind.JSDocFunctionType | typings.typescriptNn5FuAjk.ts.SyntaxKind.FunctionDeclaration | typings.typescriptNn5FuAjk.ts.SyntaxKind.MethodDeclaration | Constructor | GetAccessor | SetAccessor | typings.typescriptNn5FuAjk.ts.SyntaxKind.FunctionExpression | typings.typescriptNn5FuAjk.ts.SyntaxKind.ArrowFunction = js.native
  
  @JSName("name")
  val name_SignatureDeclarationBase: js.UndefOr[PropertyName] = js.native
  
  val parameters: NodeArray[ParameterDeclaration] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
