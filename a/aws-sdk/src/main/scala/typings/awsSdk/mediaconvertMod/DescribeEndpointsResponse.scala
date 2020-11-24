package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEndpointsResponse extends js.Object {
  
  /**
    * List of endpoints
    */
  var Endpoints: js.UndefOr[listOfEndpoint] = js.native
  
  /**
    * Use this string to request the next batch of endpoints.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object DescribeEndpointsResponse {
  
  @scala.inline
  def apply(): DescribeEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointsResponse]
  }
  
  @scala.inline
  implicit class DescribeEndpointsResponseOps[Self <: DescribeEndpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpointsVarargs(value: Endpoint*): Self = this.set("Endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: listOfEndpoint): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
