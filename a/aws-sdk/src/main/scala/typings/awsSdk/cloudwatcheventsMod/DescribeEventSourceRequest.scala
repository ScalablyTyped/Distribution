package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventSourceRequest extends StObject {
  
  /**
    * The name of the partner event source to display the details of.
    */
  var Name: EventSourceName
}
object DescribeEventSourceRequest {
  
  @scala.inline
  def apply(Name: EventSourceName): DescribeEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventSourceRequest]
  }
  
  @scala.inline
  implicit class DescribeEventSourceRequestMutableBuilder[Self <: DescribeEventSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: EventSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
