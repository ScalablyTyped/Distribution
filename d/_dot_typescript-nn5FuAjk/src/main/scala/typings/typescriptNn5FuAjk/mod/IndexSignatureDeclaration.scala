package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.mod.SyntaxKind.IndexSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescriptNn5FuAjk.mod.ReadonlyTextRange because Already inherited
- typings.typescriptNn5FuAjk.mod.Node because Already inherited
- typings.typescriptNn5FuAjk.mod.Declaration because Already inherited
- typings.typescriptNn5FuAjk.mod.NamedDeclaration because Already inherited
- typings.typescriptNn5FuAjk.mod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand, questionToken
- typings.typescriptNn5FuAjk.mod.ClassElement because var conflicts: _declarationBrand. Inlined _classElementBrand */ @js.native
trait IndexSignatureDeclaration
  extends StObject
     with SignatureDeclarationBase
     with HasJSDoc
     with SignatureDeclaration {
  
  var _classElementBrand: Any = js.native
  
  var _typeElementBrand: Any = js.native
  
  @JSName("kind")
  val kind_IndexSignatureDeclaration: IndexSignature = js.native
  
  @JSName("parent")
  val parent_IndexSignatureDeclaration: ObjectTypeDeclaration = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
  
  @JSName("type")
  val type_IndexSignatureDeclaration: TypeNode = js.native
}
