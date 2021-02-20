package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEventSelectorsResponse extends StObject {
  
  /**
    * Specifies the event selectors configured for your trail.
    */
  var EventSelectors: js.UndefOr[typings.awsSdk.cloudtrailMod.EventSelectors] = js.native
  
  /**
    * Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.native
}
object PutEventSelectorsResponse {
  
  @scala.inline
  def apply(): PutEventSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventSelectorsResponse]
  }
  
  @scala.inline
  implicit class PutEventSelectorsResponseMutableBuilder[Self <: PutEventSelectorsResponse] (val x: Self) extends AnyVal {
    
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
