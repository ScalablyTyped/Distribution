package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalExpression
  extends StObject
     with Expression {
  
  val colonToken: ColonToken = js.native
  
  val condition: Expression = js.native
  
  @JSName("kind")
  val kind_ConditionalExpression: typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.SyntaxKind.ConditionalExpression = js.native
  
  val questionToken: QuestionToken = js.native
  
  val whenFalse: Expression = js.native
  
  val whenTrue: Expression = js.native
}
