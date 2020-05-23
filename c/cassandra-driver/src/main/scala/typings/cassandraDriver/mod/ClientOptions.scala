package typings.cassandraDriver.mod

import typings.cassandraDriver.anon.AddressResolution
import typings.cassandraDriver.anon.CoalescingThreshold
import typings.cassandraDriver.anon.CopyBuffer
import typings.cassandraDriver.anon.CoreConnectionsPerHost
import typings.cassandraDriver.anon.MaxSchemaAgreementWaitSeconds
import typings.cassandraDriver.anon.Password
import typings.cassandraDriver.anon.SecureConnectBundle
import typings.cassandraDriver.authMod.auth.AuthProvider
import typings.cassandraDriver.metricsMod.metrics.ClientMetrics
import typings.cassandraDriver.trackerMod.tracker.RequestTracker
import typings.node.tlsMod.ConnectionOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var authProvider: js.UndefOr[AuthProvider] = js.undefined
  var cloud: js.UndefOr[SecureConnectBundle] = js.undefined
  var contactPoints: js.UndefOr[js.Array[String]] = js.undefined
  var credentials: js.UndefOr[Password] = js.undefined
  var encoding: js.UndefOr[CopyBuffer] = js.undefined
  var isMetadataSyncEnabled: js.UndefOr[Boolean] = js.undefined
  var keyspace: js.UndefOr[String] = js.undefined
  var localDataCenter: js.UndefOr[String] = js.undefined
  var maxPrepared: js.UndefOr[Double] = js.undefined
  var metrics: js.UndefOr[ClientMetrics] = js.undefined
  var policies: js.UndefOr[AddressResolution] = js.undefined
  var pooling: js.UndefOr[CoreConnectionsPerHost] = js.undefined
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
  var protocolOptions: js.UndefOr[MaxSchemaAgreementWaitSeconds] = js.undefined
  var queryOptions: js.UndefOr[QueryOptions] = js.undefined
  var rePrepareOnUp: js.UndefOr[Boolean] = js.undefined
  var refreshSchemaDelay: js.UndefOr[Double] = js.undefined
  var requestTracker: js.UndefOr[RequestTracker] = js.undefined
  var socketOptions: js.UndefOr[CoalescingThreshold] = js.undefined
  var sslOptions: js.UndefOr[ConnectionOptions] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    authProvider: AuthProvider = null,
    cloud: SecureConnectBundle = null,
    contactPoints: js.Array[String] = null,
    credentials: Password = null,
    encoding: CopyBuffer = null,
    isMetadataSyncEnabled: js.UndefOr[Boolean] = js.undefined,
    keyspace: String = null,
    localDataCenter: String = null,
    maxPrepared: js.UndefOr[Double] = js.undefined,
    metrics: ClientMetrics = null,
    policies: AddressResolution = null,
    pooling: CoreConnectionsPerHost = null,
    prepareOnAllHosts: js.UndefOr[Boolean] = js.undefined,
    profiles: js.Array[ExecutionProfile] = null,
    promiseFactory: /* handler */ js.Function1[
      /* callback */ js.Function2[/* err */ Error, /* result */ js.UndefOr[js.Any], Unit], 
      Unit
    ] => js.Promise[_] = null,
    protocolOptions: MaxSchemaAgreementWaitSeconds = null,
    queryOptions: QueryOptions = null,
    rePrepareOnUp: js.UndefOr[Boolean] = js.undefined,
    refreshSchemaDelay: js.UndefOr[Double] = js.undefined,
    requestTracker: RequestTracker = null,
    socketOptions: CoalescingThreshold = null,
    sslOptions: ConnectionOptions = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (authProvider != null) __obj.updateDynamic("authProvider")(authProvider.asInstanceOf[js.Any])
    if (cloud != null) __obj.updateDynamic("cloud")(cloud.asInstanceOf[js.Any])
    if (contactPoints != null) __obj.updateDynamic("contactPoints")(contactPoints.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(isMetadataSyncEnabled)) __obj.updateDynamic("isMetadataSyncEnabled")(isMetadataSyncEnabled.get.asInstanceOf[js.Any])
    if (keyspace != null) __obj.updateDynamic("keyspace")(keyspace.asInstanceOf[js.Any])
    if (localDataCenter != null) __obj.updateDynamic("localDataCenter")(localDataCenter.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPrepared)) __obj.updateDynamic("maxPrepared")(maxPrepared.get.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    if (pooling != null) __obj.updateDynamic("pooling")(pooling.asInstanceOf[js.Any])
    if (!js.isUndefined(prepareOnAllHosts)) __obj.updateDynamic("prepareOnAllHosts")(prepareOnAllHosts.get.asInstanceOf[js.Any])
    if (profiles != null) __obj.updateDynamic("profiles")(profiles.asInstanceOf[js.Any])
    if (promiseFactory != null) __obj.updateDynamic("promiseFactory")(js.Any.fromFunction1(promiseFactory))
    if (protocolOptions != null) __obj.updateDynamic("protocolOptions")(protocolOptions.asInstanceOf[js.Any])
    if (queryOptions != null) __obj.updateDynamic("queryOptions")(queryOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(rePrepareOnUp)) __obj.updateDynamic("rePrepareOnUp")(rePrepareOnUp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshSchemaDelay)) __obj.updateDynamic("refreshSchemaDelay")(refreshSchemaDelay.get.asInstanceOf[js.Any])
    if (requestTracker != null) __obj.updateDynamic("requestTracker")(requestTracker.asInstanceOf[js.Any])
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions.asInstanceOf[js.Any])
    if (sslOptions != null) __obj.updateDynamic("sslOptions")(sslOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

