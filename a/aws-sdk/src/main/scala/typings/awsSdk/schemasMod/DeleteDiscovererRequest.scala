package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDiscovererRequest extends StObject {
  
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: string
}
object DeleteDiscovererRequest {
  
  inline def apply(DiscovererId: string): DeleteDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDiscovererRequest]
  }
  
  extension [Self <: DeleteDiscovererRequest](x: Self) {
    
    inline def setDiscovererId(value: string): Self = StObject.set(x, "DiscovererId", value.asInstanceOf[js.Any])
  }
}
