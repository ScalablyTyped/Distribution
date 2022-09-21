package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedInstancesListing extends StObject {
  
  /**
    * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The time the listing was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of instances in this state.
    */
  var InstanceCounts: js.UndefOr[InstanceCountList] = js.undefined
  
  /**
    * The price of the Reserved Instance listing.
    */
  var PriceSchedules: js.UndefOr[PriceScheduleList] = js.undefined
  
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Reserved Instance listing.
    */
  var ReservedInstancesListingId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the Reserved Instance listing.
    */
  var Status: js.UndefOr[ListingStatus] = js.undefined
  
  /**
    * The reason for the current status of the Reserved Instance listing. The response can be blank.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The last modified timestamp of the listing.
    */
  var UpdateDate: js.UndefOr[js.Date] = js.undefined
}
object ReservedInstancesListing {
  
  inline def apply(): ReservedInstancesListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesListing]
  }
  
  extension [Self <: ReservedInstancesListing](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setInstanceCounts(value: InstanceCountList): Self = StObject.set(x, "InstanceCounts", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountsUndefined: Self = StObject.set(x, "InstanceCounts", js.undefined)
    
    inline def setInstanceCountsVarargs(value: InstanceCount*): Self = StObject.set(x, "InstanceCounts", js.Array(value*))
    
    inline def setPriceSchedules(value: PriceScheduleList): Self = StObject.set(x, "PriceSchedules", value.asInstanceOf[js.Any])
    
    inline def setPriceSchedulesUndefined: Self = StObject.set(x, "PriceSchedules", js.undefined)
    
    inline def setPriceSchedulesVarargs(value: PriceSchedule*): Self = StObject.set(x, "PriceSchedules", js.Array(value*))
    
    inline def setReservedInstancesId(value: String): Self = StObject.set(x, "ReservedInstancesId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesIdUndefined: Self = StObject.set(x, "ReservedInstancesId", js.undefined)
    
    inline def setReservedInstancesListingId(value: String): Self = StObject.set(x, "ReservedInstancesListingId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesListingIdUndefined: Self = StObject.set(x, "ReservedInstancesListingId", js.undefined)
    
    inline def setStatus(value: ListingStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUpdateDate(value: js.Date): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateUndefined: Self = StObject.set(x, "UpdateDate", js.undefined)
  }
}
