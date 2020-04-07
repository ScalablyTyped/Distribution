package typings.awsSdkEc2ErrorUnmarshaller.constantsMod

import typings.awsSdkEc2ErrorUnmarshaller.AnonError
import typings.awsSdkEc2ErrorUnmarshaller.AnonRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedLegacyErrorResponse extends js.Object {
  @JSName("$metadata")
  var $metadata: AnonRequestId
  var Errors: js.UndefOr[AnonError] = js.undefined
}

object ParsedLegacyErrorResponse {
  @scala.inline
  def apply($metadata: AnonRequestId, Errors: AnonError = null): ParsedLegacyErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedLegacyErrorResponse]
  }
}

