package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewExpression
  extends StObject
     with PrimaryExpression
     with Declaration
     with CallLikeExpression
     with HasTypeArguments {
  
  val arguments: js.UndefOr[NodeArray[Expression]] = js.native
  
  val expression: LeftHandSideExpression = js.native
  
  @JSName("kind")
  val kind_NewExpression: typings.typescriptNn5FuAjk.ts.SyntaxKind.NewExpression = js.native
  
  val typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}
