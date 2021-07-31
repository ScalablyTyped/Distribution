package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventBusRequest extends StObject {
  
  /**
    * The name or ARN of the event bus to show details for. If you omit this, the default event bus is displayed.
    */
  var Name: js.UndefOr[EventBusNameOrArn] = js.undefined
}
object DescribeEventBusRequest {
  
  @scala.inline
  def apply(): DescribeEventBusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventBusRequest]
  }
  
  @scala.inline
  implicit class DescribeEventBusRequestMutableBuilder[Self <: DescribeEventBusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: EventBusNameOrArn): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
