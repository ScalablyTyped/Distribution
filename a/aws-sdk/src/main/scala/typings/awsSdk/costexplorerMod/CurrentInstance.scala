package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentInstance extends StObject {
  
  /**
    *  The currency code that AWS used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The name you've given an instance. This field will show as blank if you haven't given the instance a name.
    */
  var InstanceName: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  Current On-Demand cost of operating this instance on a monthly basis.
    */
  var MonthlyCost: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  Number of hours during the lookback period billed at On-Demand rates.
    */
  var OnDemandHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  Number of hours during the lookback period covered by reservations.
    */
  var ReservationCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  Details about the resource and utilization.
    */
  var ResourceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.ResourceDetails] = js.undefined
  
  /**
    * Resource ID of the current instance.
    */
  var ResourceId: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  Utilization information of the current instance during the lookback period.
    */
  var ResourceUtilization: js.UndefOr[typings.awsSdk.costexplorerMod.ResourceUtilization] = js.undefined
  
  /**
    * Number of hours during the lookback period covered by Savings Plans.
    */
  var SavingsPlansCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Cost allocation resource tags applied to the instance.
    */
  var Tags: js.UndefOr[TagValuesList] = js.undefined
  
  /**
    *  The total number of hours the instance ran during the lookback period.
    */
  var TotalRunningHoursInLookbackPeriod: js.UndefOr[GenericString] = js.undefined
}
object CurrentInstance {
  
  inline def apply(): CurrentInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentInstance]
  }
  
  extension [Self <: CurrentInstance](x: Self) {
    
    inline def setCurrencyCode(value: GenericString): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setInstanceName(value: GenericString): Self = StObject.set(x, "InstanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "InstanceName", js.undefined)
    
    inline def setMonthlyCost(value: GenericString): Self = StObject.set(x, "MonthlyCost", value.asInstanceOf[js.Any])
    
    inline def setMonthlyCostUndefined: Self = StObject.set(x, "MonthlyCost", js.undefined)
    
    inline def setOnDemandHoursInLookbackPeriod(value: GenericString): Self = StObject.set(x, "OnDemandHoursInLookbackPeriod", value.asInstanceOf[js.Any])
    
    inline def setOnDemandHoursInLookbackPeriodUndefined: Self = StObject.set(x, "OnDemandHoursInLookbackPeriod", js.undefined)
    
    inline def setReservationCoveredHoursInLookbackPeriod(value: GenericString): Self = StObject.set(x, "ReservationCoveredHoursInLookbackPeriod", value.asInstanceOf[js.Any])
    
    inline def setReservationCoveredHoursInLookbackPeriodUndefined: Self = StObject.set(x, "ReservationCoveredHoursInLookbackPeriod", js.undefined)
    
    inline def setResourceDetails(value: ResourceDetails): Self = StObject.set(x, "ResourceDetails", value.asInstanceOf[js.Any])
    
    inline def setResourceDetailsUndefined: Self = StObject.set(x, "ResourceDetails", js.undefined)
    
    inline def setResourceId(value: GenericString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceUtilization(value: ResourceUtilization): Self = StObject.set(x, "ResourceUtilization", value.asInstanceOf[js.Any])
    
    inline def setResourceUtilizationUndefined: Self = StObject.set(x, "ResourceUtilization", js.undefined)
    
    inline def setSavingsPlansCoveredHoursInLookbackPeriod(value: GenericString): Self = StObject.set(x, "SavingsPlansCoveredHoursInLookbackPeriod", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlansCoveredHoursInLookbackPeriodUndefined: Self = StObject.set(x, "SavingsPlansCoveredHoursInLookbackPeriod", js.undefined)
    
    inline def setTags(value: TagValuesList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagValues*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTotalRunningHoursInLookbackPeriod(value: GenericString): Self = StObject.set(x, "TotalRunningHoursInLookbackPeriod", value.asInstanceOf[js.Any])
    
    inline def setTotalRunningHoursInLookbackPeriodUndefined: Self = StObject.set(x, "TotalRunningHoursInLookbackPeriod", js.undefined)
  }
}
