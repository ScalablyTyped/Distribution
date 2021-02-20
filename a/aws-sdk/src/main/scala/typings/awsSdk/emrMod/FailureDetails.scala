package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureDetails extends StObject {
  
  /**
    * The path to the log file where the step failure root cause was originally recorded.
    */
  var LogFile: js.UndefOr[String] = js.native
  
  /**
    * The descriptive message including the error the EMR service has identified as the cause of step failure. This is text from an error log that describes the root cause of the failure.
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * The reason for the step failure. In the case where the service cannot successfully determine the root cause of the failure, it returns "Unknown Error" as a reason.
    */
  var Reason: js.UndefOr[String] = js.native
}
object FailureDetails {
  
  @scala.inline
  def apply(): FailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureDetails]
  }
  
  @scala.inline
  implicit class FailureDetailsMutableBuilder[Self <: FailureDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogFile(value: String): Self = StObject.set(x, "LogFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogFileUndefined: Self = StObject.set(x, "LogFile", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
