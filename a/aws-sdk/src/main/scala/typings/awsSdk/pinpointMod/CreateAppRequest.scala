package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppRequest extends StObject {
  
  var CreateApplicationRequest: typings.awsSdk.pinpointMod.CreateApplicationRequest
}
object CreateAppRequest {
  
  inline def apply(CreateApplicationRequest: CreateApplicationRequest): CreateAppRequest = {
    val __obj = js.Dynamic.literal(CreateApplicationRequest = CreateApplicationRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
  
  extension [Self <: CreateAppRequest](x: Self) {
    
    inline def setCreateApplicationRequest(value: CreateApplicationRequest): Self = StObject.set(x, "CreateApplicationRequest", value.asInstanceOf[js.Any])
  }
}
