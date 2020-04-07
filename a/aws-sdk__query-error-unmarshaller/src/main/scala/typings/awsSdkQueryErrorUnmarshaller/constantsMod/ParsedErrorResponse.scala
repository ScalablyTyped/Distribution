package typings.awsSdkQueryErrorUnmarshaller.constantsMod

import typings.awsSdkQueryErrorUnmarshaller.AnonCode
import typings.awsSdkQueryErrorUnmarshaller.AnonRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedErrorResponse extends js.Object {
  @JSName("$metadata")
  var $metadata: AnonRequestId
  var Error: js.UndefOr[AnonCode] = js.undefined
}

object ParsedErrorResponse {
  @scala.inline
  def apply($metadata: AnonRequestId, Error: AnonCode = null): ParsedErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedErrorResponse]
  }
}

