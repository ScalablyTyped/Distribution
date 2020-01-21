package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionTracingConfig extends js.Object {
  /**
    * The tracing mode.
    */
  var Mode: js.UndefOr[NonEmptyString] = js.native
}

object AwsLambdaFunctionTracingConfig {
  @scala.inline
  def apply(Mode: NonEmptyString = null): AwsLambdaFunctionTracingConfig = {
    val __obj = js.Dynamic.literal()
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsLambdaFunctionTracingConfig]
  }
}

