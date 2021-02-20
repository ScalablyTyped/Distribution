package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceAccessDetailsRequest extends StObject {
  
  /**
    * The name of the instance to access.
    */
  var instanceName: ResourceName = js.native
  
  /**
    * The protocol to use to connect to your instance. Defaults to ssh.
    */
  var protocol: js.UndefOr[InstanceAccessProtocol] = js.native
}
object GetInstanceAccessDetailsRequest {
  
  @scala.inline
  def apply(instanceName: ResourceName): GetInstanceAccessDetailsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceAccessDetailsRequest]
  }
  
  @scala.inline
  implicit class GetInstanceAccessDetailsRequestMutableBuilder[Self <: GetInstanceAccessDetailsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: InstanceAccessProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
