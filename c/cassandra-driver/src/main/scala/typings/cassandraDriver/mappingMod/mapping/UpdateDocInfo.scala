package typings.cassandraDriver.mappingMod.mapping

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDocInfo extends js.Object {
  var deleteOnlyColumns: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var ifExists: js.UndefOr[Boolean] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var orderBy: js.UndefOr[StringDictionary[String]] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
  var when: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object UpdateDocInfo {
  @scala.inline
  def apply(
    deleteOnlyColumns: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[String] = null,
    ifExists: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    orderBy: StringDictionary[String] = null,
    ttl: js.UndefOr[Double] = js.undefined,
    when: StringDictionary[js.Any] = null
  ): UpdateDocInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteOnlyColumns)) __obj.updateDynamic("deleteOnlyColumns")(deleteOnlyColumns.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocInfo]
  }
}

