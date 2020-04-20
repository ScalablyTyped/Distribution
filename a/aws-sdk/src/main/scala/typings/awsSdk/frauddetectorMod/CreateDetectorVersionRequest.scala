package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDetectorVersionRequest extends js.Object {
  /**
    * The description of the detector version.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The ID of the detector under which you want to create a new version.
    */
  var detectorId: identifier = js.native
  /**
    * The Amazon Sagemaker model endpoints to include in the detector version.
    */
  var externalModelEndpoints: js.UndefOr[ListOfStrings] = js.native
  /**
    * The model versions to include in the detector version.
    */
  var modelVersions: js.UndefOr[ListOfModelVersions] = js.native
  /**
    * The rule execution mode for the rules included in the detector version. You can define and edit the rule mode at the detector version level, when it is in draft status. If you specify FIRST_MATCHED, Amazon Fraud Detector evaluates rules sequentially, first to last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule. If you specifiy ALL_MATCHED, Amazon Fraud Detector evaluates all rules and returns the outcomes for all matched rules.  The default behavior is FIRST_MATCHED.
    */
  var ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.native
  /**
    * The rules to include in the detector version.
    */
  var rules: RuleList = js.native
}

object CreateDetectorVersionRequest {
  @scala.inline
  def apply(
    detectorId: identifier,
    rules: RuleList,
    description: description = null,
    externalModelEndpoints: ListOfStrings = null,
    modelVersions: ListOfModelVersions = null,
    ruleExecutionMode: RuleExecutionMode = null
  ): CreateDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (externalModelEndpoints != null) __obj.updateDynamic("externalModelEndpoints")(externalModelEndpoints.asInstanceOf[js.Any])
    if (modelVersions != null) __obj.updateDynamic("modelVersions")(modelVersions.asInstanceOf[js.Any])
    if (ruleExecutionMode != null) __obj.updateDynamic("ruleExecutionMode")(ruleExecutionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorVersionRequest]
  }
}

