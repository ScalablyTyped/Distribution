package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcAttachment extends StObject {
  
  /**
    * The current state of the attachment.
    */
  var State: js.UndefOr[AttachmentStatus] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object VpcAttachment {
  
  @scala.inline
  def apply(): VpcAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcAttachment]
  }
  
  @scala.inline
  implicit class VpcAttachmentMutableBuilder[Self <: VpcAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: AttachmentStatus): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
