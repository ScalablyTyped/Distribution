package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayPrefixListReference extends js.Object {
  
  /**
    * Indicates whether traffic that matches this route is dropped.
    */
  var Blackhole: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: js.UndefOr[PrefixListResourceId] = js.native
  
  /**
    * The ID of the prefix list owner.
    */
  var PrefixListOwnerId: js.UndefOr[String] = js.native
  
  /**
    * The state of the prefix list reference.
    */
  var State: js.UndefOr[TransitGatewayPrefixListReferenceState] = js.native
  
  /**
    * Information about the transit gateway attachment.
    */
  var TransitGatewayAttachment: js.UndefOr[TransitGatewayPrefixListAttachment] = js.native
  
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayRouteTableId] = js.native
}
object TransitGatewayPrefixListReference {
  
  @scala.inline
  def apply(): TransitGatewayPrefixListReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPrefixListReference]
  }
  
  @scala.inline
  implicit class TransitGatewayPrefixListReferenceOps[Self <: TransitGatewayPrefixListReference] (val x: Self) extends AnyVal {
    
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
    def setBlackhole(value: Boolean): Self = this.set("Blackhole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlackhole: Self = this.set("Blackhole", js.undefined)
    
    @scala.inline
    def setPrefixListId(value: PrefixListResourceId): Self = this.set("PrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixListId: Self = this.set("PrefixListId", js.undefined)
    
    @scala.inline
    def setPrefixListOwnerId(value: String): Self = this.set("PrefixListOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixListOwnerId: Self = this.set("PrefixListOwnerId", js.undefined)
    
    @scala.inline
    def setState(value: TransitGatewayPrefixListReferenceState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTransitGatewayAttachment(value: TransitGatewayPrefixListAttachment): Self = this.set("TransitGatewayAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayAttachment: Self = this.set("TransitGatewayAttachment", js.undefined)
    
    @scala.inline
    def setTransitGatewayRouteTableId(value: TransitGatewayRouteTableId): Self = this.set("TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayRouteTableId: Self = this.set("TransitGatewayRouteTableId", js.undefined)
  }
}
