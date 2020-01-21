package typings.awsSdkClientLambdaNode.typesTracingConfigMod

import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.Active
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracingConfig extends js.Object {
  /**
    * <p>The tracing mode.</p>
    */
  var Mode: js.UndefOr[Active | PassThrough | String] = js.undefined
}

object TracingConfig {
  @scala.inline
  def apply(Mode: Active | PassThrough | String = null): TracingConfig = {
    val __obj = js.Dynamic.literal()
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingConfig]
  }
}

