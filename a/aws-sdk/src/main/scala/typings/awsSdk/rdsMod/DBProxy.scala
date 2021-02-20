package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBProxy extends StObject {
  
  /**
    * One or more data structures specifying the authorization mechanism to connect to the associated RDS DB instance or Aurora DB cluster.
    */
  var Auth: js.UndefOr[UserAuthConfigInfoList] = js.native
  
  /**
    * The date and time when the proxy was first created.
    */
  var CreatedDate: js.UndefOr[TStamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the proxy.
    */
  var DBProxyArn: js.UndefOr[String] = js.native
  
  /**
    * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
    */
  var DBProxyName: js.UndefOr[String] = js.native
  
  /**
    * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
    */
  var DebugLogging: js.UndefOr[Boolean] = js.native
  
  /**
    * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
    */
  var Endpoint: js.UndefOr[String] = js.native
  
  /**
    * The engine family applies to MySQL and PostgreSQL for both RDS and Aurora.
    */
  var EngineFamily: js.UndefOr[String] = js.native
  
  /**
    * The number of seconds a connection to the proxy can have no activity before the proxy drops the client connection. The proxy keeps the underlying database connection open and puts it back into the connection pool for reuse by later connection requests. Default: 1800 (30 minutes) Constraints: 1 to 28,800
    */
  var IdleClientTimeout: js.UndefOr[Integer] = js.native
  
  /**
    * Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
    */
  var RequireTLS: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to access Amazon Secrets Manager.
    */
  var RoleArn: js.UndefOr[String] = js.native
  
  /**
    * The current status of this proxy. A status of available means the proxy is ready to handle requests. Other values indicate that you must wait for the proxy to be ready, or take some action to resolve an issue.
    */
  var Status: js.UndefOr[DBProxyStatus] = js.native
  
  /**
    * The date and time when the proxy was last updated.
    */
  var UpdatedDate: js.UndefOr[TStamp] = js.native
  
  /**
    * Provides a list of VPC security groups that the proxy belongs to.
    */
  var VpcSecurityGroupIds: js.UndefOr[StringList] = js.native
  
  /**
    * The EC2 subnet IDs for the proxy.
    */
  var VpcSubnetIds: js.UndefOr[StringList] = js.native
}
object DBProxy {
  
  @scala.inline
  def apply(): DBProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBProxy]
  }
  
  @scala.inline
  implicit class DBProxyMutableBuilder[Self <: DBProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: UserAuthConfigInfoList): Self = StObject.set(x, "Auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "Auth", js.undefined)
    
    @scala.inline
    def setAuthVarargs(value: UserAuthConfigInfo*): Self = StObject.set(x, "Auth", js.Array(value :_*))
    
    @scala.inline
    def setCreatedDate(value: TStamp): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDBProxyArn(value: String): Self = StObject.set(x, "DBProxyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBProxyArnUndefined: Self = StObject.set(x, "DBProxyArn", js.undefined)
    
    @scala.inline
    def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBProxyNameUndefined: Self = StObject.set(x, "DBProxyName", js.undefined)
    
    @scala.inline
    def setDebugLogging(value: Boolean): Self = StObject.set(x, "DebugLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugLoggingUndefined: Self = StObject.set(x, "DebugLogging", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setEngineFamily(value: String): Self = StObject.set(x, "EngineFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineFamilyUndefined: Self = StObject.set(x, "EngineFamily", js.undefined)
    
    @scala.inline
    def setIdleClientTimeout(value: Integer): Self = StObject.set(x, "IdleClientTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleClientTimeoutUndefined: Self = StObject.set(x, "IdleClientTimeout", js.undefined)
    
    @scala.inline
    def setRequireTLS(value: Boolean): Self = StObject.set(x, "RequireTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireTLSUndefined: Self = StObject.set(x, "RequireTLS", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: DBProxyStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUpdatedDate(value: TStamp): Self = StObject.set(x, "UpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDateUndefined: Self = StObject.set(x, "UpdatedDate", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIds(value: StringList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcSubnetIds(value: StringList): Self = StObject.set(x, "VpcSubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSubnetIdsUndefined: Self = StObject.set(x, "VpcSubnetIds", js.undefined)
    
    @scala.inline
    def setVpcSubnetIdsVarargs(value: String*): Self = StObject.set(x, "VpcSubnetIds", js.Array(value :_*))
  }
}
