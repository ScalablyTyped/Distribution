package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRetentionConfigurationsRequest extends js.Object {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
  
  /**
    * A list of names of retention configurations for which you want details. If you do not specify a name, AWS Config returns details for all the retention configurations for that account.  Currently, AWS Config supports only one retention configuration per region in your account. 
    */
  var RetentionConfigurationNames: js.UndefOr[RetentionConfigurationNameList] = js.native
}
object DescribeRetentionConfigurationsRequest {
  
  @scala.inline
  def apply(): DescribeRetentionConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRetentionConfigurationsRequest]
  }
  
  @scala.inline
  implicit class DescribeRetentionConfigurationsRequestOps[Self <: DescribeRetentionConfigurationsRequest] (val x: Self) extends AnyVal {
    
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
    def setRetentionConfigurationNamesVarargs(value: RetentionConfigurationName*): Self = this.set("RetentionConfigurationNames", js.Array(value :_*))
    
    @scala.inline
    def setRetentionConfigurationNames(value: RetentionConfigurationNameList): Self = this.set("RetentionConfigurationNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionConfigurationNames: Self = this.set("RetentionConfigurationNames", js.undefined)
  }
}
