package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResultQualifier extends js.Object {
  /**
    * The name of the AWS Config rule that was used in the evaluation.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleName] = js.native
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
  def apply(): EvaluationResultQualifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResultQualifier]
  }
  @scala.inline
  implicit class EvaluationResultQualifierOps[Self <: EvaluationResultQualifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = this.set("ConfigRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigRuleName: Self = this.set("ConfigRuleName", js.undefined)
    @scala.inline
    def setResourceId(value: BaseResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

