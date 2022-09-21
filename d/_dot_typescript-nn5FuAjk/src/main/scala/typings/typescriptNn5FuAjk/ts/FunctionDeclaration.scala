package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescriptNn5FuAjk.ts.ReadonlyTextRange because Already inherited
- typings.typescriptNn5FuAjk.ts.Node because Already inherited
- typings.typescriptNn5FuAjk.ts.Declaration because Already inherited
- typings.typescriptNn5FuAjk.ts.NamedDeclaration because Already inherited
- typings.typescriptNn5FuAjk.ts.DeclarationStatement because var conflicts: _declarationBrand. Inlined  */ @js.native
trait FunctionDeclaration
  extends StObject
     with FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with HasJSDoc
     with SignatureDeclaration
     with Statement {
  
  @JSName("body")
  val body_FunctionDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_FunctionDeclaration: typings.typescriptNn5FuAjk.ts.SyntaxKind.FunctionDeclaration = js.native
  
  @JSName("name")
  val name_FunctionDeclaration: js.UndefOr[Identifier] = js.native
}
