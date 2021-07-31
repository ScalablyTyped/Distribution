package typings.awsSdk.workmailMod

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
  
  @scala.inline
  def apply(): BookingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingOptions]
  }
  
  @scala.inline
  implicit class BookingOptionsMutableBuilder[Self <: BookingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoAcceptRequests(value: Boolean): Self = StObject.set(x, "AutoAcceptRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAcceptRequestsUndefined: Self = StObject.set(x, "AutoAcceptRequests", js.undefined)
    
    @scala.inline
    def setAutoDeclineConflictingRequests(value: Boolean): Self = StObject.set(x, "AutoDeclineConflictingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeclineConflictingRequestsUndefined: Self = StObject.set(x, "AutoDeclineConflictingRequests", js.undefined)
    
    @scala.inline
    def setAutoDeclineRecurringRequests(value: Boolean): Self = StObject.set(x, "AutoDeclineRecurringRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeclineRecurringRequestsUndefined: Self = StObject.set(x, "AutoDeclineRecurringRequests", js.undefined)
  }
}
