package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadElement
  extends StObject
     with Expression
     with _ArrayBindingOrAssignmentElement
     with _BindingOrAssignmentElementRestIndicator {
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_SpreadElement: typings.typescriptNn5FuAjk.ts.SyntaxKind.SpreadElement = js.native
  
  @JSName("parent")
  val parent_SpreadElement: ArrayLiteralExpression | CallExpression | NewExpression = js.native
}
