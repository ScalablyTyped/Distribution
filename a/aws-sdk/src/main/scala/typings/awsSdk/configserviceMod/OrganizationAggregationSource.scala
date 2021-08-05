package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationAggregationSource extends StObject {
  
  /**
    * If true, aggregate existing AWS Config regions and future regions.
    */
  var AllAwsRegions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The source regions being aggregated.
    */
  var AwsRegions: js.UndefOr[AggregatorRegionList] = js.undefined
  
  /**
    * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
    */
  var RoleArn: String
}
object OrganizationAggregationSource {
  
  inline def apply(RoleArn: String): OrganizationAggregationSource = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationAggregationSource]
  }
  
  extension [Self <: OrganizationAggregationSource](x: Self) {
    
    inline def setAllAwsRegions(value: Boolean): Self = StObject.set(x, "AllAwsRegions", value.asInstanceOf[js.Any])
    
    inline def setAllAwsRegionsUndefined: Self = StObject.set(x, "AllAwsRegions", js.undefined)
    
    inline def setAwsRegions(value: AggregatorRegionList): Self = StObject.set(x, "AwsRegions", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionsUndefined: Self = StObject.set(x, "AwsRegions", js.undefined)
    
    inline def setAwsRegionsVarargs(value: String*): Self = StObject.set(x, "AwsRegions", js.Array(value :_*))
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
