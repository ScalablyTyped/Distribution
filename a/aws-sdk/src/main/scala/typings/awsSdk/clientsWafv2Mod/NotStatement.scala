package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested.
    */
  var Statement: typings.awsSdk.clientsWafv2Mod.Statement
}
object NotStatement {
  
  inline def apply(Statement: Statement): NotStatement = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotStatement]
  }
  
  extension [Self <: NotStatement](x: Self) {
    
    inline def setStatement(value: Statement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
  }
}
