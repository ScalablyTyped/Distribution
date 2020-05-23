package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassificationResultStatus extends js.Object {
  /**
    * The status of the finding, such as COMPLETE.
    */
  var code: js.UndefOr[string] = js.native
  /**
    * A brief description of the status of the finding. Amazon Macie uses this value to notify you of any errors, warnings, or considerations that might impact your analysis of the finding.
    */
  var reason: js.UndefOr[string] = js.native
}

object ClassificationResultStatus {
  @scala.inline
  def apply(code: string = null, reason: string = null): ClassificationResultStatus = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationResultStatus]
  }
}

