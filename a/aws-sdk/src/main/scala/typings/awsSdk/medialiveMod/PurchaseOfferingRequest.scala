package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseOfferingRequest extends StObject {
  
  /**
    * Number of resources
    */
  var Count: integerMin1
  
  /**
    * Name for the new reservation
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * Offering to purchase, e.g. '87654321'
    */
  var OfferingId: string
  
  /**
    * Renewal settings for the reservation
    */
  var RenewalSettings: js.UndefOr[typings.awsSdk.medialiveMod.RenewalSettings] = js.undefined
  
  /**
    * Unique request ID to be specified. This is needed to prevent retries from creating multiple resources.
    */
  var RequestId: js.UndefOr[string] = js.undefined
  
  /**
    * Requested reservation start time (UTC) in ISO-8601 format. The specified time must be between the first day of the current month and one year from now. If no value is given, the default is now.
    */
  var Start: js.UndefOr[string] = js.undefined
  
  /**
    * A collection of key-value pairs
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.undefined
}
object PurchaseOfferingRequest {
  
  inline def apply(Count: integerMin1, OfferingId: string): PurchaseOfferingRequest = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseOfferingRequest]
  }
  
  extension [Self <: PurchaseOfferingRequest](x: Self) {
    
    inline def setCount(value: integerMin1): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOfferingId(value: string): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    inline def setRenewalSettings(value: RenewalSettings): Self = StObject.set(x, "RenewalSettings", value.asInstanceOf[js.Any])
    
    inline def setRenewalSettingsUndefined: Self = StObject.set(x, "RenewalSettings", js.undefined)
    
    inline def setRequestId(value: string): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStart(value: string): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
