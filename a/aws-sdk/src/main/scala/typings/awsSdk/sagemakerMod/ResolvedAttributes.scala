package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedAttributes extends js.Object {
  var AutoMLJobObjective: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobObjective] = js.native
  var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.native
  /**
    * The problem type.
    */
  var ProblemType: js.UndefOr[typings.awsSdk.sagemakerMod.ProblemType] = js.native
}

object ResolvedAttributes {
  @scala.inline
  def apply(
    AutoMLJobObjective: AutoMLJobObjective = null,
    CompletionCriteria: AutoMLJobCompletionCriteria = null,
    ProblemType: ProblemType = null
  ): ResolvedAttributes = {
    val __obj = js.Dynamic.literal()
    if (AutoMLJobObjective != null) __obj.updateDynamic("AutoMLJobObjective")(AutoMLJobObjective.asInstanceOf[js.Any])
    if (CompletionCriteria != null) __obj.updateDynamic("CompletionCriteria")(CompletionCriteria.asInstanceOf[js.Any])
    if (ProblemType != null) __obj.updateDynamic("ProblemType")(ProblemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedAttributes]
  }
}

