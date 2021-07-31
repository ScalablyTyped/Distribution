package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePartnerEventSourceResponse extends StObject {
  
  /**
    * The ARN of the partner event source.
    */
  var EventSourceArn: js.UndefOr[String] = js.undefined
}
object CreatePartnerEventSourceResponse {
  
  @scala.inline
  def apply(): CreatePartnerEventSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePartnerEventSourceResponse]
  }
  
  @scala.inline
  implicit class CreatePartnerEventSourceResponseMutableBuilder[Self <: CreatePartnerEventSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSourceArn(value: String): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
  }
}
