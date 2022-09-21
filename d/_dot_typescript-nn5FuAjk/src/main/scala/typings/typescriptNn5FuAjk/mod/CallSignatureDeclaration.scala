package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.mod.SyntaxKind.CallSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescriptNn5FuAjk.mod.ReadonlyTextRange because Already inherited
- typings.typescriptNn5FuAjk.mod.Node because Already inherited
- typings.typescriptNn5FuAjk.mod.Declaration because Already inherited
- typings.typescriptNn5FuAjk.mod.NamedDeclaration because Already inherited
- typings.typescriptNn5FuAjk.mod.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand, questionToken */ @js.native
trait CallSignatureDeclaration
  extends StObject
     with SignatureDeclarationBase
     with HasJSDoc
     with SignatureDeclaration {
  
  var _typeElementBrand: Any = js.native
  
  @JSName("kind")
  val kind_CallSignatureDeclaration: CallSignature = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
