package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMapResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated map resource. Used to specify a resource across AWS.   Format example: arn:aws:geo:region:account-id:maps/ExampleMap   
    */
  var MapArn: Arn
  
  /**
    * The name of the updated map resource.
    */
  var MapName: ResourceName
  
  /**
    * The timestamp for when the map resource was last updated in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var UpdateTime: js.Date
}
object UpdateMapResponse {
  
  inline def apply(MapArn: Arn, MapName: ResourceName, UpdateTime: js.Date): UpdateMapResponse = {
    val __obj = js.Dynamic.literal(MapArn = MapArn.asInstanceOf[js.Any], MapName = MapName.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMapResponse]
  }
  
  extension [Self <: UpdateMapResponse](x: Self) {
    
    inline def setMapArn(value: Arn): Self = StObject.set(x, "MapArn", value.asInstanceOf[js.Any])
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
