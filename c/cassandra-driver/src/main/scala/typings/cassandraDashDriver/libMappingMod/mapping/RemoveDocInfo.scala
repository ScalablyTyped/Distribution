package typings.cassandraDashDriver.libMappingMod.mapping

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveDocInfo extends js.Object {
  var deleteOnlyColumns: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var ifExists: js.UndefOr[Boolean] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
  var when: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object RemoveDocInfo {
  @scala.inline
  def apply(
    deleteOnlyColumns: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[String] = null,
    ifExists: js.UndefOr[Boolean] = js.undefined,
    ttl: Int | Double = null,
    when: StringDictionary[js.Any] = null
  ): RemoveDocInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteOnlyColumns)) __obj.updateDynamic("deleteOnlyColumns")(deleteOnlyColumns.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveDocInfo]
  }
}

