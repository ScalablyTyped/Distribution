package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStatementError extends StObject {
  
  /**
    * <p> The error code associated with the failed PartiQL batch statement. </p>
    */
  var Code: js.UndefOr[BatchStatementErrorCodeEnum | String] = js.undefined
  
  /**
    * <p> The error message associated with the PartiQL batch response. </p>
    */
  var Message: js.UndefOr[String] = js.undefined
}
object BatchStatementError {
  
  inline def apply(): BatchStatementError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStatementError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchStatementError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: BatchStatementErrorCodeEnum | String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
