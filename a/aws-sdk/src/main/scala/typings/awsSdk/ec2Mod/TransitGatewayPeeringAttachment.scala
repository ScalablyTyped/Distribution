package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitGatewayPeeringAttachment extends StObject {
  
  /**
    * Information about the accepter transit gateway.
    */
  var AccepterTgwInfo: js.UndefOr[PeeringTgwInfo] = js.native
  
  /**
    * The time the transit gateway peering attachment was created.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  
  /**
    * Information about the requester transit gateway.
    */
  var RequesterTgwInfo: js.UndefOr[PeeringTgwInfo] = js.native
  
  /**
    * The state of the transit gateway peering attachment. Note that the initiating state has been deprecated.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.native
  
  /**
    * The status of the transit gateway peering attachment.
    */
  var Status: js.UndefOr[PeeringAttachmentStatus] = js.native
  
  /**
    * The tags for the transit gateway peering attachment.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the transit gateway peering attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.native
}
object TransitGatewayPeeringAttachment {
  
  @scala.inline
  def apply(): TransitGatewayPeeringAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPeeringAttachment]
  }
  
  @scala.inline
  implicit class TransitGatewayPeeringAttachmentMutableBuilder[Self <: TransitGatewayPeeringAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepterTgwInfo(value: PeeringTgwInfo): Self = StObject.set(x, "AccepterTgwInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccepterTgwInfoUndefined: Self = StObject.set(x, "AccepterTgwInfo", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setRequesterTgwInfo(value: PeeringTgwInfo): Self = StObject.set(x, "RequesterTgwInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterTgwInfoUndefined: Self = StObject.set(x, "RequesterTgwInfo", js.undefined)
    
    @scala.inline
    def setState(value: TransitGatewayAttachmentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStatus(value: PeeringAttachmentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTransitGatewayAttachmentId(value: String): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
  }
}
