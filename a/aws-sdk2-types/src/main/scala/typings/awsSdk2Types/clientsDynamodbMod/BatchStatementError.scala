package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStatementError extends StObject {
  
  /**
    *  The error code associated with the failed PartiQL batch statement. 
    */
  var Code: js.UndefOr[BatchStatementErrorCodeEnum] = js.undefined
  
  /**
    *  The error message associated with the PartiQL batch response. 
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
    
    inline def setCode(value: BatchStatementErrorCodeEnum): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
