package typings.cassandraDriver.mod

import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.typesMod.types.Long
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var autoPage: js.UndefOr[Boolean] = js.undefined
  var captureStackTrace: js.UndefOr[Boolean] = js.undefined
  var consistency: js.UndefOr[Double] = js.undefined
  var counter: js.UndefOr[Boolean] = js.undefined
  var customPayload: js.UndefOr[js.Any] = js.undefined
  var executionProfile: js.UndefOr[String | ExecutionProfile] = js.undefined
  var fetchSize: js.UndefOr[Double] = js.undefined
  var hints: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  var host: js.UndefOr[Host] = js.undefined
  var isIdempotent: js.UndefOr[Boolean] = js.undefined
  var keyspace: js.UndefOr[String] = js.undefined
  var logged: js.UndefOr[Boolean] = js.undefined
  var pageState: js.UndefOr[Buffer | String] = js.undefined
  var prepare: js.UndefOr[Boolean] = js.undefined
  var readTimeout: js.UndefOr[Double] = js.undefined
  var retry: js.UndefOr[RetryPolicy] = js.undefined
  var routingIndexes: js.UndefOr[js.Array[Double]] = js.undefined
  var routingKey: js.UndefOr[Buffer | js.Array[Buffer]] = js.undefined
  var routingNames: js.UndefOr[js.Array[String]] = js.undefined
  var serialConsistency: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[Double | Long] = js.undefined
  var traceQuery: js.UndefOr[Boolean] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    autoPage: js.UndefOr[Boolean] = js.undefined,
    captureStackTrace: js.UndefOr[Boolean] = js.undefined,
    consistency: Int | Double = null,
    counter: js.UndefOr[Boolean] = js.undefined,
    customPayload: js.Any = null,
    executionProfile: String | ExecutionProfile = null,
    fetchSize: Int | Double = null,
    hints: js.Array[js.Array[String] | String] = null,
    host: Host = null,
    isIdempotent: js.UndefOr[Boolean] = js.undefined,
    keyspace: String = null,
    logged: js.UndefOr[Boolean] = js.undefined,
    pageState: Buffer | String = null,
    prepare: js.UndefOr[Boolean] = js.undefined,
    readTimeout: Int | Double = null,
    retry: RetryPolicy = null,
    routingIndexes: js.Array[Double] = null,
    routingKey: Buffer | js.Array[Buffer] = null,
    routingNames: js.Array[String] = null,
    serialConsistency: Int | Double = null,
    timestamp: Double | Long = null,
    traceQuery: js.UndefOr[Boolean] = js.undefined
  ): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPage)) __obj.updateDynamic("autoPage")(autoPage.asInstanceOf[js.Any])
    if (!js.isUndefined(captureStackTrace)) __obj.updateDynamic("captureStackTrace")(captureStackTrace.asInstanceOf[js.Any])
    if (consistency != null) __obj.updateDynamic("consistency")(consistency.asInstanceOf[js.Any])
    if (!js.isUndefined(counter)) __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    if (customPayload != null) __obj.updateDynamic("customPayload")(customPayload.asInstanceOf[js.Any])
    if (executionProfile != null) __obj.updateDynamic("executionProfile")(executionProfile.asInstanceOf[js.Any])
    if (fetchSize != null) __obj.updateDynamic("fetchSize")(fetchSize.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(isIdempotent)) __obj.updateDynamic("isIdempotent")(isIdempotent.asInstanceOf[js.Any])
    if (keyspace != null) __obj.updateDynamic("keyspace")(keyspace.asInstanceOf[js.Any])
    if (!js.isUndefined(logged)) __obj.updateDynamic("logged")(logged.asInstanceOf[js.Any])
    if (pageState != null) __obj.updateDynamic("pageState")(pageState.asInstanceOf[js.Any])
    if (!js.isUndefined(prepare)) __obj.updateDynamic("prepare")(prepare.asInstanceOf[js.Any])
    if (readTimeout != null) __obj.updateDynamic("readTimeout")(readTimeout.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (routingIndexes != null) __obj.updateDynamic("routingIndexes")(routingIndexes.asInstanceOf[js.Any])
    if (routingKey != null) __obj.updateDynamic("routingKey")(routingKey.asInstanceOf[js.Any])
    if (routingNames != null) __obj.updateDynamic("routingNames")(routingNames.asInstanceOf[js.Any])
    if (serialConsistency != null) __obj.updateDynamic("serialConsistency")(serialConsistency.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(traceQuery)) __obj.updateDynamic("traceQuery")(traceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

