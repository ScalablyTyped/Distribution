package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcEndpointServiceConfigurationsResult extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about one or more services.
    */
  var ServiceConfigurations: js.UndefOr[ServiceConfigurationSet] = js.native
}
object DescribeVpcEndpointServiceConfigurationsResult {
  
  @scala.inline
  def apply(): DescribeVpcEndpointServiceConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointServiceConfigurationsResult]
  }
  
  @scala.inline
  implicit class DescribeVpcEndpointServiceConfigurationsResultOps[Self <: DescribeVpcEndpointServiceConfigurationsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setServiceConfigurationsVarargs(value: ServiceConfiguration*): Self = this.set("ServiceConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setServiceConfigurations(value: ServiceConfigurationSet): Self = this.set("ServiceConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceConfigurations: Self = this.set("ServiceConfigurations", js.undefined)
  }
}
