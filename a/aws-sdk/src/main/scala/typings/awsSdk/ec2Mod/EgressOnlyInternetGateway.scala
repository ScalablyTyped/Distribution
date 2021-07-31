package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EgressOnlyInternetGateway extends StObject {
  
  /**
    * Information about the attachment of the egress-only internet gateway.
    */
  var Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.undefined
  
  /**
    * The ID of the egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.EgressOnlyInternetGatewayId] = js.undefined
  
  /**
    * The tags assigned to the egress-only internet gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object EgressOnlyInternetGateway {
  
  @scala.inline
  def apply(): EgressOnlyInternetGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EgressOnlyInternetGateway]
  }
  
  @scala.inline
  implicit class EgressOnlyInternetGatewayMutableBuilder[Self <: EgressOnlyInternetGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: InternetGatewayAttachmentList): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: InternetGatewayAttachment*): Self = StObject.set(x, "Attachments", js.Array(value :_*))
    
    @scala.inline
    def setEgressOnlyInternetGatewayId(value: EgressOnlyInternetGatewayId): Self = StObject.set(x, "EgressOnlyInternetGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressOnlyInternetGatewayIdUndefined: Self = StObject.set(x, "EgressOnlyInternetGatewayId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
