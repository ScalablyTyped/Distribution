package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryCodeOutput extends js.Object {
  /**
    * The entry point to use for the source code when running the canary.
    */
  var Handler: js.UndefOr[String] = js.native
  /**
    * The ARN of the Lambda layer where Synthetics stores the canary script code.
    */
  var SourceLocationArn: js.UndefOr[String] = js.native
}

object CanaryCodeOutput {
  @scala.inline
  def apply(Handler: String = null, SourceLocationArn: String = null): CanaryCodeOutput = {
    val __obj = js.Dynamic.literal()
    if (Handler != null) __obj.updateDynamic("Handler")(Handler.asInstanceOf[js.Any])
    if (SourceLocationArn != null) __obj.updateDynamic("SourceLocationArn")(SourceLocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryCodeOutput]
  }
}

