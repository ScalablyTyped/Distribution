package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseOfferingRequest extends StObject {
  
  /**
    * Number of resources
    */
  var Count: integerMin1 = js.native
  
  /**
    * Name for the new reservation
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * Offering to purchase, e.g. '87654321'
    */
  var OfferingId: string = js.native
  
  /**
    * Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
    */
  var RequestId: js.UndefOr[string] = js.native
  
  /**
    * Requested reservation start time (UTC) in ISO-8601 format. The specified time must be between the first day of the current month and one year from now. If no value is given, the default is now.
    */
  var Start: js.UndefOr[string] = js.native
  
  /**
    * A collection of key-value pairs
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
}
object PurchaseOfferingRequest {
  
  @scala.inline
  def apply(Count: integerMin1, OfferingId: string): PurchaseOfferingRequest = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseOfferingRequest]
  }
  
  @scala.inline
  implicit class PurchaseOfferingRequestMutableBuilder[Self <: PurchaseOfferingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: integerMin1): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOfferingId(value: string): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: string): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStart(value: string): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
