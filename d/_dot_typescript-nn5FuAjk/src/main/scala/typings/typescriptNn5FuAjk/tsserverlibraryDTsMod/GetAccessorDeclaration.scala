package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.GetAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ReadonlyTextRange because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Node because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Declaration because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.NamedDeclaration because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ObjectLiteralElement because var conflicts: _declarationBrand. Inlined _objectLiteralBrand
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait GetAccessorDeclaration
  extends StObject
     with FunctionLikeDeclarationBase
     with AccessorDeclaration
     with FunctionLikeDeclaration {
  
  var _classElementBrand: Any = js.native
  
  var _objectLiteralBrand: Any = js.native
  
  var _typeElementBrand: Any = js.native
  
  @JSName("body")
  val body_GetAccessorDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_GetAccessorDeclaration: GetAccessor = js.native
  
  @JSName("name")
  val name_GetAccessorDeclaration: PropertyName = js.native
  
  @JSName("parent")
  val parent_GetAccessorDeclaration: ClassLikeDeclaration | ObjectLiteralExpression | TypeLiteralNode | InterfaceDeclaration = js.native
}
