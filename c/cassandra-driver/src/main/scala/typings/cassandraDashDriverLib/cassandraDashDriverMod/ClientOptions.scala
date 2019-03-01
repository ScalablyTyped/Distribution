package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var authProvider: js.UndefOr[cassandraDashDriverLib.cassandraDashDriverMod.authNs.AuthProvider] = js.undefined
  var contactPoints: js.Array[java.lang.String]
  var encoding: js.UndefOr[cassandraDashDriverLib.Anon_Args] = js.undefined
  var isMetadataSyncEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var keyspace: js.UndefOr[java.lang.String] = js.undefined
  var localDataCenter: js.UndefOr[java.lang.String] = js.undefined
  var maxPrepared: js.UndefOr[scala.Double] = js.undefined
  var metrics: js.UndefOr[cassandraDashDriverLib.cassandraDashDriverMod.metricsNs.ClientMetrics] = js.undefined
  var policies: js.UndefOr[cassandraDashDriverLib.Anon_AddressResolution] = js.undefined
  var pooling: js.UndefOr[cassandraDashDriverLib.Anon_CoreConnectionsPerHost] = js.undefined
  var prepareOnAllHosts: js.UndefOr[scala.Boolean] = js.undefined
  var profiles: js.UndefOr[js.Array[ExecutionProfile]] = js.undefined
  var promiseFactory: js.UndefOr[
    js.Function1[
      /* handler */ js.Function1[
        /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], scala.Unit], 
        scala.Unit
      ], 
      js.Promise[_]
    ]
  ] = js.undefined
  var protocolOptions: js.UndefOr[cassandraDashDriverLib.Anon_MaxSchemaAgreementWaitSeconds] = js.undefined
  var queryOptions: js.UndefOr[QueryOptions] = js.undefined
  var rePrepareOnUp: js.UndefOr[scala.Boolean] = js.undefined
  var refreshSchemaDelay: js.UndefOr[scala.Double] = js.undefined
  var requestTracker: js.UndefOr[cassandraDashDriverLib.cassandraDashDriverMod.trackerNs.RequestTracker] = js.undefined
  var socketOptions: js.UndefOr[cassandraDashDriverLib.Anon_CoalescingThreshold] = js.undefined
  var sslOptions: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    contactPoints: js.Array[java.lang.String],
    authProvider: cassandraDashDriverLib.cassandraDashDriverMod.authNs.AuthProvider = null,
    encoding: cassandraDashDriverLib.Anon_Args = null,
    isMetadataSyncEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    keyspace: java.lang.String = null,
    localDataCenter: java.lang.String = null,
    maxPrepared: scala.Int | scala.Double = null,
    metrics: cassandraDashDriverLib.cassandraDashDriverMod.metricsNs.ClientMetrics = null,
    policies: cassandraDashDriverLib.Anon_AddressResolution = null,
    pooling: cassandraDashDriverLib.Anon_CoreConnectionsPerHost = null,
    prepareOnAllHosts: js.UndefOr[scala.Boolean] = js.undefined,
    profiles: js.Array[ExecutionProfile] = null,
    promiseFactory: js.Function1[
      /* handler */ js.Function1[
        /* callback */ js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], scala.Unit], 
        scala.Unit
      ], 
      js.Promise[_]
    ] = null,
    protocolOptions: cassandraDashDriverLib.Anon_MaxSchemaAgreementWaitSeconds = null,
    queryOptions: QueryOptions = null,
    rePrepareOnUp: js.UndefOr[scala.Boolean] = js.undefined,
    refreshSchemaDelay: scala.Int | scala.Double = null,
    requestTracker: cassandraDashDriverLib.cassandraDashDriverMod.trackerNs.RequestTracker = null,
    socketOptions: cassandraDashDriverLib.Anon_CoalescingThreshold = null,
    sslOptions: nodeLib.tlsMod.ConnectionOptions = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contactPoints")(contactPoints)
    if (authProvider != null) __obj.updateDynamic("authProvider")(authProvider)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(isMetadataSyncEnabled)) __obj.updateDynamic("isMetadataSyncEnabled")(isMetadataSyncEnabled)
    if (keyspace != null) __obj.updateDynamic("keyspace")(keyspace)
    if (localDataCenter != null) __obj.updateDynamic("localDataCenter")(localDataCenter)
    if (maxPrepared != null) __obj.updateDynamic("maxPrepared")(maxPrepared.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (policies != null) __obj.updateDynamic("policies")(policies)
    if (pooling != null) __obj.updateDynamic("pooling")(pooling)
    if (!js.isUndefined(prepareOnAllHosts)) __obj.updateDynamic("prepareOnAllHosts")(prepareOnAllHosts)
    if (profiles != null) __obj.updateDynamic("profiles")(profiles)
    if (promiseFactory != null) __obj.updateDynamic("promiseFactory")(promiseFactory)
    if (protocolOptions != null) __obj.updateDynamic("protocolOptions")(protocolOptions)
    if (queryOptions != null) __obj.updateDynamic("queryOptions")(queryOptions)
    if (!js.isUndefined(rePrepareOnUp)) __obj.updateDynamic("rePrepareOnUp")(rePrepareOnUp)
    if (refreshSchemaDelay != null) __obj.updateDynamic("refreshSchemaDelay")(refreshSchemaDelay.asInstanceOf[js.Any])
    if (requestTracker != null) __obj.updateDynamic("requestTracker")(requestTracker)
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions)
    if (sslOptions != null) __obj.updateDynamic("sslOptions")(sslOptions)
    __obj.asInstanceOf[ClientOptions]
  }
}

