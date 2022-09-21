package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallExpression
  extends StObject
     with LeftHandSideExpression
     with Declaration
     with CallLikeExpression
     with HasTypeArguments {
  
  val arguments: NodeArray[Expression] = js.native
  
  val expression: LeftHandSideExpression = js.native
  
  @JSName("kind")
  val kind_CallExpression: typings.typescriptNn5FuAjk.ts.SyntaxKind.CallExpression = js.native
  
  val questionDotToken: js.UndefOr[QuestionDotToken] = js.native
  
  val typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
}
