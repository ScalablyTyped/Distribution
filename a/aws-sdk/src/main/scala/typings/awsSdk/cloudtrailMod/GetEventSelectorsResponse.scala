package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventSelectorsResponse extends StObject {
  
  /**
    * The event selectors that are configured for the trail.
    */
  var EventSelectors: js.UndefOr[typings.awsSdk.cloudtrailMod.EventSelectors] = js.native
  
  /**
    * The specified trail ARN that has the event selectors.
    */
  var TrailARN: js.UndefOr[String] = js.native
}
object GetEventSelectorsResponse {
  
  @scala.inline
  def apply(): GetEventSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventSelectorsResponse]
  }
  
  @scala.inline
  implicit class GetEventSelectorsResponseMutableBuilder[Self <: GetEventSelectorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSelectors(value: EventSelectors): Self = StObject.set(x, "EventSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSelectorsUndefined: Self = StObject.set(x, "EventSelectors", js.undefined)
    
    @scala.inline
    def setEventSelectorsVarargs(value: EventSelector*): Self = StObject.set(x, "EventSelectors", js.Array(value :_*))
    
    @scala.inline
    def setTrailARN(value: String): Self = StObject.set(x, "TrailARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailARNUndefined: Self = StObject.set(x, "TrailARN", js.undefined)
  }
}
