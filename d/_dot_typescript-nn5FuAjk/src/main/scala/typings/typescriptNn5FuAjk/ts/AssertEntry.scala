package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertEntry
  extends StObject
     with Node {
  
  @JSName("kind")
  val kind_AssertEntry: typings.typescriptNn5FuAjk.ts.SyntaxKind.AssertEntry = js.native
  
  val name: AssertionKey = js.native
  
  @JSName("parent")
  val parent_AssertEntry: AssertClause = js.native
  
  val value: Expression = js.native
}
