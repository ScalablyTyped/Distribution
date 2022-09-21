package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateConformancePackComplianceFilters extends StObject {
  
  /**
    * The 12-digit Amazon Web Services account ID of the source account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.configserviceMod.AccountId] = js.undefined
  
  /**
    * The source Amazon Web Services Region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.configserviceMod.AwsRegion] = js.undefined
  
  /**
    * The compliance status of the conformance pack.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.undefined
  
  /**
    * The name of the conformance pack.
    */
  var ConformancePackName: js.UndefOr[typings.awsSdk.configserviceMod.ConformancePackName] = js.undefined
}
object AggregateConformancePackComplianceFilters {
  
  inline def apply(): AggregateConformancePackComplianceFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateConformancePackComplianceFilters]
  }
  
  extension [Self <: AggregateConformancePackComplianceFilters](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setComplianceType(value: ConformancePackComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    inline def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    inline def setConformancePackNameUndefined: Self = StObject.set(x, "ConformancePackName", js.undefined)
  }
}
