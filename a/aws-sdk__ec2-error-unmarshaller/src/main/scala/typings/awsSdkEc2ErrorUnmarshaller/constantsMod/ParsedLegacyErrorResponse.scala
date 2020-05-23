package typings.awsSdkEc2ErrorUnmarshaller.constantsMod

import typings.awsSdkEc2ErrorUnmarshaller.anon.Error
import typings.awsSdkEc2ErrorUnmarshaller.anon.RequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedLegacyErrorResponse extends js.Object {
  @JSName("$metadata")
  var $metadata: RequestId
  var Errors: js.UndefOr[Error] = js.undefined
}

object ParsedLegacyErrorResponse {
  @scala.inline
  def apply($metadata: RequestId, Errors: Error = null): ParsedLegacyErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedLegacyErrorResponse]
  }
}

