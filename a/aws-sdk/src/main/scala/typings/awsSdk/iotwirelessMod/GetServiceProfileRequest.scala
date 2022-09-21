package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceProfileRequest extends StObject {
  
  /**
    * The ID of the resource to get.
    */
  var Id: ServiceProfileId
}
object GetServiceProfileRequest {
  
  inline def apply(Id: ServiceProfileId): GetServiceProfileRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceProfileRequest]
  }
  
  extension [Self <: GetServiceProfileRequest](x: Self) {
    
    inline def setId(value: ServiceProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
