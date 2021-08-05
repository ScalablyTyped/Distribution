package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedQueuedPurchaseDeletion extends StObject {
  
  /**
    * The error.
    */
  var Error: js.UndefOr[DeleteQueuedReservedInstancesError] = js.undefined
  
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.undefined
}
object FailedQueuedPurchaseDeletion {
  
  inline def apply(): FailedQueuedPurchaseDeletion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedQueuedPurchaseDeletion]
  }
  
  extension [Self <: FailedQueuedPurchaseDeletion](x: Self) {
    
    inline def setError(value: DeleteQueuedReservedInstancesError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setReservedInstancesId(value: String): Self = StObject.set(x, "ReservedInstancesId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesIdUndefined: Self = StObject.set(x, "ReservedInstancesId", js.undefined)
  }
}
