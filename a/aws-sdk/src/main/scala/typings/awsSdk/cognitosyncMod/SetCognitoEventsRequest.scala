package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCognitoEventsRequest extends StObject {
  
  /**
    * The events to configure
    */
  var Events: typings.awsSdk.cognitosyncMod.Events
  
  /**
    * The Cognito Identity Pool to use when configuring Cognito Events
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId
}
object SetCognitoEventsRequest {
  
  inline def apply(Events: Events, IdentityPoolId: IdentityPoolId): SetCognitoEventsRequest = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCognitoEventsRequest]
  }
  
  extension [Self <: SetCognitoEventsRequest](x: Self) {
    
    inline def setEvents(value: Events): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
  }
}
