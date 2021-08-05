package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecuteMessageParams extends StObject {
  
  var message: IResultMessage
  
  var ownerUri: String
}
object QueryExecuteMessageParams {
  
  inline def apply(message: IResultMessage, ownerUri: String): QueryExecuteMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteMessageParams]
  }
  
  extension [Self <: QueryExecuteMessageParams](x: Self) {
    
    inline def setMessage(value: IResultMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
  }
}
