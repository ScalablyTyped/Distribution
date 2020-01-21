package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSpeechSynthesisTasksOutput extends js.Object {
  /**
    * An opaque pagination token returned from the previous List operation in this request. If present, this indicates where to continue the listing.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pollyMod.NextToken] = js.native
  /**
    * List of SynthesisTask objects that provides information from the specified task in the list request, including output format, creation time, task status, and so on.
    */
  var SynthesisTasks: js.UndefOr[typings.awsSdk.pollyMod.SynthesisTasks] = js.native
}

object ListSpeechSynthesisTasksOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, SynthesisTasks: SynthesisTasks = null): ListSpeechSynthesisTasksOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SynthesisTasks != null) __obj.updateDynamic("SynthesisTasks")(SynthesisTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSpeechSynthesisTasksOutput]
  }
}

