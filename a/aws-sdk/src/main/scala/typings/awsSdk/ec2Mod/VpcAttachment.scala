package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcAttachment extends StObject {
  
  /**
    * The current state of the attachment.
    */
  var State: js.UndefOr[AttachmentStatus] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object VpcAttachment {
  
  inline def apply(): VpcAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcAttachment]
  }
  
  extension [Self <: VpcAttachment](x: Self) {
    
    inline def setState(value: AttachmentStatus): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
