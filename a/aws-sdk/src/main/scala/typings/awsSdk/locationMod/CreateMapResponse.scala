package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMapResponse extends StObject {
  
  /**
    * The timestamp for when the map resource was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ.
    */
  var CreateTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) for the map resource. Used to specify a resource across all AWS.   Format example: arn:aws:geo:region:account-id:maps/ExampleMap   
    */
  var MapArn: Arn
  
  /**
    * The name of the map resource.
    */
  var MapName: ResourceName
}
object CreateMapResponse {
  
  inline def apply(CreateTime: js.Date, MapArn: Arn, MapName: ResourceName): CreateMapResponse = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], MapArn = MapArn.asInstanceOf[js.Any], MapName = MapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMapResponse]
  }
  
  extension [Self <: CreateMapResponse](x: Self) {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setMapArn(value: Arn): Self = StObject.set(x, "MapArn", value.asInstanceOf[js.Any])
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
  }
}
