package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatedTargetNetwork extends js.Object {
  
  /**
    * The ID of the subnet.
    */
  var NetworkId: js.UndefOr[String] = js.native
  
  /**
    * The target network type.
    */
  var NetworkType: js.UndefOr[AssociatedNetworkType] = js.native
}
object AssociatedTargetNetwork {
  
  @scala.inline
  def apply(): AssociatedTargetNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedTargetNetwork]
  }
  
  @scala.inline
  implicit class AssociatedTargetNetworkOps[Self <: AssociatedTargetNetwork] (val x: Self) extends AnyVal {
    
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
    def setNetworkId(value: String): Self = this.set("NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkId: Self = this.set("NetworkId", js.undefined)
    
    @scala.inline
    def setNetworkType(value: AssociatedNetworkType): Self = this.set("NetworkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkType: Self = this.set("NetworkType", js.undefined)
  }
}
