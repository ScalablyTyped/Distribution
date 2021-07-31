package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStaticIpRequest extends StObject {
  
  /**
    * The name of the static IP in Lightsail.
    */
  var staticIpName: ResourceName
}
object GetStaticIpRequest {
  
  @scala.inline
  def apply(staticIpName: ResourceName): GetStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStaticIpRequest]
  }
  
  @scala.inline
  implicit class GetStaticIpRequestMutableBuilder[Self <: GetStaticIpRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStaticIpName(value: ResourceName): Self = StObject.set(x, "staticIpName", value.asInstanceOf[js.Any])
  }
}
