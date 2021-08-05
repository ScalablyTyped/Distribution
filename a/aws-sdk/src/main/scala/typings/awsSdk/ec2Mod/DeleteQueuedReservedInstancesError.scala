package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueuedReservedInstancesError extends StObject {
  
  /**
    * The error code.
    */
  var Code: js.UndefOr[DeleteQueuedReservedInstancesErrorCode] = js.undefined
  
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object DeleteQueuedReservedInstancesError {
  
  inline def apply(): DeleteQueuedReservedInstancesError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteQueuedReservedInstancesError]
  }
  
  extension [Self <: DeleteQueuedReservedInstancesError](x: Self) {
    
    inline def setCode(value: DeleteQueuedReservedInstancesErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
