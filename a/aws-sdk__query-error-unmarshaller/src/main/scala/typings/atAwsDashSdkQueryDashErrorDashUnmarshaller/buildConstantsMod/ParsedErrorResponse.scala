package typings.atAwsDashSdkQueryDashErrorDashUnmarshaller.buildConstantsMod

import typings.atAwsDashSdkQueryDashErrorDashUnmarshaller.Anon_Code
import typings.atAwsDashSdkQueryDashErrorDashUnmarshaller.Anon_RequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedErrorResponse extends js.Object {
  @JSName("$metadata")
  var $metadata: Anon_RequestId
  var Error: js.UndefOr[Anon_Code] = js.undefined
}

object ParsedErrorResponse {
  @scala.inline
  def apply($metadata: Anon_RequestId, Error: Anon_Code = null): ParsedErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedErrorResponse]
  }
}

