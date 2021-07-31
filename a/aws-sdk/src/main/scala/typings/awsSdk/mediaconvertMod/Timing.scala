package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timing extends StObject {
  
  /**
    * The time, in Unix epoch format, that the transcoding job finished
    */
  var FinishTime: js.UndefOr[timestampUnix] = js.undefined
  
  /**
    * The time, in Unix epoch format, that transcoding for the job began.
    */
  var StartTime: js.UndefOr[timestampUnix] = js.undefined
  
  /**
    * The time, in Unix epoch format, that you submitted the job.
    */
  var SubmitTime: js.UndefOr[timestampUnix] = js.undefined
}
object Timing {
  
  @scala.inline
  def apply(): Timing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timing]
  }
  
  @scala.inline
  implicit class TimingMutableBuilder[Self <: Timing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinishTime(value: timestampUnix): Self = StObject.set(x, "FinishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTimeUndefined: Self = StObject.set(x, "FinishTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: timestampUnix): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setSubmitTime(value: timestampUnix): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
  }
}
