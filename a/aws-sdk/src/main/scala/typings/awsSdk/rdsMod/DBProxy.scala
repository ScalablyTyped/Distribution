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
    * Currently, this value is always MYSQL. The engine family applies to both RDS MySQL and Aurora MySQL.
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
  def apply(
    Auth: UserAuthConfigInfoList = null,
    CreatedDate: TStamp = null,
    DBProxyArn: String = null,
    DBProxyName: String = null,
    DebugLogging: js.UndefOr[scala.Boolean] = js.undefined,
    Endpoint: String = null,
    EngineFamily: String = null,
    IdleClientTimeout: Int | scala.Double = null,
    RequireTLS: js.UndefOr[scala.Boolean] = js.undefined,
    RoleArn: String = null,
    Status: DBProxyStatus = null,
    UpdatedDate: TStamp = null,
    VpcSecurityGroupIds: StringList = null,
    VpcSubnetIds: StringList = null
  ): DBProxy = {
    val __obj = js.Dynamic.literal()
    if (Auth != null) __obj.updateDynamic("Auth")(Auth.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (DBProxyArn != null) __obj.updateDynamic("DBProxyArn")(DBProxyArn.asInstanceOf[js.Any])
    if (DBProxyName != null) __obj.updateDynamic("DBProxyName")(DBProxyName.asInstanceOf[js.Any])
    if (!js.isUndefined(DebugLogging)) __obj.updateDynamic("DebugLogging")(DebugLogging.asInstanceOf[js.Any])
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (EngineFamily != null) __obj.updateDynamic("EngineFamily")(EngineFamily.asInstanceOf[js.Any])
    if (IdleClientTimeout != null) __obj.updateDynamic("IdleClientTimeout")(IdleClientTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireTLS)) __obj.updateDynamic("RequireTLS")(RequireTLS.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UpdatedDate != null) __obj.updateDynamic("UpdatedDate")(UpdatedDate.asInstanceOf[js.Any])
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds.asInstanceOf[js.Any])
    if (VpcSubnetIds != null) __obj.updateDynamic("VpcSubnetIds")(VpcSubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBProxy]
  }
}

