package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateActivityOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the created activity.
    */
  var activityArn: Arn
  
  /**
    * The date the activity is created.
    */
  var creationDate: Timestamp
}
object CreateActivityOutput {
  
  inline def apply(activityArn: Arn, creationDate: Timestamp): CreateActivityOutput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActivityOutput]
  }
  
  extension [Self <: CreateActivityOutput](x: Self) {
    
    inline def setActivityArn(value: Arn): Self = StObject.set(x, "activityArn", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: Timestamp): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
  }
}
