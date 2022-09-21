package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAggregationSource extends StObject {
  
  /**
    * The 12-digit account ID of the account being aggregated. 
    */
  var AccountIds: AccountAggregationSourceAccountList
  
  /**
    * If true, aggregate existing Config regions and future regions.
    */
  var AllAwsRegions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The source regions being aggregated.
    */
  var AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined
}
object AccountAggregationSource {
  
  inline def apply(AccountIds: AccountAggregationSourceAccountList): AccountAggregationSource = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAggregationSource]
  }
  
  extension [Self <: AccountAggregationSource](x: Self) {
    
    inline def setAccountIds(value: AccountAggregationSourceAccountList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setAllAwsRegions(value: Boolean): Self = StObject.set(x, "AllAwsRegions", value.asInstanceOf[js.Any])
    
    inline def setAllAwsRegionsUndefined: Self = StObject.set(x, "AllAwsRegions", js.undefined)
    
    inline def setAwsRegions(value: AggregatorRegionList): Self = StObject.set(x, "AwsRegions", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionsUndefined: Self = StObject.set(x, "AwsRegions", js.undefined)
    
    inline def setAwsRegionsVarargs(value: String*): Self = StObject.set(x, "AwsRegions", js.Array(value*))
  }
}
