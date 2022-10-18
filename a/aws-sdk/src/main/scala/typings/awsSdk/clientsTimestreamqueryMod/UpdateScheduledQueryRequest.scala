package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScheduledQueryRequest extends StObject {
  
  /**
    * ARN of the scheuled query.
    */
  var ScheduledQueryArn: AmazonResourceName
  
  /**
    * State of the scheduled query. 
    */
  var State: ScheduledQueryState
}
object UpdateScheduledQueryRequest {
  
  inline def apply(ScheduledQueryArn: AmazonResourceName, State: ScheduledQueryState): UpdateScheduledQueryRequest = {
    val __obj = js.Dynamic.literal(ScheduledQueryArn = ScheduledQueryArn.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScheduledQueryRequest]
  }
  
  extension [Self <: UpdateScheduledQueryRequest](x: Self) {
    
    inline def setScheduledQueryArn(value: AmazonResourceName): Self = StObject.set(x, "ScheduledQueryArn", value.asInstanceOf[js.Any])
    
    inline def setState(value: ScheduledQueryState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
