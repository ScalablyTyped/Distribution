package typings.azdata.mod.nb

import typings.azdata.azdataStrings.abort
import typings.azdata.azdataStrings.error
import typings.azdata.azdataStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteReply extends StObject {
  
  var execution_count: Double | Null
  
  var status: ok | error | abort
}
object IExecuteReply {
  
  inline def apply(status: ok | error | abort): IExecuteReply = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], execution_count = null)
    __obj.asInstanceOf[IExecuteReply]
  }
  
  extension [Self <: IExecuteReply](x: Self) {
    
    inline def setExecution_count(value: Double): Self = StObject.set(x, "execution_count", value.asInstanceOf[js.Any])
    
    inline def setExecution_countNull: Self = StObject.set(x, "execution_count", null)
    
    inline def setStatus(value: ok | error | abort): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
