package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateApprovedOriginRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The domain URL of the integrated application.
    */
  var Origin: typings.awsSdk.connectMod.Origin = js.native
}
object DisassociateApprovedOriginRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, Origin: Origin): DisassociateApprovedOriginRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateApprovedOriginRequest]
  }
  
  @scala.inline
  implicit class DisassociateApprovedOriginRequestMutableBuilder[Self <: DisassociateApprovedOriginRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: Origin): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
  }
}
