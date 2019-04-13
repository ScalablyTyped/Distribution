package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var autoPage: js.UndefOr[scala.Boolean] = js.undefined
  var captureStackTrace: js.UndefOr[scala.Boolean] = js.undefined
  var consistency: js.UndefOr[scala.Double] = js.undefined
  var counter: js.UndefOr[scala.Boolean] = js.undefined
  var customPayload: js.UndefOr[js.Any] = js.undefined
  var executionProfile: js.UndefOr[java.lang.String | ExecutionProfile] = js.undefined
  var fetchSize: js.UndefOr[scala.Double] = js.undefined
  var hints: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]] = js.undefined
  var host: js.UndefOr[Host] = js.undefined
  var isIdempotent: js.UndefOr[scala.Boolean] = js.undefined
  var keyspace: js.UndefOr[java.lang.String] = js.undefined
  var logged: js.UndefOr[scala.Boolean] = js.undefined
  var pageState: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  var prepare: js.UndefOr[scala.Boolean] = js.undefined
  var readTimeout: js.UndefOr[scala.Double] = js.undefined
  var retry: js.UndefOr[cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy] = js.undefined
  var routingIndexes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var routingKey: js.UndefOr[nodeLib.Buffer | js.Array[nodeLib.Buffer]] = js.undefined
  var routingNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var serialConsistency: js.UndefOr[scala.Double] = js.undefined
  var timestamp: js.UndefOr[scala.Double | longLib.longMod.^ ] = js.undefined
  var traceQuery: js.UndefOr[scala.Boolean] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    autoPage: js.UndefOr[scala.Boolean] = js.undefined,
    captureStackTrace: js.UndefOr[scala.Boolean] = js.undefined,
    consistency: scala.Int | scala.Double = null,
    counter: js.UndefOr[scala.Boolean] = js.undefined,
    customPayload: js.Any = null,
    executionProfile: java.lang.String | ExecutionProfile = null,
    fetchSize: scala.Int | scala.Double = null,
    hints: js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]] = null,
    host: Host = null,
    isIdempotent: js.UndefOr[scala.Boolean] = js.undefined,
    keyspace: java.lang.String = null,
    logged: js.UndefOr[scala.Boolean] = js.undefined,
    pageState: nodeLib.Buffer | java.lang.String = null,
    prepare: js.UndefOr[scala.Boolean] = js.undefined,
    readTimeout: scala.Int | scala.Double = null,
    retry: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy = null,
    routingIndexes: js.Array[scala.Double] = null,
    routingKey: nodeLib.Buffer | js.Array[nodeLib.Buffer] = null,
    routingNames: js.Array[java.lang.String] = null,
    serialConsistency: scala.Int | scala.Double = null,
    timestamp: scala.Double | longLib.longMod.^  = null,
    traceQuery: js.UndefOr[scala.Boolean] = js.undefined
  ): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPage)) __obj.updateDynamic("autoPage")(autoPage)
    if (!js.isUndefined(captureStackTrace)) __obj.updateDynamic("captureStackTrace")(captureStackTrace)
    if (consistency != null) __obj.updateDynamic("consistency")(consistency.asInstanceOf[js.Any])
    if (!js.isUndefined(counter)) __obj.updateDynamic("counter")(counter)
    if (customPayload != null) __obj.updateDynamic("customPayload")(customPayload)
    if (executionProfile != null) __obj.updateDynamic("executionProfile")(executionProfile.asInstanceOf[js.Any])
    if (fetchSize != null) __obj.updateDynamic("fetchSize")(fetchSize.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(isIdempotent)) __obj.updateDynamic("isIdempotent")(isIdempotent)
    if (keyspace != null) __obj.updateDynamic("keyspace")(keyspace)
    if (!js.isUndefined(logged)) __obj.updateDynamic("logged")(logged)
    if (pageState != null) __obj.updateDynamic("pageState")(pageState.asInstanceOf[js.Any])
    if (!js.isUndefined(prepare)) __obj.updateDynamic("prepare")(prepare)
    if (readTimeout != null) __obj.updateDynamic("readTimeout")(readTimeout.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (routingIndexes != null) __obj.updateDynamic("routingIndexes")(routingIndexes)
    if (routingKey != null) __obj.updateDynamic("routingKey")(routingKey.asInstanceOf[js.Any])
    if (routingNames != null) __obj.updateDynamic("routingNames")(routingNames)
    if (serialConsistency != null) __obj.updateDynamic("serialConsistency")(serialConsistency.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(traceQuery)) __obj.updateDynamic("traceQuery")(traceQuery)
    __obj.asInstanceOf[QueryOptions]
  }
}

