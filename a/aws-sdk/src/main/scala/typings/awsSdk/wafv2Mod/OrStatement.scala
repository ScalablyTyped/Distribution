package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrStatement extends StObject {
  
  /**
    * The statements to combine with OR logic. You can use any statements that can be nested.
    */
  var Statements: typings.awsSdk.wafv2Mod.Statements = js.native
}
object OrStatement {
  
  @scala.inline
  def apply(Statements: Statements): OrStatement = {
    val __obj = js.Dynamic.literal(Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrStatement]
  }
  
  @scala.inline
  implicit class OrStatementMutableBuilder[Self <: OrStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: Statements): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "Statements", js.Array(value :_*))
  }
}
