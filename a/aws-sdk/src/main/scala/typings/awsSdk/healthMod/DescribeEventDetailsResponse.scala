package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventDetailsResponse extends StObject {
  
  /**
    * Error messages for any events that could not be retrieved.
    */
  var failedSet: js.UndefOr[DescribeEventDetailsFailedSet] = js.native
  
  /**
    * Information about the events that could be retrieved.
    */
  var successfulSet: js.UndefOr[DescribeEventDetailsSuccessfulSet] = js.native
}
object DescribeEventDetailsResponse {
  
  @scala.inline
  def apply(): DescribeEventDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventDetailsResponse]
  }
  
  @scala.inline
  implicit class DescribeEventDetailsResponseMutableBuilder[Self <: DescribeEventDetailsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedSet(value: DescribeEventDetailsFailedSet): Self = StObject.set(x, "failedSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedSetUndefined: Self = StObject.set(x, "failedSet", js.undefined)
    
    @scala.inline
    def setFailedSetVarargs(value: EventDetailsErrorItem*): Self = StObject.set(x, "failedSet", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulSet(value: DescribeEventDetailsSuccessfulSet): Self = StObject.set(x, "successfulSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulSetUndefined: Self = StObject.set(x, "successfulSet", js.undefined)
    
    @scala.inline
    def setSuccessfulSetVarargs(value: EventDetails*): Self = StObject.set(x, "successfulSet", js.Array(value :_*))
  }
}
