package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkAclResult extends js.Object {
  
  /**
    * Information about the network ACL.
    */
  var NetworkAcl: js.UndefOr[typings.awsSdk.ec2Mod.NetworkAcl] = js.native
}
object CreateNetworkAclResult {
  
  @scala.inline
  def apply(): CreateNetworkAclResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkAclResult]
  }
  
  @scala.inline
  implicit class CreateNetworkAclResultOps[Self <: CreateNetworkAclResult] (val x: Self) extends AnyVal {
    
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
    def setNetworkAcl(value: NetworkAcl): Self = this.set("NetworkAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkAcl: Self = this.set("NetworkAcl", js.undefined)
  }
}
