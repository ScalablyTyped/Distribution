package typings.cassandraDriver.mappingMod.mapping

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindDocInfo extends js.Object {
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var orderBy: js.UndefOr[StringDictionary[String]] = js.undefined
}

object FindDocInfo {
  @scala.inline
  def apply(
    fields: js.Array[String] = null,
    limit: js.UndefOr[Double] = js.undefined,
    orderBy: StringDictionary[String] = null
  ): FindDocInfo = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindDocInfo]
  }
}

