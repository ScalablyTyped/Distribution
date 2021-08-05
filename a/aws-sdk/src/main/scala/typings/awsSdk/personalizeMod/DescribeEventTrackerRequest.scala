package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventTrackerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the event tracker to describe.
    */
  var eventTrackerArn: Arn
}
object DescribeEventTrackerRequest {
  
  inline def apply(eventTrackerArn: Arn): DescribeEventTrackerRequest = {
    val __obj = js.Dynamic.literal(eventTrackerArn = eventTrackerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventTrackerRequest]
  }
  
  extension [Self <: DescribeEventTrackerRequest](x: Self) {
    
    inline def setEventTrackerArn(value: Arn): Self = StObject.set(x, "eventTrackerArn", value.asInstanceOf[js.Any])
  }
}
