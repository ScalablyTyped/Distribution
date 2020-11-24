package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VPC extends js.Object {
  
  var VPCId: js.UndefOr[typings.awsSdk.route53Mod.VPCId] = js.native
  
  /**
    * (Private hosted zones only) The region that an Amazon VPC was created in.
    */
  var VPCRegion: js.UndefOr[typings.awsSdk.route53Mod.VPCRegion] = js.native
}
object VPC {
  
  @scala.inline
  def apply(): VPC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPC]
  }
  
  @scala.inline
  implicit class VPCOps[Self <: VPC] (val x: Self) extends AnyVal {
    
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
    def setVPCId(value: VPCId): Self = this.set("VPCId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVPCId: Self = this.set("VPCId", js.undefined)
    
    @scala.inline
    def setVPCRegion(value: VPCRegion): Self = this.set("VPCRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVPCRegion: Self = this.set("VPCRegion", js.undefined)
  }
}
