package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMulticastGroupRequest extends StObject {
  
  var Id: MulticastGroupId
}
object GetMulticastGroupRequest {
  
  inline def apply(Id: MulticastGroupId): GetMulticastGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMulticastGroupRequest]
  }
  
  extension [Self <: GetMulticastGroupRequest](x: Self) {
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
