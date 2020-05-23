package typings.awsSdkQueryErrorUnmarshaller.constantsMod

import typings.awsSdkQueryErrorUnmarshaller.anon.Code
import typings.awsSdkQueryErrorUnmarshaller.anon.RequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedErrorResponse extends js.Object {
  @JSName("$metadata")
  var $metadata: RequestId
  var Error: js.UndefOr[Code] = js.undefined
}

object ParsedErrorResponse {
  @scala.inline
  def apply($metadata: RequestId, Error: Code = null): ParsedErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedErrorResponse]
  }
}

