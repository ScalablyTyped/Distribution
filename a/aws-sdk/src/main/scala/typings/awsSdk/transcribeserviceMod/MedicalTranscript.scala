package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MedicalTranscript extends js.Object {
  
  /**
    * The S3 object location of the medical transcript. Use this URI to access the medical transcript. This URI points to the S3 bucket you created to store the medical transcript.
    */
  var TranscriptFileUri: js.UndefOr[Uri] = js.native
}
object MedicalTranscript {
  
  @scala.inline
  def apply(): MedicalTranscript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicalTranscript]
  }
  
  @scala.inline
  implicit class MedicalTranscriptOps[Self <: MedicalTranscript] (val x: Self) extends AnyVal {
    
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
    def setTranscriptFileUri(value: Uri): Self = this.set("TranscriptFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscriptFileUri: Self = this.set("TranscriptFileUri", js.undefined)
  }
}
