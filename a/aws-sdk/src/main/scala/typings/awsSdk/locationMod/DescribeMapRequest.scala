package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMapRequest extends StObject {
  
  /**
    * The name of the map resource.
    */
  var MapName: ResourceName
}
object DescribeMapRequest {
  
  inline def apply(MapName: ResourceName): DescribeMapRequest = {
    val __obj = js.Dynamic.literal(MapName = MapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMapRequest]
  }
  
  extension [Self <: DescribeMapRequest](x: Self) {
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
  }
}
