package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkOutput extends js.Object {
  
  /**
    * The unique identifier for the first member within the network.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.native
  
  /**
    * The unique identifier for the network.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.native
}
object CreateNetworkOutput {
  
  @scala.inline
  def apply(): CreateNetworkOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkOutput]
  }
  
  @scala.inline
  implicit class CreateNetworkOutputOps[Self <: CreateNetworkOutput] (val x: Self) extends AnyVal {
    
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
    def setMemberId(value: ResourceIdString): Self = this.set("MemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberId: Self = this.set("MemberId", js.undefined)
    
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = this.set("NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkId: Self = this.set("NetworkId", js.undefined)
  }
}
