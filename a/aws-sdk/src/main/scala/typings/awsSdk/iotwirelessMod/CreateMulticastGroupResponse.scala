package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMulticastGroupResponse extends StObject {
  
  var Arn: js.UndefOr[MulticastGroupArn] = js.undefined
  
  var Id: js.UndefOr[MulticastGroupId] = js.undefined
}
object CreateMulticastGroupResponse {
  
  inline def apply(): CreateMulticastGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMulticastGroupResponse]
  }
  
  extension [Self <: CreateMulticastGroupResponse](x: Self) {
    
    inline def setArn(value: MulticastGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
