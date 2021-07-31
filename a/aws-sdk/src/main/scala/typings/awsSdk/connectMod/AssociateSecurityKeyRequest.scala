package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateSecurityKeyRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * A valid security key in PEM format.
    */
  var Key: PEM
}
object AssociateSecurityKeyRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, Key: PEM): AssociateSecurityKeyRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSecurityKeyRequest]
  }
  
  @scala.inline
  implicit class AssociateSecurityKeyRequestMutableBuilder[Self <: AssociateSecurityKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: PEM): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
