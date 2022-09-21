package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclaration
  extends StObject
     with NamedDeclaration
     with JSDocContainer
     with HasExpressionInitializer
     with HasJSDoc
     with HasType
     with VariableLikeDeclaration
     with _BindingOrAssignmentElement {
  
  val exclamationToken: js.UndefOr[ExclamationToken] = js.native
  
  val initializer: js.UndefOr[Expression] = js.native
  
  @JSName("kind")
  val kind_VariableDeclaration: typings.typescriptNn5FuAjk.ts.SyntaxKind.VariableDeclaration = js.native
  
  @JSName("name")
  val name_VariableDeclaration: BindingName = js.native
  
  @JSName("parent")
  val parent_VariableDeclaration: VariableDeclarationList | CatchClause = js.native
  
  val `type`: js.UndefOr[TypeNode] = js.native
}
