package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.CallSignature
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.ConstructSignature
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.Constructor
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.ConstructorType
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.FunctionType
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.GetAccessor
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.IndexSignature
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.SetAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureDeclarationBase
  extends StObject
     with NamedDeclaration
     with JSDocContainer {
  
  @JSName("kind")
  val kind_SignatureDeclarationBase: CallSignature | ConstructSignature | typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.MethodSignature | IndexSignature | FunctionType | ConstructorType | typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.JSDocFunctionType | typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.FunctionDeclaration | typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.MethodDeclaration | Constructor | GetAccessor | SetAccessor | typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.FunctionExpression | typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.ArrowFunction = js.native
  
  @JSName("name")
  val name_SignatureDeclarationBase: js.UndefOr[PropertyName] = js.native
  
  val parameters: NodeArray[ParameterDeclaration] = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
  
  val typeParameters: js.UndefOr[NodeArray[TypeParameterDeclaration]] = js.native
}
