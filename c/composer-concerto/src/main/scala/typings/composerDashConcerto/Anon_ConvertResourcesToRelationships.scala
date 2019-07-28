package typings.composerDashConcerto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConvertResourcesToRelationships extends js.Object {
  var convertResourcesToRelationships: js.UndefOr[Boolean] = js.undefined
  var deduplicateResources: js.UndefOr[Boolean] = js.undefined
  var permitResourcesForRelationships: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[Boolean] = js.undefined
}

object Anon_ConvertResourcesToRelationships {
  @scala.inline
  def apply(
    convertResourcesToRelationships: js.UndefOr[Boolean] = js.undefined,
    deduplicateResources: js.UndefOr[Boolean] = js.undefined,
    permitResourcesForRelationships: js.UndefOr[Boolean] = js.undefined,
    validate: js.UndefOr[Boolean] = js.undefined
  ): Anon_ConvertResourcesToRelationships = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convertResourcesToRelationships)) __obj.updateDynamic("convertResourcesToRelationships")(convertResourcesToRelationships)
    if (!js.isUndefined(deduplicateResources)) __obj.updateDynamic("deduplicateResources")(deduplicateResources)
    if (!js.isUndefined(permitResourcesForRelationships)) __obj.updateDynamic("permitResourcesForRelationships")(permitResourcesForRelationships)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Anon_ConvertResourcesToRelationships]
  }
}

