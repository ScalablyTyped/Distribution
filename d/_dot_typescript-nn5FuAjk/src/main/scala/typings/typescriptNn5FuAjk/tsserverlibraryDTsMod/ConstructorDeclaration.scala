package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ReadonlyTextRange because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Node because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Declaration because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.NamedDeclaration because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
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
