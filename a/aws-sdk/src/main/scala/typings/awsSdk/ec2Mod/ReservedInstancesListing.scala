package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedInstancesListing extends js.Object {
  
  /**
    * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * The time the listing was created.
    */
  var CreateDate: js.UndefOr[DateTime] = js.native
  
  /**
    * The number of instances in this state.
    */
  var InstanceCounts: js.UndefOr[InstanceCountList] = js.native
  
  /**
    * The price of the Reserved Instance listing.
    */
  var PriceSchedules: js.UndefOr[PriceScheduleList] = js.native
  
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Reserved Instance listing.
    */
  var ReservedInstancesListingId: js.UndefOr[String] = js.native
  
  /**
    * The status of the Reserved Instance listing.
    */
  var Status: js.UndefOr[ListingStatus] = js.native
  
  /**
    * The reason for the current status of the Reserved Instance listing. The response can be blank.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The last modified timestamp of the listing.
    */
  var UpdateDate: js.UndefOr[DateTime] = js.native
}
object ReservedInstancesListing {
  
  @scala.inline
  def apply(): ReservedInstancesListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesListing]
  }
  
  @scala.inline
  implicit class ReservedInstancesListingOps[Self <: ReservedInstancesListing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setCreateDate(value: DateTime): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setInstanceCountsVarargs(value: InstanceCount*): Self = this.set("InstanceCounts", js.Array(value :_*))
    
    @scala.inline
    def setInstanceCounts(value: InstanceCountList): Self = this.set("InstanceCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceCounts: Self = this.set("InstanceCounts", js.undefined)
    
    @scala.inline
    def setPriceSchedulesVarargs(value: PriceSchedule*): Self = this.set("PriceSchedules", js.Array(value :_*))
    
    @scala.inline
    def setPriceSchedules(value: PriceScheduleList): Self = this.set("PriceSchedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceSchedules: Self = this.set("PriceSchedules", js.undefined)
    
    @scala.inline
    def setReservedInstancesId(value: String): Self = this.set("ReservedInstancesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedInstancesId: Self = this.set("ReservedInstancesId", js.undefined)
    
    @scala.inline
    def setReservedInstancesListingId(value: String): Self = this.set("ReservedInstancesListingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedInstancesListingId: Self = this.set("ReservedInstancesListingId", js.undefined)
    
    @scala.inline
    def setStatus(value: ListingStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setUpdateDate(value: DateTime): Self = this.set("UpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDate: Self = this.set("UpdateDate", js.undefined)
  }
}
