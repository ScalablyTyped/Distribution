package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateApprovedOriginRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The domain to add to your allow list.
    */
  var Origin: typings.awsSdk.connectMod.Origin
}
object AssociateApprovedOriginRequest {
  
  inline def apply(InstanceId: InstanceId, Origin: Origin): AssociateApprovedOriginRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateApprovedOriginRequest]
  }
  
  extension [Self <: AssociateApprovedOriginRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Origin): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
  }
}
