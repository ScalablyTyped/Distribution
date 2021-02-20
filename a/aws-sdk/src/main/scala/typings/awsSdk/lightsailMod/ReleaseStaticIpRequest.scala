package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseStaticIpRequest extends StObject {
  
  /**
    * The name of the static IP to delete.
    */
  var staticIpName: ResourceName = js.native
}
object ReleaseStaticIpRequest {
  
  @scala.inline
  def apply(staticIpName: ResourceName): ReleaseStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseStaticIpRequest]
  }
  
  @scala.inline
  implicit class ReleaseStaticIpRequestMutableBuilder[Self <: ReleaseStaticIpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStaticIpName(value: ResourceName): Self = StObject.set(x, "staticIpName", value.asInstanceOf[js.Any])
  }
}
