package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCognitoEventsResponse extends StObject {
  
  /**
    * The Cognito Events returned from the GetCognitoEvents request
    */
  var Events: js.UndefOr[typings.awsSdk.cognitosyncMod.Events] = js.native
}
object GetCognitoEventsResponse {
  
  @scala.inline
  def apply(): GetCognitoEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCognitoEventsResponse]
  }
  
  @scala.inline
  implicit class GetCognitoEventsResponseMutableBuilder[Self <: GetCognitoEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: Events): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
  }
}
