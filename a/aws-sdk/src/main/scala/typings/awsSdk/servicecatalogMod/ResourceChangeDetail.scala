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
  def apply(
    CausingEntity: CausingEntity = null,
    Evaluation: EvaluationType = null,
    Target: ResourceTargetDefinition = null
  ): ResourceChangeDetail = {
    val __obj = js.Dynamic.literal()
    if (CausingEntity != null) __obj.updateDynamic("CausingEntity")(CausingEntity.asInstanceOf[js.Any])
    if (Evaluation != null) __obj.updateDynamic("Evaluation")(Evaluation.asInstanceOf[js.Any])
    if (Target != null) __obj.updateDynamic("Target")(Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceChangeDetail]
  }
}

