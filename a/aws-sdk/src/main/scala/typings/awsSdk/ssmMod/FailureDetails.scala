package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureDetails extends js.Object {
  /**
    * Detailed information about the Automation step failure.
    */
  var Details: js.UndefOr[AutomationParameterMap] = js.native
  /**
    * The stage of the Automation execution when the failure occurred. The stages include the following: InputValidation, PreVerification, Invocation, PostVerification.
    */
  var FailureStage: js.UndefOr[String] = js.native
  /**
    * The type of Automation failure. Failure types include the following: Action, Permission, Throttling, Verification, Internal.
    */
  var FailureType: js.UndefOr[String] = js.native
}

object FailureDetails {
  @scala.inline
  def apply(Details: AutomationParameterMap = null, FailureStage: String = null, FailureType: String = null): FailureDetails = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (FailureStage != null) __obj.updateDynamic("FailureStage")(FailureStage.asInstanceOf[js.Any])
    if (FailureType != null) __obj.updateDynamic("FailureType")(FailureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureDetails]
  }
}

