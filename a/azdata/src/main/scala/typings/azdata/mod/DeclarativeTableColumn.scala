package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarativeTableColumn extends js.Object {
  var categoryValues: js.UndefOr[js.Array[CategoryValue]] = js.undefined
  var displayName: String
  var isReadOnly: Boolean
  var valueType: DeclarativeDataType
  var width: Double | String
}

object DeclarativeTableColumn {
  @scala.inline
  def apply(
    displayName: String,
    isReadOnly: Boolean,
    valueType: DeclarativeDataType,
    width: Double | String,
    categoryValues: js.Array[CategoryValue] = null
  ): DeclarativeTableColumn = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (categoryValues != null) __obj.updateDynamic("categoryValues")(categoryValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeTableColumn]
  }
}

