package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSpeechSynthesisTaskOutput extends js.Object {
  /**
    * SynthesisTask object that provides information and attributes about a newly submitted speech synthesis task.
    */
  var SynthesisTask: js.UndefOr[typings.awsSdk.pollyMod.SynthesisTask] = js.native
}

object StartSpeechSynthesisTaskOutput {
  @scala.inline
  def apply(): StartSpeechSynthesisTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSpeechSynthesisTaskOutput]
  }
  @scala.inline
  implicit class StartSpeechSynthesisTaskOutputOps[Self <: StartSpeechSynthesisTaskOutput] (val x: Self) extends AnyVal {
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
    def setSynthesisTask(value: SynthesisTask): Self = this.set("SynthesisTask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynthesisTask: Self = this.set("SynthesisTask", js.undefined)
  }
  
}

