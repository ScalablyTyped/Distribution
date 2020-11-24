package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectionsOnInterconnectRequest extends js.Object {
  
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId = js.native
}
object DescribeConnectionsOnInterconnectRequest {
  
  @scala.inline
  def apply(interconnectId: InterconnectId): DescribeConnectionsOnInterconnectRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConnectionsOnInterconnectRequest]
  }
  
  @scala.inline
  implicit class DescribeConnectionsOnInterconnectRequestOps[Self <: DescribeConnectionsOnInterconnectRequest] (val x: Self) extends AnyVal {
    
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
    def setInterconnectId(value: InterconnectId): Self = this.set("interconnectId", value.asInstanceOf[js.Any])
  }
}
