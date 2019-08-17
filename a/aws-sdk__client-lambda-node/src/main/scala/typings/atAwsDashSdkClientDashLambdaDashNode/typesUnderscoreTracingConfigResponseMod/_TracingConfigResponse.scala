package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreTracingConfigResponseMod

import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.Active
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TracingConfigResponse extends js.Object {
  /**
    * <p>The tracing mode.</p>
    */
  var Mode: js.UndefOr[Active | PassThrough | String] = js.undefined
}

object _TracingConfigResponse {
  @scala.inline
  def apply(Mode: Active | PassThrough | String = null): _TracingConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TracingConfigResponse]
  }
}

