package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationAggregationSource extends StObject {
  
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
  implicit class OrganizationAggregationSourceMutableBuilder[Self <: OrganizationAggregationSource] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
