package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogErroredRequests extends js.Object {
  var logErroredRequests: js.UndefOr[Boolean] = js.undefined
  var logNormalRequests: js.UndefOr[Boolean] = js.undefined
  var messageMaxErrorStackTraceLength: js.UndefOr[Double] = js.undefined
  var messageMaxParameterValueLength: js.UndefOr[Double] = js.undefined
  var messageMaxQueryLength: js.UndefOr[Double] = js.undefined
  var slowThreshold: js.UndefOr[Double] = js.undefined
}

object LogErroredRequests {
  @scala.inline
  def apply(
    logErroredRequests: js.UndefOr[Boolean] = js.undefined,
    logNormalRequests: js.UndefOr[Boolean] = js.undefined,
    messageMaxErrorStackTraceLength: js.UndefOr[Double] = js.undefined,
    messageMaxParameterValueLength: js.UndefOr[Double] = js.undefined,
    messageMaxQueryLength: js.UndefOr[Double] = js.undefined,
    slowThreshold: js.UndefOr[Double] = js.undefined
  ): LogErroredRequests = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(logErroredRequests)) __obj.updateDynamic("logErroredRequests")(logErroredRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logNormalRequests)) __obj.updateDynamic("logNormalRequests")(logNormalRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageMaxErrorStackTraceLength)) __obj.updateDynamic("messageMaxErrorStackTraceLength")(messageMaxErrorStackTraceLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageMaxParameterValueLength)) __obj.updateDynamic("messageMaxParameterValueLength")(messageMaxParameterValueLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageMaxQueryLength)) __obj.updateDynamic("messageMaxQueryLength")(messageMaxQueryLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slowThreshold)) __obj.updateDynamic("slowThreshold")(slowThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogErroredRequests]
  }
}

