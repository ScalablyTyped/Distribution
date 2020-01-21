package typings.cassandraDriver.concurrentMod.concurrent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var collectResults: js.UndefOr[Boolean] = js.undefined
  var concurrencyLevel: js.UndefOr[Double] = js.undefined
  var executionProfile: js.UndefOr[String] = js.undefined
  var maxErrors: js.UndefOr[Double] = js.undefined
  var raiseOnFirstError: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    collectResults: js.UndefOr[Boolean] = js.undefined,
    concurrencyLevel: Int | Double = null,
    executionProfile: String = null,
    maxErrors: Int | Double = null,
    raiseOnFirstError: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collectResults)) __obj.updateDynamic("collectResults")(collectResults.asInstanceOf[js.Any])
    if (concurrencyLevel != null) __obj.updateDynamic("concurrencyLevel")(concurrencyLevel.asInstanceOf[js.Any])
    if (executionProfile != null) __obj.updateDynamic("executionProfile")(executionProfile.asInstanceOf[js.Any])
    if (maxErrors != null) __obj.updateDynamic("maxErrors")(maxErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(raiseOnFirstError)) __obj.updateDynamic("raiseOnFirstError")(raiseOnFirstError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

