package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationAggregationSource extends js.Object {
  
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var AllAwsRegions: js.UndefOr[Boolean] = js.native
  
  /**
    * The source regions being aggregated.
    */
  var AwsRegions: js.UndefOr[AggregatorRegionList] = js.native
  
  /**
    * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
    */
  var RoleArn: String = js.native
}
object OrganizationAggregationSource {
  
  @scala.inline
  def apply(RoleArn: String): OrganizationAggregationSource = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationAggregationSource]
  }
  
  @scala.inline
  implicit class OrganizationAggregationSourceOps[Self <: OrganizationAggregationSource] (val x: Self) extends AnyVal {
    
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
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
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
