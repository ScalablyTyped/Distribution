package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEndpointResponse extends js.Object {
  
  /**
    * The endpoint. The format of the endpoint is as follows: identifier.iot.region.amazonaws.com.
    */
  var endpointAddress: js.UndefOr[EndpointAddress] = js.native
}
object DescribeEndpointResponse {
  
  @scala.inline
  def apply(): DescribeEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointResponse]
  }
  
  @scala.inline
  implicit class DescribeEndpointResponseOps[Self <: DescribeEndpointResponse] (val x: Self) extends AnyVal {
    
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
    def setEndpointAddress(value: EndpointAddress): Self = this.set("endpointAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointAddress: Self = this.set("endpointAddress", js.undefined)
  }
}
