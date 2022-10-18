package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingOptions extends StObject {
  
  /**
    * The resource's ability to automatically reply to requests. If disabled, delegates must be associated to the resource.
    */
  var AutoAcceptRequests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource's ability to automatically decline any conflicting requests.
    */
  var AutoDeclineConflictingRequests: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource's ability to automatically decline any recurring requests.
    */
  var AutoDeclineRecurringRequests: js.UndefOr[Boolean] = js.undefined
}
object BookingOptions {
  
  inline def apply(): BookingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingOptions]
  }
  
  extension [Self <: BookingOptions](x: Self) {
    
    inline def setAutoAcceptRequests(value: Boolean): Self = StObject.set(x, "AutoAcceptRequests", value.asInstanceOf[js.Any])
    
    inline def setAutoAcceptRequestsUndefined: Self = StObject.set(x, "AutoAcceptRequests", js.undefined)
    
    inline def setAutoDeclineConflictingRequests(value: Boolean): Self = StObject.set(x, "AutoDeclineConflictingRequests", value.asInstanceOf[js.Any])
    
    inline def setAutoDeclineConflictingRequestsUndefined: Self = StObject.set(x, "AutoDeclineConflictingRequests", js.undefined)
    
    inline def setAutoDeclineRecurringRequests(value: Boolean): Self = StObject.set(x, "AutoDeclineRecurringRequests", value.asInstanceOf[js.Any])
    
    inline def setAutoDeclineRecurringRequestsUndefined: Self = StObject.set(x, "AutoDeclineRecurringRequests", js.undefined)
  }
}
