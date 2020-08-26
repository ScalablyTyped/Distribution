package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBProxy extends js.Object {
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
  implicit class DBProxyOps[Self <: DBProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthVarargs(value: UserAuthConfigInfo*): Self = this.set("Auth", js.Array(value :_*))
    @scala.inline
    def setAuth(value: UserAuthConfigInfoList): Self = this.set("Auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("Auth", js.undefined)
    @scala.inline
    def setCreatedDate(value: TStamp): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    @scala.inline
    def setDBProxyArn(value: String): Self = this.set("DBProxyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBProxyArn: Self = this.set("DBProxyArn", js.undefined)
    @scala.inline
    def setDBProxyName(value: String): Self = this.set("DBProxyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBProxyName: Self = this.set("DBProxyName", js.undefined)
    @scala.inline
    def setDebugLogging(value: Boolean): Self = this.set("DebugLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugLogging: Self = this.set("DebugLogging", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    @scala.inline
    def setEngineFamily(value: String): Self = this.set("EngineFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineFamily: Self = this.set("EngineFamily", js.undefined)
    @scala.inline
    def setIdleClientTimeout(value: Integer): Self = this.set("IdleClientTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdleClientTimeout: Self = this.set("IdleClientTimeout", js.undefined)
    @scala.inline
    def setRequireTLS(value: Boolean): Self = this.set("RequireTLS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireTLS: Self = this.set("RequireTLS", js.undefined)
    @scala.inline
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setStatus(value: DBProxyStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUpdatedDate(value: TStamp): Self = this.set("UpdatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedDate: Self = this.set("UpdatedDate", js.undefined)
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = this.set("VpcSecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setVpcSecurityGroupIds(value: StringList): Self = this.set("VpcSecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSecurityGroupIds: Self = this.set("VpcSecurityGroupIds", js.undefined)
    @scala.inline
    def setVpcSubnetIdsVarargs(value: String*): Self = this.set("VpcSubnetIds", js.Array(value :_*))
    @scala.inline
    def setVpcSubnetIds(value: StringList): Self = this.set("VpcSubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSubnetIds: Self = this.set("VpcSubnetIds", js.undefined)
  }
  
}

