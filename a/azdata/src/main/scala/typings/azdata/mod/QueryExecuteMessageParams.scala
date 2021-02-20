package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryExecuteMessageParams extends StObject {
  
  var message: IResultMessage = js.native
  
  var ownerUri: String = js.native
}
object QueryExecuteMessageParams {
  
  @scala.inline
  def apply(message: IResultMessage, ownerUri: String): QueryExecuteMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteMessageParams]
  }
  
  @scala.inline
  implicit class QueryExecuteMessageParamsMutableBuilder[Self <: QueryExecuteMessageParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: IResultMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
  }
}
