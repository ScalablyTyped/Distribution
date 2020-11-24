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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends js.Object {
  
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
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthProvider(value: AuthProvider): Self = this.set("authProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthProvider: Self = this.set("authProvider", js.undefined)
    
    @scala.inline
    def setCloud(value: SecureConnectBundle): Self = this.set("cloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloud: Self = this.set("cloud", js.undefined)
    
    @scala.inline
    def setContactPointsVarargs(value: String*): Self = this.set("contactPoints", js.Array(value :_*))
    
    @scala.inline
    def setContactPoints(value: js.Array[String]): Self = this.set("contactPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactPoints: Self = this.set("contactPoints", js.undefined)
    
    @scala.inline
    def setCredentials(value: Password): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setEncoding(value: CopyBuffer): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setIsMetadataSyncEnabled(value: Boolean): Self = this.set("isMetadataSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMetadataSyncEnabled: Self = this.set("isMetadataSyncEnabled", js.undefined)
    
    @scala.inline
    def setKeyspace(value: String): Self = this.set("keyspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyspace: Self = this.set("keyspace", js.undefined)
    
    @scala.inline
    def setLocalDataCenter(value: String): Self = this.set("localDataCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalDataCenter: Self = this.set("localDataCenter", js.undefined)
    
    @scala.inline
    def setMaxPrepared(value: Double): Self = this.set("maxPrepared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPrepared: Self = this.set("maxPrepared", js.undefined)
    
    @scala.inline
    def setMetrics(value: ClientMetrics): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setPolicies(value: AddressResolution): Self = this.set("policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
    
    @scala.inline
    def setPooling(value: CoreConnectionsPerHost): Self = this.set("pooling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePooling: Self = this.set("pooling", js.undefined)
    
    @scala.inline
    def setPrepareOnAllHosts(value: Boolean): Self = this.set("prepareOnAllHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepareOnAllHosts: Self = this.set("prepareOnAllHosts", js.undefined)
    
    @scala.inline
    def setProfilesVarargs(value: ExecutionProfile*): Self = this.set("profiles", js.Array(value :_*))
    
    @scala.inline
    def setProfiles(value: js.Array[ExecutionProfile]): Self = this.set("profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfiles: Self = this.set("profiles", js.undefined)
    
    @scala.inline
    def setPromiseFactory(
      value: /* handler */ js.Function1[
          /* callback */ js.Function2[/* err */ Error, /* result */ js.UndefOr[js.Any], Unit], 
          Unit
        ] => js.Promise[_]
    ): Self = this.set("promiseFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePromiseFactory: Self = this.set("promiseFactory", js.undefined)
    
    @scala.inline
    def setProtocolOptions(value: MaxSchemaAgreementWaitSeconds): Self = this.set("protocolOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolOptions: Self = this.set("protocolOptions", js.undefined)
    
    @scala.inline
    def setQueryOptions(value: QueryOptions): Self = this.set("queryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryOptions: Self = this.set("queryOptions", js.undefined)
    
    @scala.inline
    def setRePrepareOnUp(value: Boolean): Self = this.set("rePrepareOnUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRePrepareOnUp: Self = this.set("rePrepareOnUp", js.undefined)
    
    @scala.inline
    def setRefreshSchemaDelay(value: Double): Self = this.set("refreshSchemaDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshSchemaDelay: Self = this.set("refreshSchemaDelay", js.undefined)
    
    @scala.inline
    def setRequestTracker(value: RequestTracker): Self = this.set("requestTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTracker: Self = this.set("requestTracker", js.undefined)
    
    @scala.inline
    def setSocketOptions(value: CoalescingThreshold): Self = this.set("socketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketOptions: Self = this.set("socketOptions", js.undefined)
    
    @scala.inline
    def setSslOptions(value: ConnectionOptions): Self = this.set("sslOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslOptions: Self = this.set("sslOptions", js.undefined)
  }
}
