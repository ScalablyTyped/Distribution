package typings.cassandraDashDriver.libMappingMod.mapping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertDocInfo extends js.Object {
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var ifNotExists: js.UndefOr[Boolean] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object InsertDocInfo {
  @scala.inline
  def apply(
    fields: js.Array[String] = null,
    ifNotExists: js.UndefOr[Boolean] = js.undefined,
    ttl: Int | Double = null
  ): InsertDocInfo = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertDocInfo]
  }
}

