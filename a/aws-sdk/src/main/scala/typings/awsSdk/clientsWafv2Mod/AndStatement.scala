package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndStatement extends StObject {
  
  /**
    * The statements to combine with AND logic. You can use any statements that can be nested. 
    */
  var Statements: typings.awsSdk.clientsWafv2Mod.Statements
}
object AndStatement {
  
  inline def apply(Statements: Statements): AndStatement = {
    val __obj = js.Dynamic.literal(Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AndStatement] (val x: Self) extends AnyVal {
    
    inline def setStatements(value: Statements): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "Statements", js.Array(value*))
  }
}
