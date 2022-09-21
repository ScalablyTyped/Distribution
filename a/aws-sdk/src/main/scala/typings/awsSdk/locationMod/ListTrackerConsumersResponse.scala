package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrackerConsumersResponse extends StObject {
  
  /**
    * Contains the list of geofence collection ARNs associated to the tracker resource.
    */
  var ConsumerArns: ArnList
  
  /**
    * A pagination token indicating there are additional pages available. You can use the token in a following request to fetch the next set of results. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListTrackerConsumersResponse {
  
  inline def apply(ConsumerArns: ArnList): ListTrackerConsumersResponse = {
    val __obj = js.Dynamic.literal(ConsumerArns = ConsumerArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrackerConsumersResponse]
  }
  
  extension [Self <: ListTrackerConsumersResponse](x: Self) {
    
    inline def setConsumerArns(value: ArnList): Self = StObject.set(x, "ConsumerArns", value.asInstanceOf[js.Any])
    
    inline def setConsumerArnsVarargs(value: Arn*): Self = StObject.set(x, "ConsumerArns", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
