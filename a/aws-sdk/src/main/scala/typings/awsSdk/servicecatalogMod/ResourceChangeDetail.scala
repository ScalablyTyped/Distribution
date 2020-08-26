package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceChangeDetail extends js.Object {
  /**
    * The ID of the entity that caused the change.
    */
  var CausingEntity: js.UndefOr[typings.awsSdk.servicecatalogMod.CausingEntity] = js.native
  /**
    * For static evaluations, the value of the resource attribute will change and the new value is known. For dynamic evaluations, the value might change, and any new value will be determined when the plan is updated.
    */
  var Evaluation: js.UndefOr[EvaluationType] = js.native
  /**
    * Information about the resource attribute to be modified.
    */
  var Target: js.UndefOr[ResourceTargetDefinition] = js.native
}

object ResourceChangeDetail {
  @scala.inline
  def apply(): ResourceChangeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceChangeDetail]
  }
  @scala.inline
  implicit class ResourceChangeDetailOps[Self <: ResourceChangeDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCausingEntity(value: CausingEntity): Self = this.set("CausingEntity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCausingEntity: Self = this.set("CausingEntity", js.undefined)
    @scala.inline
    def setEvaluation(value: EvaluationType): Self = this.set("Evaluation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluation: Self = this.set("Evaluation", js.undefined)
    @scala.inline
    def setTarget(value: ResourceTargetDefinition): Self = this.set("Target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("Target", js.undefined)
  }
  
}

