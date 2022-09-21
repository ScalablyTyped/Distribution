package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePlaceIndexResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the upated place index resource. Used to specify a resource across AWS.   Format example: arn:aws:geo:region:account-id:place- index/ExamplePlaceIndex   
    */
  var IndexArn: Arn
  
  /**
    * The name of the updated place index resource.
    */
  var IndexName: ResourceName
  
  /**
    * The timestamp for when the place index resource was last updated in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var UpdateTime: js.Date
}
object UpdatePlaceIndexResponse {
  
  inline def apply(IndexArn: Arn, IndexName: ResourceName, UpdateTime: js.Date): UpdatePlaceIndexResponse = {
    val __obj = js.Dynamic.literal(IndexArn = IndexArn.asInstanceOf[js.Any], IndexName = IndexName.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePlaceIndexResponse]
  }
  
  extension [Self <: UpdatePlaceIndexResponse](x: Self) {
    
    inline def setIndexArn(value: Arn): Self = StObject.set(x, "IndexArn", value.asInstanceOf[js.Any])
    
    inline def setIndexName(value: ResourceName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
