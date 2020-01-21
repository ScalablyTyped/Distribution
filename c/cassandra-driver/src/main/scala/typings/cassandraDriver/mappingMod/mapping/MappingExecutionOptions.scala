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
    fetchSize: Int | Double = null,
    isIdempotent: js.UndefOr[Boolean] = js.undefined,
    logged: js.UndefOr[Boolean] = js.undefined,
    pageState: Int | Double = null,
    timestamp: Double | Long = null
  ): MappingExecutionOptions = {
    val __obj = js.Dynamic.literal()
    if (executionProfile != null) __obj.updateDynamic("executionProfile")(executionProfile.asInstanceOf[js.Any])
    if (fetchSize != null) __obj.updateDynamic("fetchSize")(fetchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(isIdempotent)) __obj.updateDynamic("isIdempotent")(isIdempotent.asInstanceOf[js.Any])
    if (!js.isUndefined(logged)) __obj.updateDynamic("logged")(logged.asInstanceOf[js.Any])
    if (pageState != null) __obj.updateDynamic("pageState")(pageState.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingExecutionOptions]
  }
}

