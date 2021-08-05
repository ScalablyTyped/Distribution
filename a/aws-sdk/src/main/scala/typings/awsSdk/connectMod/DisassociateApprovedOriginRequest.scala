package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateApprovedOriginRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The domain URL of the integrated application.
    */
  var Origin: typings.awsSdk.connectMod.Origin
}
object DisassociateApprovedOriginRequest {
  
  inline def apply(InstanceId: InstanceId, Origin: Origin): DisassociateApprovedOriginRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateApprovedOriginRequest]
  }
  
  extension [Self <: DisassociateApprovedOriginRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Origin): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
  }
}
