package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryEventExecutionDataDetails extends StObject {
  
  /**
    * Indicates whether input or output was truncated in the response. Always false for API calls.
    */
  var truncated: js.UndefOr[typings.awsSdk.stepfunctionsMod.truncated] = js.native
}
object HistoryEventExecutionDataDetails {
  
  @scala.inline
  def apply(): HistoryEventExecutionDataDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryEventExecutionDataDetails]
  }
  
  @scala.inline
  implicit class HistoryEventExecutionDataDetailsMutableBuilder[Self <: HistoryEventExecutionDataDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTruncated(value: truncated): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
  }
}
