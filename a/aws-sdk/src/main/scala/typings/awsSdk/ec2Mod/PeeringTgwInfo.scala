package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeeringTgwInfo extends js.Object {
  
  /**
    * The AWS account ID of the owner of the transit gateway.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The Region of the transit gateway.
    */
  var Region: js.UndefOr[String] = js.native
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
}
object PeeringTgwInfo {
  
  @scala.inline
  def apply(): PeeringTgwInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeringTgwInfo]
  }
  
  @scala.inline
  implicit class PeeringTgwInfoOps[Self <: PeeringTgwInfo] (val x: Self) extends AnyVal {
    
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
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("TransitGatewayId", js.undefined)
  }
}
