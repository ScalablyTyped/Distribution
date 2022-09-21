package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMulticastGroupSessionRequest extends StObject {
  
  var Id: MulticastGroupId
}
object GetMulticastGroupSessionRequest {
  
  inline def apply(Id: MulticastGroupId): GetMulticastGroupSessionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMulticastGroupSessionRequest]
  }
  
  extension [Self <: GetMulticastGroupSessionRequest](x: Self) {
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
