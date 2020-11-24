package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSpotInstanceRequestsResult extends js.Object {
  
  /**
    * The token to use to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * One or more Spot Instance requests.
    */
  var SpotInstanceRequests: js.UndefOr[SpotInstanceRequestList] = js.native
}
object DescribeSpotInstanceRequestsResult {
  
  @scala.inline
  def apply(): DescribeSpotInstanceRequestsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpotInstanceRequestsResult]
  }
  
  @scala.inline
  implicit class DescribeSpotInstanceRequestsResultOps[Self <: DescribeSpotInstanceRequestsResult] (val x: Self) extends AnyVal {
    
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
    def setSpotInstanceRequestsVarargs(value: SpotInstanceRequest*): Self = this.set("SpotInstanceRequests", js.Array(value :_*))
    
    @scala.inline
    def setSpotInstanceRequests(value: SpotInstanceRequestList): Self = this.set("SpotInstanceRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotInstanceRequests: Self = this.set("SpotInstanceRequests", js.undefined)
  }
}
