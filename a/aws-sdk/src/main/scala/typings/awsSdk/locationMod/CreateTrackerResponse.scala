package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrackerResponse extends StObject {
  
  /**
    * The timestamp for when the tracker resource was created in  ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ. 
    */
  var CreateTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across all AWS.   Format example: arn:aws:geo:region:account-id:tracker/ExampleTracker   
    */
  var TrackerArn: Arn
  
  /**
    * The name of the tracker resource.
    */
  var TrackerName: ResourceName
}
object CreateTrackerResponse {
  
  inline def apply(CreateTime: js.Date, TrackerArn: Arn, TrackerName: ResourceName): CreateTrackerResponse = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], TrackerArn = TrackerArn.asInstanceOf[js.Any], TrackerName = TrackerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrackerResponse]
  }
  
  extension [Self <: CreateTrackerResponse](x: Self) {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setTrackerArn(value: Arn): Self = StObject.set(x, "TrackerArn", value.asInstanceOf[js.Any])
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
  }
}
