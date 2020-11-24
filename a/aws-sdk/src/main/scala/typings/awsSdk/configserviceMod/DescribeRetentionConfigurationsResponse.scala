package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRetentionConfigurationsResponse extends js.Object {
  
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
  implicit class DescribeRetentionConfigurationsResponseOps[Self <: DescribeRetentionConfigurationsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRetentionConfigurationsVarargs(value: RetentionConfiguration*): Self = this.set("RetentionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setRetentionConfigurations(value: RetentionConfigurationList): Self = this.set("RetentionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionConfigurations: Self = this.set("RetentionConfigurations", js.undefined)
  }
}
