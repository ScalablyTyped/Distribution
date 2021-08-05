package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBProxy extends StObject {
  
  /**
    * One or more data structures specifying the authorization mechanism to connect to the associated RDS DB instance or Aurora DB cluster.
    */
  var Auth: js.UndefOr[UserAuthConfigInfoList] = js.undefined
  
  /**
    * The date and time when the proxy was first created.
    */
  var CreatedDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the proxy.
    */
  var DBProxyArn: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
    */
  var DBProxyName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
    */
  var DebugLogging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
    */
  var Endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The engine family applies to MySQL and PostgreSQL for both RDS and Aurora.
    */
  var EngineFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The number of seconds a connection to the proxy can have no activity before the proxy drops the client connection. The proxy keeps the underlying database connection open and puts it back into the connection pool for reuse by later connection requests. Default: 1800 (30 minutes) Constraints: 1 to 28,800
    */
  var IdleClientTimeout: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
    */
  var RequireTLS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to access Amazon Secrets Manager.
    */
  var RoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of this proxy. A status of available means the proxy is ready to handle requests. Other values indicate that you must wait for the proxy to be ready, or take some action to resolve an issue.
    */
  var Status: js.UndefOr[DBProxyStatus] = js.undefined
  
  /**
    * The date and time when the proxy was last updated.
    */
  var UpdatedDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * Provides a list of VPC security groups that the proxy belongs to.
    */
  var VpcSecurityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The EC2 subnet IDs for the proxy.
    */
  var VpcSubnetIds: js.UndefOr[StringList] = js.undefined
}
object DBProxy {
  
  inline def apply(): DBProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBProxy]
  }
  
  extension [Self <: DBProxy](x: Self) {
    
    inline def setAuth(value: UserAuthConfigInfoList): Self = StObject.set(x, "Auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "Auth", js.undefined)
    
    inline def setAuthVarargs(value: UserAuthConfigInfo*): Self = StObject.set(x, "Auth", js.Array(value :_*))
    
    inline def setCreatedDate(value: TStamp): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDBProxyArn(value: String): Self = StObject.set(x, "DBProxyArn", value.asInstanceOf[js.Any])
    
    inline def setDBProxyArnUndefined: Self = StObject.set(x, "DBProxyArn", js.undefined)
    
    inline def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    inline def setDBProxyNameUndefined: Self = StObject.set(x, "DBProxyName", js.undefined)
    
    inline def setDebugLogging(value: Boolean): Self = StObject.set(x, "DebugLogging", value.asInstanceOf[js.Any])
    
    inline def setDebugLoggingUndefined: Self = StObject.set(x, "DebugLogging", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setEngineFamily(value: String): Self = StObject.set(x, "EngineFamily", value.asInstanceOf[js.Any])
    
    inline def setEngineFamilyUndefined: Self = StObject.set(x, "EngineFamily", js.undefined)
    
    inline def setIdleClientTimeout(value: Integer): Self = StObject.set(x, "IdleClientTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleClientTimeoutUndefined: Self = StObject.set(x, "IdleClientTimeout", js.undefined)
    
    inline def setRequireTLS(value: Boolean): Self = StObject.set(x, "RequireTLS", value.asInstanceOf[js.Any])
    
    inline def setRequireTLSUndefined: Self = StObject.set(x, "RequireTLS", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setStatus(value: DBProxyStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedDate(value: TStamp): Self = StObject.set(x, "UpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDateUndefined: Self = StObject.set(x, "UpdatedDate", js.undefined)
    
    inline def setVpcSecurityGroupIds(value: StringList): Self = StObject.set(x, "VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "VpcSecurityGroupIds", js.undefined)
    
    inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "VpcSecurityGroupIds", js.Array(value :_*))
    
    inline def setVpcSubnetIds(value: StringList): Self = StObject.set(x, "VpcSubnetIds", value.asInstanceOf[js.Any])
    
    inline def setVpcSubnetIdsUndefined: Self = StObject.set(x, "VpcSubnetIds", js.undefined)
    
    inline def setVpcSubnetIdsVarargs(value: String*): Self = StObject.set(x, "VpcSubnetIds", js.Array(value :_*))
  }
}
