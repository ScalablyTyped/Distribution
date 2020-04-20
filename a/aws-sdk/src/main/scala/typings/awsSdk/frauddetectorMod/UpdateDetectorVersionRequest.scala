package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorVersionRequest extends js.Object {
  /**
    * The detector version description. 
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The parent detector ID for the detector version you want to update.
    */
  var detectorId: identifier = js.native
  /**
    * The detector version ID. 
    */
  var detectorVersionId: nonEmptyString = js.native
  /**
    * The Amazon SageMaker model endpoints to include in the detector version.
    */
  var externalModelEndpoints: ListOfStrings = js.native
  /**
    * The model versions to include in the detector version.
    */
  var modelVersions: js.UndefOr[ListOfModelVersions] = js.native
  /**
    * The rule execution mode to add to the detector. If you specify FIRST_MATCHED, Amazon Fraud Detector evaluates rules sequentially, first to last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule. If you specifiy ALL_MATCHED, Amazon Fraud Detector evaluates all rules and returns the outcomes for all matched rules. You can define and edit the rule mode at the detector version level, when it is in draft status. The default behavior is FIRST_MATCHED.
    */
  var ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.native
  /**
    * The rules to include in the detector version.
    */
  var rules: RuleList = js.native
}

object UpdateDetectorVersionRequest {
  @scala.inline
  def apply(
    detectorId: identifier,
    detectorVersionId: nonEmptyString,
    externalModelEndpoints: ListOfStrings,
    rules: RuleList,
    description: description = null,
    modelVersions: ListOfModelVersions = null,
    ruleExecutionMode: RuleExecutionMode = null
  ): UpdateDetectorVersionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], detectorVersionId = detectorVersionId.asInstanceOf[js.Any], externalModelEndpoints = externalModelEndpoints.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (modelVersions != null) __obj.updateDynamic("modelVersions")(modelVersions.asInstanceOf[js.Any])
    if (ruleExecutionMode != null) __obj.updateDynamic("ruleExecutionMode")(ruleExecutionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorVersionRequest]
  }
}

