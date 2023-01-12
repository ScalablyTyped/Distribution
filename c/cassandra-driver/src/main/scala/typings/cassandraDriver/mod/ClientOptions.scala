package typings.cassandraDriver.mod

import typings.cassandraDriver.anon.AddressResolution
import typings.cassandraDriver.anon.CoalescingThreshold
import typings.cassandraDriver.anon.CopyBuffer
import typings.cassandraDriver.anon.CoreConnectionsPerHost
import typings.cassandraDriver.anon.MaxSchemaAgreementWaitSeconds
import typings.cassandraDriver.anon.Password
import typings.cassandraDriver.anon.SecureConnectBundle
import typings.cassandraDriver.libAuthMod.auth.AuthProvider
import typings.cassandraDriver.libMetricsMod.metrics.ClientMetrics
import typings.cassandraDriver.libTrackerMod.tracker.RequestTracker
import typings.node.tlsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOptions extends StObject {
  
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
        /* callback */ js.Function2[/* err */ js.Error, /* result */ js.UndefOr[Any], Unit], 
        Unit
      ], 
      js.Promise[Any]
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
  
  inline def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthProvider(value: AuthProvider): Self = StObject.set(x, "authProvider", value.asInstanceOf[js.Any])
    
    inline def setAuthProviderUndefined: Self = StObject.set(x, "authProvider", js.undefined)
    
    inline def setCloud(value: SecureConnectBundle): Self = StObject.set(x, "cloud", value.asInstanceOf[js.Any])
    
    inline def setCloudUndefined: Self = StObject.set(x, "cloud", js.undefined)
    
    inline def setContactPoints(value: js.Array[String]): Self = StObject.set(x, "contactPoints", value.asInstanceOf[js.Any])
    
    inline def setContactPointsUndefined: Self = StObject.set(x, "contactPoints", js.undefined)
    
    inline def setContactPointsVarargs(value: String*): Self = StObject.set(x, "contactPoints", js.Array(value*))
    
    inline def setCredentials(value: Password): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setEncoding(value: CopyBuffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setIsMetadataSyncEnabled(value: Boolean): Self = StObject.set(x, "isMetadataSyncEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsMetadataSyncEnabledUndefined: Self = StObject.set(x, "isMetadataSyncEnabled", js.undefined)
    
    inline def setKeyspace(value: String): Self = StObject.set(x, "keyspace", value.asInstanceOf[js.Any])
    
    inline def setKeyspaceUndefined: Self = StObject.set(x, "keyspace", js.undefined)
    
    inline def setLocalDataCenter(value: String): Self = StObject.set(x, "localDataCenter", value.asInstanceOf[js.Any])
    
    inline def setLocalDataCenterUndefined: Self = StObject.set(x, "localDataCenter", js.undefined)
    
    inline def setMaxPrepared(value: Double): Self = StObject.set(x, "maxPrepared", value.asInstanceOf[js.Any])
    
    inline def setMaxPreparedUndefined: Self = StObject.set(x, "maxPrepared", js.undefined)
    
    inline def setMetrics(value: ClientMetrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setPolicies(value: AddressResolution): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPooling(value: CoreConnectionsPerHost): Self = StObject.set(x, "pooling", value.asInstanceOf[js.Any])
    
    inline def setPoolingUndefined: Self = StObject.set(x, "pooling", js.undefined)
    
    inline def setPrepareOnAllHosts(value: Boolean): Self = StObject.set(x, "prepareOnAllHosts", value.asInstanceOf[js.Any])
    
    inline def setPrepareOnAllHostsUndefined: Self = StObject.set(x, "prepareOnAllHosts", js.undefined)
    
    inline def setProfiles(value: js.Array[ExecutionProfile]): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    inline def setProfilesVarargs(value: ExecutionProfile*): Self = StObject.set(x, "profiles", js.Array(value*))
    
    inline def setPromiseFactory(
      value: /* handler */ js.Function1[
          /* callback */ js.Function2[/* err */ js.Error, /* result */ js.UndefOr[Any], Unit], 
          Unit
        ] => js.Promise[Any]
    ): Self = StObject.set(x, "promiseFactory", js.Any.fromFunction1(value))
    
    inline def setPromiseFactoryUndefined: Self = StObject.set(x, "promiseFactory", js.undefined)
    
    inline def setProtocolOptions(value: MaxSchemaAgreementWaitSeconds): Self = StObject.set(x, "protocolOptions", value.asInstanceOf[js.Any])
    
    inline def setProtocolOptionsUndefined: Self = StObject.set(x, "protocolOptions", js.undefined)
    
    inline def setQueryOptions(value: QueryOptions): Self = StObject.set(x, "queryOptions", value.asInstanceOf[js.Any])
    
    inline def setQueryOptionsUndefined: Self = StObject.set(x, "queryOptions", js.undefined)
    
    inline def setRePrepareOnUp(value: Boolean): Self = StObject.set(x, "rePrepareOnUp", value.asInstanceOf[js.Any])
    
    inline def setRePrepareOnUpUndefined: Self = StObject.set(x, "rePrepareOnUp", js.undefined)
    
    inline def setRefreshSchemaDelay(value: Double): Self = StObject.set(x, "refreshSchemaDelay", value.asInstanceOf[js.Any])
    
    inline def setRefreshSchemaDelayUndefined: Self = StObject.set(x, "refreshSchemaDelay", js.undefined)
    
    inline def setRequestTracker(value: RequestTracker): Self = StObject.set(x, "requestTracker", value.asInstanceOf[js.Any])
    
    inline def setRequestTrackerUndefined: Self = StObject.set(x, "requestTracker", js.undefined)
    
    inline def setSocketOptions(value: CoalescingThreshold): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
    
    inline def setSocketOptionsUndefined: Self = StObject.set(x, "socketOptions", js.undefined)
    
    inline def setSslOptions(value: ConnectionOptions): Self = StObject.set(x, "sslOptions", value.asInstanceOf[js.Any])
    
    inline def setSslOptionsUndefined: Self = StObject.set(x, "sslOptions", js.undefined)
  }
}
