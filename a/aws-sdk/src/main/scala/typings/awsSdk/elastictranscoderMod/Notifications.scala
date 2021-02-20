package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notifications extends StObject {
  
  /**
    * The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.
    */
  var Completed: js.UndefOr[SnsTopic] = js.native
  
  /**
    * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.
    */
  var Error: js.UndefOr[SnsTopic] = js.native
  
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process the job.
    */
  var Progressing: js.UndefOr[SnsTopic] = js.native
  
  /**
    * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.
    */
  var Warning: js.UndefOr[SnsTopic] = js.native
}
object Notifications {
  
  @scala.inline
  def apply(): Notifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notifications]
  }
  
  @scala.inline
  implicit class NotificationsMutableBuilder[Self <: Notifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: SnsTopic): Self = StObject.set(x, "Completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUndefined: Self = StObject.set(x, "Completed", js.undefined)
    
    @scala.inline
    def setError(value: SnsTopic): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setProgressing(value: SnsTopic): Self = StObject.set(x, "Progressing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressingUndefined: Self = StObject.set(x, "Progressing", js.undefined)
    
    @scala.inline
    def setWarning(value: SnsTopic): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
  }
}
