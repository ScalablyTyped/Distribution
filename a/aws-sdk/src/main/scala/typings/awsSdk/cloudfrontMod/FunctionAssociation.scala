package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionAssociation extends StObject {
  
  /**
    * The event type of the function, either viewer-request or viewer-response. You cannot use origin-facing event types (origin-request and origin-response) with a CloudFront function.
    */
  var EventType: typings.awsSdk.cloudfrontMod.EventType
  
  /**
    * The Amazon Resource Name (ARN) of the function.
    */
  var FunctionARN: typings.awsSdk.cloudfrontMod.FunctionARN
}
object FunctionAssociation {
  
  inline def apply(EventType: EventType, FunctionARN: FunctionARN): FunctionAssociation = {
    val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], FunctionARN = FunctionARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionAssociation]
  }
  
  extension [Self <: FunctionAssociation](x: Self) {
    
    inline def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setFunctionARN(value: FunctionARN): Self = StObject.set(x, "FunctionARN", value.asInstanceOf[js.Any])
  }
}
