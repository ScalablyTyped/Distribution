package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFederationTokenRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
}
object GetFederationTokenRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId): GetFederationTokenRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFederationTokenRequest]
  }
  
  @scala.inline
  implicit class GetFederationTokenRequestMutableBuilder[Self <: GetFederationTokenRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
