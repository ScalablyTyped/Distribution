package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountAggregationSource extends js.Object {
  
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
  implicit class AccountAggregationSourceOps[Self <: AccountAggregationSource] (val x: Self) extends AnyVal {
    
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
    def setAccountIdsVarargs(value: AccountId*): Self = this.set("AccountIds", js.Array(value :_*))
    
    @scala.inline
    def setAccountIds(value: AccountAggregationSourceAccountList): Self = this.set("AccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllAwsRegions(value: Boolean): Self = this.set("AllAwsRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllAwsRegions: Self = this.set("AllAwsRegions", js.undefined)
    
    @scala.inline
    def setAwsRegionsVarargs(value: String*): Self = this.set("AwsRegions", js.Array(value :_*))
    
    @scala.inline
    def setAwsRegions(value: AggregatorRegionList): Self = this.set("AwsRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRegions: Self = this.set("AwsRegions", js.undefined)
  }
}
