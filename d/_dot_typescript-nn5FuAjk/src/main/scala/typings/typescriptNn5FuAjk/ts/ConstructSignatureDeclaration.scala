package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.ts.SyntaxKind.ConstructSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescriptNn5FuAjk.ts.ReadonlyTextRange because Already inherited
- typings.typescriptNn5FuAjk.ts.Node because Already inherited
- typings.typescriptNn5FuAjk.ts.Declaration because Already inherited
- typings.typescriptNn5FuAjk.ts.NamedDeclaration because Already inherited
- typings.typescriptNn5FuAjk.ts.TypeElement because var conflicts: _declarationBrand. Inlined _typeElementBrand, questionToken */ @js.native
trait ConstructSignatureDeclaration
  extends StObject
     with SignatureDeclarationBase
     with HasJSDoc
     with SignatureDeclaration {
  
  var _typeElementBrand: Any = js.native
  
  @JSName("kind")
  val kind_ConstructSignatureDeclaration: ConstructSignature = js.native
  
  val questionToken: js.UndefOr[QuestionToken] = js.native
}
