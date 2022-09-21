package typings.awsSdk.timestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteScheduledQueryRequest extends StObject {
  
  /**
    * Not used. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.timestreamqueryMod.ClientToken] = js.undefined
  
  /**
    * The timestamp in UTC. Query will be run as if it was invoked at this timestamp. 
    */
  var InvocationTime: js.Date
  
  /**
    * ARN of the scheduled query.
    */
  var ScheduledQueryArn: AmazonResourceName
}
object ExecuteScheduledQueryRequest {
  
  inline def apply(InvocationTime: js.Date, ScheduledQueryArn: AmazonResourceName): ExecuteScheduledQueryRequest = {
    val __obj = js.Dynamic.literal(InvocationTime = InvocationTime.asInstanceOf[js.Any], ScheduledQueryArn = ScheduledQueryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteScheduledQueryRequest]
  }
  
  extension [Self <: ExecuteScheduledQueryRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setInvocationTime(value: js.Date): Self = StObject.set(x, "InvocationTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledQueryArn(value: AmazonResourceName): Self = StObject.set(x, "ScheduledQueryArn", value.asInstanceOf[js.Any])
  }
}
