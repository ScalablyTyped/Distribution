package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMapRequest extends StObject {
  
  /**
    * The name of the map resource to be deleted.
    */
  var MapName: ResourceName
}
object DeleteMapRequest {
  
  inline def apply(MapName: ResourceName): DeleteMapRequest = {
    val __obj = js.Dynamic.literal(MapName = MapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMapRequest]
  }
  
  extension [Self <: DeleteMapRequest](x: Self) {
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
  }
}
