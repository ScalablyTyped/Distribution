package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedDeleteRemediationExceptionsBatch extends js.Object {
  /**
    * Returns remediation exception resource key object of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationExceptionResourceKeys] = js.native
  /**
    * Returns a failure message for delete remediation exception. For example, AWS Config creates an exception due to an internal error.
    */
  var FailureMessage: js.UndefOr[String] = js.native
}

object FailedDeleteRemediationExceptionsBatch {
  @scala.inline
  def apply(FailedItems: RemediationExceptionResourceKeys = null, FailureMessage: String = null): FailedDeleteRemediationExceptionsBatch = {
    val __obj = js.Dynamic.literal()
    if (FailedItems != null) __obj.updateDynamic("FailedItems")(FailedItems.asInstanceOf[js.Any])
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedDeleteRemediationExceptionsBatch]
  }
}

