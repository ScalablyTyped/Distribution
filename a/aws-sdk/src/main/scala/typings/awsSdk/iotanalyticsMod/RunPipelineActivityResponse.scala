package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunPipelineActivityResponse extends js.Object {
  /**
    * In case the pipeline activity fails, the log message that is generated.
    */
  var logResult: js.UndefOr[LogResult] = js.native
  /**
    * The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the pipeline activity on each input sample message payload, encoded in base64.)
    */
  var payloads: js.UndefOr[MessagePayloads] = js.native
}

object RunPipelineActivityResponse {
  @scala.inline
  def apply(logResult: LogResult = null, payloads: MessagePayloads = null): RunPipelineActivityResponse = {
    val __obj = js.Dynamic.literal()
    if (logResult != null) __obj.updateDynamic("logResult")(logResult.asInstanceOf[js.Any])
    if (payloads != null) __obj.updateDynamic("payloads")(payloads.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunPipelineActivityResponse]
  }
}

