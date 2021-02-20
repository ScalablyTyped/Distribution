package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountAggregationSource extends StObject {
  
  /**
    * The 12-digit account ID of the account being aggregated. 
    */
  var AccountIds: AccountAggregationSourceAccountList = js.native
  
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var AllAwsRegions: js.UndefOr[Boolean] = js.native
  
  /**
    * The source regions being aggregated.
    */
  var AwsRegions: js.UndefOr[AggregatorRegionList] = js.native
}
object AccountAggregationSource {
  
  @scala.inline
  def apply(AccountIds: AccountAggregationSourceAccountList): AccountAggregationSource = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAggregationSource]
  }
  
  @scala.inline
  implicit class AccountAggregationSourceMutableBuilder[Self <: AccountAggregationSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: AccountAggregationSourceAccountList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setAllAwsRegions(value: Boolean): Self = StObject.set(x, "AllAwsRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllAwsRegionsUndefined: Self = StObject.set(x, "AllAwsRegions", js.undefined)
    
    @scala.inline
    def setAwsRegions(value: AggregatorRegionList): Self = StObject.set(x, "AwsRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionsUndefined: Self = StObject.set(x, "AwsRegions", js.undefined)
    
    @scala.inline
    def setAwsRegionsVarargs(value: String*): Self = StObject.set(x, "AwsRegions", js.Array(value :_*))
  }
}
