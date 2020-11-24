package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEndpointGroupResponse extends js.Object {
  
  /**
    * The description of an endpoint group.
    */
  var EndpointGroup: js.UndefOr[typings.awsSdk.globalacceleratorMod.EndpointGroup] = js.native
}
object DescribeEndpointGroupResponse {
  
  @scala.inline
  def apply(): DescribeEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeEndpointGroupResponseOps[Self <: DescribeEndpointGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setEndpointGroup(value: EndpointGroup): Self = this.set("EndpointGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointGroup: Self = this.set("EndpointGroup", js.undefined)
  }
}
