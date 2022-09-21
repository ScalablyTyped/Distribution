package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateExpression
  extends StObject
     with PrimaryExpression
     with TemplateLiteral {
  
  val head: TemplateHead = js.native
  
  @JSName("kind")
  val kind_TemplateExpression: typings.typescriptNn5FuAjk.ts.SyntaxKind.TemplateExpression = js.native
  
  val templateSpans: NodeArray[TemplateSpan] = js.native
}
