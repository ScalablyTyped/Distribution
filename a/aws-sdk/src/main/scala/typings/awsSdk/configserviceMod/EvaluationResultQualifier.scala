package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResultQualifier extends js.Object {
  /**
    * The name of the AWS Config rule that was used in the evaluation.
    */
  var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.native
  /**
    * The ID of the evaluated AWS resource.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.native
  /**
    * The type of AWS resource that was evaluated.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object EvaluationResultQualifier {
  @scala.inline
  def apply(
    ConfigRuleName: StringWithCharLimit64 = null,
    ResourceId: BaseResourceId = null,
    ResourceType: StringWithCharLimit256 = null
  ): EvaluationResultQualifier = {
    val __obj = js.Dynamic.literal()
    if (ConfigRuleName != null) __obj.updateDynamic("ConfigRuleName")(ConfigRuleName.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationResultQualifier]
  }
}

