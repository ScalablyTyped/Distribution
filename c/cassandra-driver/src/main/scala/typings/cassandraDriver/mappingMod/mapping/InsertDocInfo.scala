package typings.cassandraDriver.mappingMod.mapping

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
    ttl: js.UndefOr[Double] = js.undefined
  ): InsertDocInfo = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertDocInfo]
  }
}

