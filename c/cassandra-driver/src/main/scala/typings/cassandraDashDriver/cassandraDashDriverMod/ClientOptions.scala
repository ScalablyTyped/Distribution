package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.cassandraDashDriver.Anon_AddressResolution
import typings.cassandraDashDriver.Anon_CoalescingThreshold
import typings.cassandraDashDriver.Anon_CopyBuffer
import typings.cassandraDashDriver.Anon_CoreConnectionsPerHost
import typings.cassandraDashDriver.Anon_MaxSchemaAgreementWaitSeconds
import typings.cassandraDashDriver.Anon_Password
import typings.cassandraDashDriver.Anon_SecureConnectBundle
import typings.cassandraDashDriver.libAuthMod.auth.AuthProvider
import typings.cassandraDashDriver.libMetricsMod.metrics.ClientMetrics
import typings.cassandraDashDriver.libTrackerMod.tracker.RequestTracker
import typings.node.tlsMod.ConnectionOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var authProvider: js.UndefOr[AuthProvider] = js.undefined
  var cloud: js.UndefOr[Anon_SecureConnectBundle] = js.undefined
  var contactPoints: js.UndefOr[js.Array[String]] = js.undefined
  var credentials: js.UndefOr[Anon_Password] = js.undefined
  var encoding: js.UndefOr[Anon_CopyBuffer] = js.undefined
  var isMetadataSyncEnabled: js.UndefOr[Boolean] = js.undefined
  var keyspace: js.UndefOr[String] = js.undefined
  var localDataCenter: js.UndefOr[String] = js.undefined
  var maxPrepared: js.UndefOr[Double] = js.undefined
  var metrics: js.UndefOr[ClientMetrics] = js.undefined
  var policies: js.UndefOr[Anon_AddressResolution] = js.undefined
  var pooling: js.UndefOr[Anon_CoreConnectionsPerHost] = js.undefined
  var prepareOnAllHosts: js.UndefOr[Boolean] = js.undefined
  var profiles: js.UndefOr[js.Array[ExecutionProfile]] = js.undefined
  var promiseFactory: js.UndefOr[
    js.Function1[
      /* handler */ js.Function1[
        /* callback */ js.Function2[/* err */ Error, /* result */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      js.Promise[_]
    ]
  ] = js.undefined
  var protocolOptions: js.UndefOr[Anon_MaxSchemaAgreementWaitSeconds] = js.undefined
  var queryOptions: js.UndefOr[QueryOptions] = js.undefined
  var rePrepareOnUp: js.UndefOr[Boolean] = js.undefined
  var refreshSchemaDelay: js.UndefOr[Double] = js.undefined
  var requestTracker: js.UndefOr[RequestTracker] = js.undefined
  var socketOptions: js.UndefOr[Anon_CoalescingThreshold] = js.undefined
  var sslOptions: js.UndefOr[ConnectionOptions] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    authProvider: AuthProvider = null,
    cloud: Anon_SecureConnectBundle = null,
    contactPoints: js.Array[String] = null,
    credentials: Anon_Password = null,
    encoding: Anon_CopyBuffer = null,
    isMetadataSyncEnabled: js.UndefOr[Boolean] = js.undefined,
    keyspace: String = null,
    localDataCenter: String = null,
    maxPrepared: Int | Double = null,
    metrics: ClientMetrics = null,
    policies: Anon_AddressResolution = null,
    pooling: Anon_CoreConnectionsPerHost = null,
    prepareOnAllHosts: js.UndefOr[Boolean] = js.undefined,
    profiles: js.Array[ExecutionProfile] = null,
    promiseFactory: /* handler */ js.Function1[
      /* callback */ js.Function2[/* err */ Error, /* result */ js.UndefOr[js.Any], Unit], 
      Unit
    ] => js.Promise[_] = null,
    protocolOptions: Anon_MaxSchemaAgreementWaitSeconds = null,
    queryOptions: QueryOptions = null,
    rePrepareOnUp: js.UndefOr[Boolean] = js.undefined,
    refreshSchemaDelay: Int | Double = null,
    requestTracker: RequestTracker = null,
    socketOptions: Anon_CoalescingThreshold = null,
    sslOptions: ConnectionOptions = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (authProvider != null) __obj.updateDynamic("authProvider")(authProvider.asInstanceOf[js.Any])
    if (cloud != null) __obj.updateDynamic("cloud")(cloud.asInstanceOf[js.Any])
    if (contactPoints != null) __obj.updateDynamic("contactPoints")(contactPoints.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(isMetadataSyncEnabled)) __obj.updateDynamic("isMetadataSyncEnabled")(isMetadataSyncEnabled.asInstanceOf[js.Any])
    if (keyspace != null) __obj.updateDynamic("keyspace")(keyspace.asInstanceOf[js.Any])
    if (localDataCenter != null) __obj.updateDynamic("localDataCenter")(localDataCenter.asInstanceOf[js.Any])
    if (maxPrepared != null) __obj.updateDynamic("maxPrepared")(maxPrepared.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    if (pooling != null) __obj.updateDynamic("pooling")(pooling.asInstanceOf[js.Any])
    if (!js.isUndefined(prepareOnAllHosts)) __obj.updateDynamic("prepareOnAllHosts")(prepareOnAllHosts.asInstanceOf[js.Any])
    if (profiles != null) __obj.updateDynamic("profiles")(profiles.asInstanceOf[js.Any])
    if (promiseFactory != null) __obj.updateDynamic("promiseFactory")(js.Any.fromFunction1(promiseFactory))
    if (protocolOptions != null) __obj.updateDynamic("protocolOptions")(protocolOptions.asInstanceOf[js.Any])
    if (queryOptions != null) __obj.updateDynamic("queryOptions")(queryOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(rePrepareOnUp)) __obj.updateDynamic("rePrepareOnUp")(rePrepareOnUp.asInstanceOf[js.Any])
    if (refreshSchemaDelay != null) __obj.updateDynamic("refreshSchemaDelay")(refreshSchemaDelay.asInstanceOf[js.Any])
    if (requestTracker != null) __obj.updateDynamic("requestTracker")(requestTracker.asInstanceOf[js.Any])
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions.asInstanceOf[js.Any])
    if (sslOptions != null) __obj.updateDynamic("sslOptions")(sslOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

