package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTranscriptionJobResponse extends js.Object {
  
  /**
    * An object containing details of the asynchronous transcription job.
    */
  var TranscriptionJob: js.UndefOr[typings.awsSdk.transcribeserviceMod.TranscriptionJob] = js.native
}
object StartTranscriptionJobResponse {
  
  @scala.inline
  def apply(): StartTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTranscriptionJobResponse]
  }
  
  @scala.inline
  implicit class StartTranscriptionJobResponseOps[Self <: StartTranscriptionJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTranscriptionJob(value: TranscriptionJob): Self = this.set("TranscriptionJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscriptionJob: Self = this.set("TranscriptionJob", js.undefined)
  }
}
