package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlaceIndexResponse extends StObject {
  
  /**
    * The timestamp for when the place index resource was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var CreateTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) for the place index resource. Used to specify a resource across AWS.    Format example: arn:aws:geo:region:account-id:place-index/ExamplePlaceIndex   
    */
  var IndexArn: Arn
  
  /**
    * The name for the place index resource.
    */
  var IndexName: ResourceName
}
object CreatePlaceIndexResponse {
  
  inline def apply(CreateTime: js.Date, IndexArn: Arn, IndexName: ResourceName): CreatePlaceIndexResponse = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], IndexArn = IndexArn.asInstanceOf[js.Any], IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlaceIndexResponse]
  }
  
  extension [Self <: CreatePlaceIndexResponse](x: Self) {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setIndexArn(value: Arn): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
    
    inline def setIndexName(value: ResourceName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
  }
}
