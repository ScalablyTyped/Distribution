package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateConformancePackComplianceSummaryFilters extends StObject {
  
  /**
    * The 12-digit Amazon Web Services account ID of the source account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.configserviceMod.AccountId] = js.undefined
  
  /**
    * The source Amazon Web Services Region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.configserviceMod.AwsRegion] = js.undefined
}
object AggregateConformancePackComplianceSummaryFilters {
  
  inline def apply(): AggregateConformancePackComplianceSummaryFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateConformancePackComplianceSummaryFilters]
  }
  
  extension [Self <: AggregateConformancePackComplianceSummaryFilters](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
  }
}
