package typings.cassandraDashDriver.cassandraDashDriverMod.mapping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingExecutionOptions extends js.Object {
  var executionProfile: js.UndefOr[String] = js.undefined
  var fetchSize: js.UndefOr[Double] = js.undefined
  var isIdempotent: js.UndefOr[Boolean] = js.undefined
  var logged: js.UndefOr[Boolean] = js.undefined
  var pageState: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[
    Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any)
  ] = js.undefined
}

object MappingExecutionOptions {
  @scala.inline
  def apply(
    executionProfile: String = null,
    fetchSize: Int | Double = null,
    isIdempotent: js.UndefOr[Boolean] = js.undefined,
    logged: js.UndefOr[Boolean] = js.undefined,
    pageState: Int | Double = null,
    timestamp: Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any) = null
  ): MappingExecutionOptions = {
    val __obj = js.Dynamic.literal()
    if (executionProfile != null) __obj.updateDynamic("executionProfile")(executionProfile)
    if (fetchSize != null) __obj.updateDynamic("fetchSize")(fetchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(isIdempotent)) __obj.updateDynamic("isIdempotent")(isIdempotent)
    if (!js.isUndefined(logged)) __obj.updateDynamic("logged")(logged)
    if (pageState != null) __obj.updateDynamic("pageState")(pageState.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingExecutionOptions]
  }
}

