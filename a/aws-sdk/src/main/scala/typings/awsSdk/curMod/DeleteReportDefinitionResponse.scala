package typings.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReportDefinitionResponse extends js.Object {
  var ResponseMessage: js.UndefOr[DeleteResponseMessage] = js.native
}

object DeleteReportDefinitionResponse {
  @scala.inline
  def apply(ResponseMessage: DeleteResponseMessage = null): DeleteReportDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (ResponseMessage != null) __obj.updateDynamic("ResponseMessage")(ResponseMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReportDefinitionResponse]
  }
}

