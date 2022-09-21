package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.SetAccessor
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
trait SetAccessorDeclaration
  extends StObject
     with FunctionLikeDeclarationBase
     with AccessorDeclaration
     with FunctionLikeDeclaration {
  
  var _classElementBrand: Any = js.native
  
  var _objectLiteralBrand: Any = js.native
  
  var _typeElementBrand: Any = js.native
  
  @JSName("body")
  val body_SetAccessorDeclaration: js.UndefOr[FunctionBody] = js.native
  
  @JSName("kind")
  val kind_SetAccessorDeclaration: SetAccessor = js.native
  
  @JSName("name")
  val name_SetAccessorDeclaration: PropertyName = js.native
  
  @JSName("parent")
  val parent_SetAccessorDeclaration: ClassLikeDeclaration | ObjectLiteralExpression | TypeLiteralNode | InterfaceDeclaration = js.native
}
