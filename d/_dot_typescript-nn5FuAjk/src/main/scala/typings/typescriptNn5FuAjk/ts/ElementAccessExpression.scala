package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementAccessExpression
  extends StObject
     with MemberExpression
     with AccessExpression
     with BindingOrAssignmentElementTarget
     with DeclarationName
     with _ArrayBindingOrAssignmentElement {
  
  val argumentExpression: Expression = js.native
  
  val expression: LeftHandSideExpression = js.native
  
  @JSName("kind")
  val kind_ElementAccessExpression: typings.typescriptNn5FuAjk.ts.SyntaxKind.ElementAccessExpression = js.native
  
  val questionDotToken: js.UndefOr[QuestionDotToken] = js.native
}
