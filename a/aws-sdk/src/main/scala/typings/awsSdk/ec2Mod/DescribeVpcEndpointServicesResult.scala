package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcEndpointServicesResult extends js.Object {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the service.
    */
  var ServiceDetails: js.UndefOr[ServiceDetailSet] = js.native
  
  /**
    * A list of supported services.
    */
  var ServiceNames: js.UndefOr[ValueStringList] = js.native
}
object DescribeVpcEndpointServicesResult {
  
  @scala.inline
  def apply(): DescribeVpcEndpointServicesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointServicesResult]
  }
  
  @scala.inline
  implicit class DescribeVpcEndpointServicesResultOps[Self <: DescribeVpcEndpointServicesResult] (val x: Self) extends AnyVal {
    
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
    def setServiceDetailsVarargs(value: ServiceDetail*): Self = this.set("ServiceDetails", js.Array(value :_*))
    
    @scala.inline
    def setServiceDetails(value: ServiceDetailSet): Self = this.set("ServiceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceDetails: Self = this.set("ServiceDetails", js.undefined)
    
    @scala.inline
    def setServiceNamesVarargs(value: String*): Self = this.set("ServiceNames", js.Array(value :_*))
    
    @scala.inline
    def setServiceNames(value: ValueStringList): Self = this.set("ServiceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceNames: Self = this.set("ServiceNames", js.undefined)
  }
}
