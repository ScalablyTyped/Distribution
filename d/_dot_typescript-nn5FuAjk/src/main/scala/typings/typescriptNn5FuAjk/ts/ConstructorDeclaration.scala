package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.ts.SyntaxKind.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescriptNn5FuAjk.ts.ReadonlyTextRange because Already inherited
- typings.typescriptNn5FuAjk.ts.Node because Already inherited
- typings.typescriptNn5FuAjk.ts.Declaration because Already inherited
- typings.typescriptNn5FuAjk.ts.NamedDeclaration because Already inherited
- typings.typescriptNn5FuAjk.ts.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait ConstructorDeclaration
  extends StObject
     with FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with HasJSDoc
     with SignatureDeclaration {
  
  var _classElementBrand: Any = js.native
  
  @JSName("body")
  val body_ConstructorDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_ConstructorDeclaration: Constructor = js.native
  
  @JSName("parent")
  val parent_ConstructorDeclaration: ClassLikeDeclaration = js.native
}
