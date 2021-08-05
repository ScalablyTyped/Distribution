package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternetGateway extends StObject {
  
  /**
    * Any VPCs attached to the internet gateway.
    */
  var Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.undefined
  
  /**
    * The ID of the internet gateway.
    */
  var InternetGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the AWS account that owns the internet gateway.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the internet gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object InternetGateway {
  
  inline def apply(): InternetGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternetGateway]
  }
  
  extension [Self <: InternetGateway](x: Self) {
    
    inline def setAttachments(value: InternetGatewayAttachmentList): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "Attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: InternetGatewayAttachment*): Self = StObject.set(x, "Attachments", js.Array(value :_*))
    
    inline def setInternetGatewayId(value: String): Self = StObject.set(x, "InternetGatewayId", value.asInstanceOf[js.Any])
    
    inline def setInternetGatewayIdUndefined: Self = StObject.set(x, "InternetGatewayId", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
