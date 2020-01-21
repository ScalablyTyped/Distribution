package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBProxyRequest extends js.Object {
  /**
    * The authorization mechanism that the proxy uses.
    */
  var Auth: UserAuthConfigList = js.native
  /**
    * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  var DBProxyName: String = js.native
  /**
    * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
    */
  var DebugLogging: js.UndefOr[Boolean] = js.native
  /**
    * The kinds of databases that the proxy can connect to. This value determines which database network protocol the proxy recognizes when it interprets network traffic to and from the database. Currently, this value is always MYSQL. The engine family applies to both RDS MySQL and Aurora MySQL.
    */
  var EngineFamily: typings.awsSdk.rdsMod.EngineFamily = js.native
  /**
    * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
    */
  var IdleClientTimeout: js.UndefOr[IntegerOptional] = js.native
  /**
    * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
    */
  var RequireTLS: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
    */
  var RoleArn: String = js.native
  /**
    * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * One or more VPC security group IDs to associate with the new proxy.
    */
  var VpcSecurityGroupIds: js.UndefOr[StringList] = js.native
  /**
    * One or more VPC subnet IDs to associate with the new proxy.
    */
  var VpcSubnetIds: StringList = js.native
}

object CreateDBProxyRequest {
  @scala.inline
  def apply(
    Auth: UserAuthConfigList,
    DBProxyName: String,
    EngineFamily: EngineFamily,
    RoleArn: String,
    VpcSubnetIds: StringList,
    DebugLogging: js.UndefOr[scala.Boolean] = js.undefined,
    IdleClientTimeout: Int | scala.Double = null,
    RequireTLS: js.UndefOr[scala.Boolean] = js.undefined,
    Tags: TagList = null,
    VpcSecurityGroupIds: StringList = null
  ): CreateDBProxyRequest = {
    val __obj = js.Dynamic.literal(Auth = Auth.asInstanceOf[js.Any], DBProxyName = DBProxyName.asInstanceOf[js.Any], EngineFamily = EngineFamily.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], VpcSubnetIds = VpcSubnetIds.asInstanceOf[js.Any])
    if (!js.isUndefined(DebugLogging)) __obj.updateDynamic("DebugLogging")(DebugLogging.asInstanceOf[js.Any])
    if (IdleClientTimeout != null) __obj.updateDynamic("IdleClientTimeout")(IdleClientTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireTLS)) __obj.updateDynamic("RequireTLS")(RequireTLS.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBProxyRequest]
  }
}

