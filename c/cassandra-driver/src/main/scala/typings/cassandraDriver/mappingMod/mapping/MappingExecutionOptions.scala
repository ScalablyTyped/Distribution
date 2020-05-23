package typings.cassandraDriver.mappingMod.mapping

import typings.cassandraDriver.typesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingExecutionOptions extends js.Object {
  var executionProfile: js.UndefOr[String] = js.undefined
  var fetchSize: js.UndefOr[Double] = js.undefined
  var isIdempotent: js.UndefOr[Boolean] = js.undefined
  var logged: js.UndefOr[Boolean] = js.undefined
  var pageState: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[Double | Long] = js.undefined
}

object MappingExecutionOptions {
  @scala.inline
  def apply(
    executionProfile: String = null,
    fetchSize: js.UndefOr[Double] = js.undefined,
    isIdempotent: js.UndefOr[Boolean] = js.undefined,
    logged: js.UndefOr[Boolean] = js.undefined,
    pageState: js.UndefOr[Double] = js.undefined,
    timestamp: Double | Long = null
  ): MappingExecutionOptions = {
    val __obj = js.Dynamic.literal()
    if (executionProfile != null) __obj.updateDynamic("executionProfile")(executionProfile.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchSize)) __obj.updateDynamic("fetchSize")(fetchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isIdempotent)) __obj.updateDynamic("isIdempotent")(isIdempotent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logged)) __obj.updateDynamic("logged")(logged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageState)) __obj.updateDynamic("pageState")(pageState.get.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingExecutionOptions]
  }
}

