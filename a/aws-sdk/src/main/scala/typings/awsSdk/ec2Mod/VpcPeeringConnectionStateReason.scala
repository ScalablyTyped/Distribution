package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcPeeringConnectionStateReason extends StObject {
  
  /**
    * The status of the VPC peering connection.
    */
  var Code: js.UndefOr[VpcPeeringConnectionStateReasonCode] = js.undefined
  
  /**
    * A message that provides more information about the status, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object VpcPeeringConnectionStateReason {
  
  @scala.inline
  def apply(): VpcPeeringConnectionStateReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionStateReason]
  }
  
  @scala.inline
  implicit class VpcPeeringConnectionStateReasonMutableBuilder[Self <: VpcPeeringConnectionStateReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: VpcPeeringConnectionStateReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
