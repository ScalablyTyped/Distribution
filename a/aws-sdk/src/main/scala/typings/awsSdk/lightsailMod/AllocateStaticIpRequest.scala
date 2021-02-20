package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllocateStaticIpRequest extends StObject {
  
  /**
    * The name of the static IP address.
    */
  var staticIpName: ResourceName = js.native
}
object AllocateStaticIpRequest {
  
  @scala.inline
  def apply(staticIpName: ResourceName): AllocateStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateStaticIpRequest]
  }
  
  @scala.inline
  implicit class AllocateStaticIpRequestMutableBuilder[Self <: AllocateStaticIpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStaticIpName(value: ResourceName): Self = StObject.set(x, "staticIpName", value.asInstanceOf[js.Any])
  }
}
