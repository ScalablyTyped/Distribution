package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventTrackerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group that receives the event data.
    */
  var datasetGroupArn: Arn
  
  /**
    * The name for the event tracker.
    */
  var name: Name
}
object CreateEventTrackerRequest {
  
  inline def apply(datasetGroupArn: Arn, name: Name): CreateEventTrackerRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventTrackerRequest]
  }
  
  extension [Self <: CreateEventTrackerRequest](x: Self) {
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
