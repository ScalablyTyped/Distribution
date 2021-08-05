package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscriber extends StObject {
  
  /**
    *  The email address or SNS Amazon Resource Name (ARN), depending on the Type. 
    */
  var Address: js.UndefOr[SubscriberAddress] = js.undefined
  
  /**
    *  Indicates if the subscriber accepts the notifications. 
    */
  var Status: js.UndefOr[SubscriberStatus] = js.undefined
  
  /**
    *  The notification delivery channel. 
    */
  var Type: js.UndefOr[SubscriberType] = js.undefined
}
object Subscriber {
  
  inline def apply(): Subscriber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscriber]
  }
  
  extension [Self <: Subscriber](x: Self) {
    
    inline def setAddress(value: SubscriberAddress): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setStatus(value: SubscriberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: SubscriberType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
