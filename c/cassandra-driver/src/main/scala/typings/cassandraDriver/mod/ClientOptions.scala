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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends StObject {
  
  var authProvider: js.UndefOr[AuthProvider] = js.native
  
  var cloud: js.UndefOr[SecureConnectBundle] = js.native
  
  var contactPoints: js.UndefOr[js.Array[String]] = js.native
  
  var credentials: js.UndefOr[Password] = js.native
  
  var encoding: js.UndefOr[CopyBuffer] = js.native
  
  var isMetadataSyncEnabled: js.UndefOr[Boolean] = js.native
  
  var keyspace: js.UndefOr[String] = js.native
  
  var localDataCenter: js.UndefOr[String] = js.native
  
  var maxPrepared: js.UndefOr[Double] = js.native
  
  var metrics: js.UndefOr[ClientMetrics] = js.native
  
  var policies: js.UndefOr[AddressResolution] = js.native
  
  var pooling: js.UndefOr[CoreConnectionsPerHost] = js.native
  
  var prepareOnAllHosts: js.UndefOr[Boolean] = js.native
  
  var profiles: js.UndefOr[js.Array[ExecutionProfile]] = js.native
  
  var promiseFactory: js.UndefOr[
    js.Function1[
      /* handler */ js.Function1[
        /* callback */ js.Function2[/* err */ Error, /* result */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      js.Promise[_]
    ]
  ] = js.native
  
  var protocolOptions: js.UndefOr[MaxSchemaAgreementWaitSeconds] = js.native
  
  var queryOptions: js.UndefOr[QueryOptions] = js.native
  
  var rePrepareOnUp: js.UndefOr[Boolean] = js.native
  
  var refreshSchemaDelay: js.UndefOr[Double] = js.native
  
  var requestTracker: js.UndefOr[RequestTracker] = js.native
  
  var socketOptions: js.UndefOr[CoalescingThreshold] = js.native
  
  var sslOptions: js.UndefOr[ConnectionOptions] = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthProvider(value: AuthProvider): Self = StObject.set(x, "authProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthProviderUndefined: Self = StObject.set(x, "authProvider", js.undefined)
    
    @scala.inline
    def setCloud(value: SecureConnectBundle): Self = StObject.set(x, "cloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudUndefined: Self = StObject.set(x, "cloud", js.undefined)
    
    @scala.inline
    def setContactPoints(value: js.Array[String]): Self = StObject.set(x, "contactPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactPointsUndefined: Self = StObject.set(x, "contactPoints", js.undefined)
    
    @scala.inline
    def setContactPointsVarargs(value: String*): Self = StObject.set(x, "contactPoints", js.Array(value :_*))
    
    @scala.inline
    def setCredentials(value: Password): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setEncoding(value: CopyBuffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setIsMetadataSyncEnabled(value: Boolean): Self = StObject.set(x, "isMetadataSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMetadataSyncEnabledUndefined: Self = StObject.set(x, "isMetadataSyncEnabled", js.undefined)
    
    @scala.inline
    def setKeyspace(value: String): Self = StObject.set(x, "keyspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyspaceUndefined: Self = StObject.set(x, "keyspace", js.undefined)
    
    @scala.inline
    def setLocalDataCenter(value: String): Self = StObject.set(x, "localDataCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalDataCenterUndefined: Self = StObject.set(x, "localDataCenter", js.undefined)
    
    @scala.inline
    def setMaxPrepared(value: Double): Self = StObject.set(x, "maxPrepared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPreparedUndefined: Self = StObject.set(x, "maxPrepared", js.undefined)
    
    @scala.inline
    def setMetrics(value: ClientMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setPolicies(value: AddressResolution): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPooling(value: CoreConnectionsPerHost): Self = StObject.set(x, "pooling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolingUndefined: Self = StObject.set(x, "pooling", js.undefined)
    
    @scala.inline
    def setPrepareOnAllHosts(value: Boolean): Self = StObject.set(x, "prepareOnAllHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepareOnAllHostsUndefined: Self = StObject.set(x, "prepareOnAllHosts", js.undefined)
    
    @scala.inline
    def setProfiles(value: js.Array[ExecutionProfile]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    @scala.inline
    def setProfilesVarargs(value: ExecutionProfile*): Self = StObject.set(x, "profiles", js.Array(value :_*))
    
    @scala.inline
    def setPromiseFactory(
      value: /* handler */ js.Function1[
          /* callback */ js.Function2[/* err */ Error, /* result */ js.UndefOr[js.Any], Unit], 
          Unit
        ] => js.Promise[_]
    ): Self = StObject.set(x, "promiseFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPromiseFactoryUndefined: Self = StObject.set(x, "promiseFactory", js.undefined)
    
    @scala.inline
    def setProtocolOptions(value: MaxSchemaAgreementWaitSeconds): Self = StObject.set(x, "protocolOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolOptionsUndefined: Self = StObject.set(x, "protocolOptions", js.undefined)
    
    @scala.inline
    def setQueryOptions(value: QueryOptions): Self = StObject.set(x, "queryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryOptionsUndefined: Self = StObject.set(x, "queryOptions", js.undefined)
    
    @scala.inline
    def setRePrepareOnUp(value: Boolean): Self = StObject.set(x, "rePrepareOnUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRePrepareOnUpUndefined: Self = StObject.set(x, "rePrepareOnUp", js.undefined)
    
    @scala.inline
    def setRefreshSchemaDelay(value: Double): Self = StObject.set(x, "refreshSchemaDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshSchemaDelayUndefined: Self = StObject.set(x, "refreshSchemaDelay", js.undefined)
    
    @scala.inline
    def setRequestTracker(value: RequestTracker): Self = StObject.set(x, "requestTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTrackerUndefined: Self = StObject.set(x, "requestTracker", js.undefined)
    
    @scala.inline
    def setSocketOptions(value: CoalescingThreshold): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketOptionsUndefined: Self = StObject.set(x, "socketOptions", js.undefined)
    
    @scala.inline
    def setSslOptions(value: ConnectionOptions): Self = StObject.set(x, "sslOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslOptionsUndefined: Self = StObject.set(x, "sslOptions", js.undefined)
  }
}
