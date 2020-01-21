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
  def apply(SynthesisTask: SynthesisTask = null): StartSpeechSynthesisTaskOutput = {
    val __obj = js.Dynamic.literal()
    if (SynthesisTask != null) __obj.updateDynamic("SynthesisTask")(SynthesisTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSpeechSynthesisTaskOutput]
  }
}

