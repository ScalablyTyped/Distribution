package typings.cassandraDriver.mod

import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.typesMod.types.Long
import typings.cassandraDriver.typesMod.types.consistencies
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQueryOptions extends QueryOptions {
  var graphLanguage: js.UndefOr[String] = js.undefined
  var graphName: js.UndefOr[String] = js.undefined
  var graphReadConsistency: js.UndefOr[consistencies] = js.undefined
  var graphSource: js.UndefOr[String] = js.undefined
  var graphWriteConsistency: js.UndefOr[consistencies] = js.undefined
}

object GraphQueryOptions {
  @scala.inline
  def apply(
    autoPage: js.UndefOr[Boolean] = js.undefined,
    captureStackTrace: js.UndefOr[Boolean] = js.undefined,
    consistency: js.UndefOr[Double] = js.undefined,
    counter: js.UndefOr[Boolean] = js.undefined,
    customPayload: js.Any = null,
    executionProfile: String | ExecutionProfile = null,
    fetchSize: js.UndefOr[Double] = js.undefined,
    graphLanguage: String = null,
    graphName: String = null,
    graphReadConsistency: consistencies = null,
    graphSource: String = null,
    graphWriteConsistency: consistencies = null,
    hints: js.Array[js.Array[String] | String] = null,
    host: Host = null,
    isIdempotent: js.UndefOr[Boolean] = js.undefined,
    keyspace: String = null,
    logged: js.UndefOr[Boolean] = js.undefined,
    pageState: Buffer | String = null,
    prepare: js.UndefOr[Boolean] = js.undefined,
    readTimeout: js.UndefOr[Double] = js.undefined,
    retry: RetryPolicy = null,
    routingIndexes: js.Array[Double] = null,
    routingKey: Buffer | js.Array[Buffer] = null,
    routingNames: js.Array[String] = null,
    serialConsistency: js.UndefOr[Double] = js.undefined,
    timestamp: Double | Long = null,
    traceQuery: js.UndefOr[Boolean] = js.undefined
  ): GraphQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPage)) __obj.updateDynamic("autoPage")(autoPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(captureStackTrace)) __obj.updateDynamic("captureStackTrace")(captureStackTrace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(consistency)) __obj.updateDynamic("consistency")(consistency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(counter)) __obj.updateDynamic("counter")(counter.get.asInstanceOf[js.Any])
    if (customPayload != null) __obj.updateDynamic("customPayload")(customPayload.asInstanceOf[js.Any])
    if (executionProfile != null) __obj.updateDynamic("executionProfile")(executionProfile.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchSize)) __obj.updateDynamic("fetchSize")(fetchSize.get.asInstanceOf[js.Any])
    if (graphLanguage != null) __obj.updateDynamic("graphLanguage")(graphLanguage.asInstanceOf[js.Any])
    if (graphName != null) __obj.updateDynamic("graphName")(graphName.asInstanceOf[js.Any])
    if (graphReadConsistency != null) __obj.updateDynamic("graphReadConsistency")(graphReadConsistency.asInstanceOf[js.Any])
    if (graphSource != null) __obj.updateDynamic("graphSource")(graphSource.asInstanceOf[js.Any])
    if (graphWriteConsistency != null) __obj.updateDynamic("graphWriteConsistency")(graphWriteConsistency.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(isIdempotent)) __obj.updateDynamic("isIdempotent")(isIdempotent.get.asInstanceOf[js.Any])
    if (keyspace != null) __obj.updateDynamic("keyspace")(keyspace.asInstanceOf[js.Any])
    if (!js.isUndefined(logged)) __obj.updateDynamic("logged")(logged.get.asInstanceOf[js.Any])
    if (pageState != null) __obj.updateDynamic("pageState")(pageState.asInstanceOf[js.Any])
    if (!js.isUndefined(prepare)) __obj.updateDynamic("prepare")(prepare.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readTimeout)) __obj.updateDynamic("readTimeout")(readTimeout.get.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (routingIndexes != null) __obj.updateDynamic("routingIndexes")(routingIndexes.asInstanceOf[js.Any])
    if (routingKey != null) __obj.updateDynamic("routingKey")(routingKey.asInstanceOf[js.Any])
    if (routingNames != null) __obj.updateDynamic("routingNames")(routingNames.asInstanceOf[js.Any])
    if (!js.isUndefined(serialConsistency)) __obj.updateDynamic("serialConsistency")(serialConsistency.get.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(traceQuery)) __obj.updateDynamic("traceQuery")(traceQuery.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQueryOptions]
  }
}

