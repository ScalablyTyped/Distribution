package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDedicatedIpResponse extends StObject {
  
  /**
    * An object that contains information about a dedicated IP address.
    */
  var DedicatedIp: js.UndefOr[typings.awsSdk.pinpointemailMod.DedicatedIp] = js.undefined
}
object GetDedicatedIpResponse {
  
  @scala.inline
  def apply(): GetDedicatedIpResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDedicatedIpResponse]
  }
  
  @scala.inline
  implicit class GetDedicatedIpResponseMutableBuilder[Self <: GetDedicatedIpResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDedicatedIp(value: DedicatedIp): Self = StObject.set(x, "DedicatedIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedIpUndefined: Self = StObject.set(x, "DedicatedIp", js.undefined)
  }
}
