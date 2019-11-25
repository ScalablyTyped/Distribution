package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LogErroredRequests extends js.Object {
  var logErroredRequests: js.UndefOr[Boolean] = js.undefined
  var logNormalRequests: js.UndefOr[Boolean] = js.undefined
  var messageMaxErrorStackTraceLength: js.UndefOr[Double] = js.undefined
  var messageMaxParameterValueLength: js.UndefOr[Double] = js.undefined
  var messageMaxQueryLength: js.UndefOr[Double] = js.undefined
  var slowThreshold: js.UndefOr[Double] = js.undefined
}

object Anon_LogErroredRequests {
  @scala.inline
  def apply(
    logErroredRequests: js.UndefOr[Boolean] = js.undefined,
    logNormalRequests: js.UndefOr[Boolean] = js.undefined,
    messageMaxErrorStackTraceLength: Int | Double = null,
    messageMaxParameterValueLength: Int | Double = null,
    messageMaxQueryLength: Int | Double = null,
    slowThreshold: Int | Double = null
  ): Anon_LogErroredRequests = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(logErroredRequests)) __obj.updateDynamic("logErroredRequests")(logErroredRequests.asInstanceOf[js.Any])
    if (!js.isUndefined(logNormalRequests)) __obj.updateDynamic("logNormalRequests")(logNormalRequests.asInstanceOf[js.Any])
    if (messageMaxErrorStackTraceLength != null) __obj.updateDynamic("messageMaxErrorStackTraceLength")(messageMaxErrorStackTraceLength.asInstanceOf[js.Any])
    if (messageMaxParameterValueLength != null) __obj.updateDynamic("messageMaxParameterValueLength")(messageMaxParameterValueLength.asInstanceOf[js.Any])
    if (messageMaxQueryLength != null) __obj.updateDynamic("messageMaxQueryLength")(messageMaxQueryLength.asInstanceOf[js.Any])
    if (slowThreshold != null) __obj.updateDynamic("slowThreshold")(slowThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LogErroredRequests]
  }
}

