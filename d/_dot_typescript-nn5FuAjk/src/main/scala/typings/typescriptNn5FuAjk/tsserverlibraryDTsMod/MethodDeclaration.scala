package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ReadonlyTextRange because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Node because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Declaration because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.NamedDeclaration because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ObjectLiteralElement because var conflicts: _declarationBrand. Inlined _objectLiteralBrand
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait MethodDeclaration
  extends StObject
     with FunctionLikeDeclarationBase
     with FunctionLikeDeclaration
     with HasJSDoc
     with ObjectLiteralElementLike
     with SignatureDeclaration {
  
  var _classElementBrand: Any = js.native
  
  var _objectLiteralBrand: Any = js.native
  
  @JSName("body")
  val body_MethodDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_MethodDeclaration: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.MethodDeclaration = js.native
  
  @JSName("name")
  val name_MethodDeclaration: PropertyName = js.native
  
  @JSName("parent")
  val parent_MethodDeclaration: ClassLikeDeclaration | ObjectLiteralExpression = js.native
}
