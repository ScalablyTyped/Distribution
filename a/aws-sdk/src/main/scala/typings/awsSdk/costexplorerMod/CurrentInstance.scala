package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentInstance extends js.Object {
  
  /**
    *  The currency code that AWS used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  
  /**
    * The name you've given an instance. This field will show as blank if you haven't given the instance a name.
    */
  var InstanceName: js.UndefOr[GenericString] = js.native
  
  /**
    *  Current On-Demand cost of operating this instance on a monthly basis.
    */
  var MonthlyCost: js.UndefOr[GenericString] = js.native
  
  /**
    *  Number of hours during the lookback period billed at On-Demand rates.
    */
  var OnDemandHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
  
  /**
    *  Number of hours during the lookback period covered by reservations.
    */
  var ReservationCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
  
  /**
    *  Details about the resource and utilization.
    */
  var ResourceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.ResourceDetails] = js.native
  
  /**
    * Resource ID of the current instance.
    */
  var ResourceId: js.UndefOr[GenericString] = js.native
  
  /**
    *  Utilization information of the current instance during the lookback period.
    */
  var ResourceUtilization: js.UndefOr[typings.awsSdk.costexplorerMod.ResourceUtilization] = js.native
  
  /**
    * Number of hours during the lookback period covered by Savings Plans.
    */
  var SavingsPlansCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
  
  /**
    * Cost allocation resource tags applied to the instance.
    */
  var Tags: js.UndefOr[TagValuesList] = js.native
  
  /**
    *  The total number of hours the instance ran during the lookback period.
    */
  var TotalRunningHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
}
object CurrentInstance {
  
  @scala.inline
  def apply(): CurrentInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentInstance]
  }
  
  @scala.inline
  implicit class CurrentInstanceOps[Self <: CurrentInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrencyCode(value: GenericString): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    
    @scala.inline
    def setInstanceName(value: GenericString): Self = this.set("InstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceName: Self = this.set("InstanceName", js.undefined)
    
    @scala.inline
    def setMonthlyCost(value: GenericString): Self = this.set("MonthlyCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthlyCost: Self = this.set("MonthlyCost", js.undefined)
    
    @scala.inline
    def setOnDemandHoursInLookbackPeriod(value: GenericString): Self = this.set("OnDemandHoursInLookbackPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDemandHoursInLookbackPeriod: Self = this.set("OnDemandHoursInLookbackPeriod", js.undefined)
    
    @scala.inline
    def setReservationCoveredHoursInLookbackPeriod(value: GenericString): Self = this.set("ReservationCoveredHoursInLookbackPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationCoveredHoursInLookbackPeriod: Self = this.set("ReservationCoveredHoursInLookbackPeriod", js.undefined)
    
    @scala.inline
    def setResourceDetails(value: ResourceDetails): Self = this.set("ResourceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceDetails: Self = this.set("ResourceDetails", js.undefined)
    
    @scala.inline
    def setResourceId(value: GenericString): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setResourceUtilization(value: ResourceUtilization): Self = this.set("ResourceUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUtilization: Self = this.set("ResourceUtilization", js.undefined)
    
    @scala.inline
    def setSavingsPlansCoveredHoursInLookbackPeriod(value: GenericString): Self = this.set("SavingsPlansCoveredHoursInLookbackPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlansCoveredHoursInLookbackPeriod: Self = this.set("SavingsPlansCoveredHoursInLookbackPeriod", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagValues*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagValuesList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTotalRunningHoursInLookbackPeriod(value: GenericString): Self = this.set("TotalRunningHoursInLookbackPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRunningHoursInLookbackPeriod: Self = this.set("TotalRunningHoursInLookbackPeriod", js.undefined)
  }
}
