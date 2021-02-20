package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchEventsExecutionDataDetails extends StObject {
  
  /**
    * Indicates whether input or output was included in the response. Always true for API calls. 
    */
  var included: js.UndefOr[typings.awsSdk.stepfunctionsMod.included] = js.native
}
object CloudWatchEventsExecutionDataDetails {
  
  @scala.inline
  def apply(): CloudWatchEventsExecutionDataDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchEventsExecutionDataDetails]
  }
  
  @scala.inline
  implicit class CloudWatchEventsExecutionDataDetailsMutableBuilder[Self <: CloudWatchEventsExecutionDataDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncluded(value: included): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
  }
}
