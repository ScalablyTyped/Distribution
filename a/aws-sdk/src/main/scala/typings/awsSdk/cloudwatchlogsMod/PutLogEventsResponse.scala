package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLogEventsResponse extends StObject {
  
  /**
    * The next sequence token.
    */
  var nextSequenceToken: js.UndefOr[SequenceToken] = js.undefined
  
  /**
    * The rejected events.
    */
  var rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo] = js.undefined
}
object PutLogEventsResponse {
  
  @scala.inline
  def apply(): PutLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLogEventsResponse]
  }
  
  @scala.inline
  implicit class PutLogEventsResponseMutableBuilder[Self <: PutLogEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextSequenceToken(value: SequenceToken): Self = StObject.set(x, "nextSequenceToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSequenceTokenUndefined: Self = StObject.set(x, "nextSequenceToken", js.undefined)
    
    @scala.inline
    def setRejectedLogEventsInfo(value: RejectedLogEventsInfo): Self = StObject.set(x, "rejectedLogEventsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedLogEventsInfoUndefined: Self = StObject.set(x, "rejectedLogEventsInfo", js.undefined)
  }
}
