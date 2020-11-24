package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCarrierGatewaysResult extends js.Object {
  
  /**
    * Information about the carrier gateway.
    */
  var CarrierGateways: js.UndefOr[CarrierGatewaySet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeCarrierGatewaysResult {
  
  @scala.inline
  def apply(): DescribeCarrierGatewaysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCarrierGatewaysResult]
  }
  
  @scala.inline
  implicit class DescribeCarrierGatewaysResultOps[Self <: DescribeCarrierGatewaysResult] (val x: Self) extends AnyVal {
    
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
    def setCarrierGatewaysVarargs(value: CarrierGateway*): Self = this.set("CarrierGateways", js.Array(value :_*))
    
    @scala.inline
    def setCarrierGateways(value: CarrierGatewaySet): Self = this.set("CarrierGateways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierGateways: Self = this.set("CarrierGateways", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
