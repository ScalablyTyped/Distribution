package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timing extends js.Object {
  
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
  implicit class TimingOps[Self <: Timing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFinishTimeMillis(value: NullableLong): Self = this.set("FinishTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinishTimeMillis: Self = this.set("FinishTimeMillis", js.undefined)
    
    @scala.inline
    def setStartTimeMillis(value: NullableLong): Self = this.set("StartTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeMillis: Self = this.set("StartTimeMillis", js.undefined)
    
    @scala.inline
    def setSubmitTimeMillis(value: NullableLong): Self = this.set("SubmitTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitTimeMillis: Self = this.set("SubmitTimeMillis", js.undefined)
  }
}
