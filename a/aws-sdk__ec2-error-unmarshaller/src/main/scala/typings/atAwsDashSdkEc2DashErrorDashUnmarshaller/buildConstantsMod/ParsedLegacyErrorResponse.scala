package typings.atAwsDashSdkEc2DashErrorDashUnmarshaller.buildConstantsMod

import typings.atAwsDashSdkEc2DashErrorDashUnmarshaller.Anon_Error
import typings.atAwsDashSdkEc2DashErrorDashUnmarshaller.Anon_RequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedLegacyErrorResponse extends js.Object {
  @JSName("$metadata")
  var $metadata: Anon_RequestId
  var Errors: js.UndefOr[Anon_Error] = js.undefined
}

object ParsedLegacyErrorResponse {
  @scala.inline
  def apply($metadata: Anon_RequestId, Errors: Anon_Error = null): ParsedLegacyErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedLegacyErrorResponse]
  }
}

