package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRetentionConfigurationsResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
  
  /**
    * Returns a retention configuration object.
    */
  var RetentionConfigurations: js.UndefOr[RetentionConfigurationList] = js.native
}
object DescribeRetentionConfigurationsResponse {
  
  @scala.inline
  def apply(): DescribeRetentionConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRetentionConfigurationsResponse]
  }
  
  @scala.inline
  implicit class DescribeRetentionConfigurationsResponseMutableBuilder[Self <: DescribeRetentionConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRetentionConfigurations(value: RetentionConfigurationList): Self = StObject.set(x, "RetentionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionConfigurationsUndefined: Self = StObject.set(x, "RetentionConfigurations", js.undefined)
    
    @scala.inline
    def setRetentionConfigurationsVarargs(value: RetentionConfiguration*): Self = StObject.set(x, "RetentionConfigurations", js.Array(value :_*))
  }
}
