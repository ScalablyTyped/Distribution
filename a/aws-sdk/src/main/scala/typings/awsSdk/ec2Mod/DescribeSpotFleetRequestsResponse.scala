package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSpotFleetRequestsResponse extends js.Object {
  
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the configuration of your Spot Fleet.
    */
  var SpotFleetRequestConfigs: js.UndefOr[SpotFleetRequestConfigSet] = js.native
}
object DescribeSpotFleetRequestsResponse {
  
  @scala.inline
  def apply(): DescribeSpotFleetRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotFleetRequestsResponse]
  }
  
  @scala.inline
  implicit class DescribeSpotFleetRequestsResponseOps[Self <: DescribeSpotFleetRequestsResponse] (val x: Self) extends AnyVal {
    
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
    def setSpotFleetRequestConfigsVarargs(value: SpotFleetRequestConfig*): Self = this.set("SpotFleetRequestConfigs", js.Array(value :_*))
    
    @scala.inline
    def setSpotFleetRequestConfigs(value: SpotFleetRequestConfigSet): Self = this.set("SpotFleetRequestConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotFleetRequestConfigs: Self = this.set("SpotFleetRequestConfigs", js.undefined)
  }
}
