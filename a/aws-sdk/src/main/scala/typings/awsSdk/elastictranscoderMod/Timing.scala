package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timing extends StObject {
  
  /**
    * The time the job finished transcoding, in epoch milliseconds.
    */
  var FinishTimeMillis: js.UndefOr[NullableLong] = js.native
  
  /**
    * The time the job began transcoding, in epoch milliseconds.
    */
  var StartTimeMillis: js.UndefOr[NullableLong] = js.native
  
  /**
    * The time the job was submitted to Elastic Transcoder, in epoch milliseconds.
    */
  var SubmitTimeMillis: js.UndefOr[NullableLong] = js.native
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
    def setFinishTimeMillis(value: NullableLong): Self = StObject.set(x, "FinishTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTimeMillisUndefined: Self = StObject.set(x, "FinishTimeMillis", js.undefined)
    
    @scala.inline
    def setStartTimeMillis(value: NullableLong): Self = StObject.set(x, "StartTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeMillisUndefined: Self = StObject.set(x, "StartTimeMillis", js.undefined)
    
    @scala.inline
    def setSubmitTimeMillis(value: NullableLong): Self = StObject.set(x, "SubmitTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeMillisUndefined: Self = StObject.set(x, "SubmitTimeMillis", js.undefined)
  }
}
