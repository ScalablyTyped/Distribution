package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOriginEndpointRequest extends StObject {
  
  /**
    * The ID of the OriginEndpoint to delete.
    */
  var Id: string
}
object DeleteOriginEndpointRequest {
  
  inline def apply(Id: string): DeleteOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOriginEndpointRequest]
  }
  
  extension [Self <: DeleteOriginEndpointRequest](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
