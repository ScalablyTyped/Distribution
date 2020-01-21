package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBProxyRequest extends js.Object {
  /**
    * The new authentication settings for the DBProxy.
    */
  var Auth: js.UndefOr[UserAuthConfigList] = js.native
  /**
    * The identifier for the DBProxy to modify.
    */
  var DBProxyName: String = js.native
  /**
    * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
    */
  var DebugLogging: js.UndefOr[BooleanOptional] = js.native
  /**
    * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
    */
  var IdleClientTimeout: js.UndefOr[IntegerOptional] = js.native
  /**
    * The new identifier for the DBProxy. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  var NewDBProxyName: js.UndefOr[String] = js.native
  /**
    * Whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy, even if the associated database doesn't use TLS.
    */
  var RequireTLS: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
    */
  var RoleArn: js.UndefOr[String] = js.native
  /**
    * The new list of security groups for the DBProxy.
    */
  var SecurityGroups: js.UndefOr[StringList] = js.native
}

object ModifyDBProxyRequest {
  @scala.inline
  def apply(
    DBProxyName: String,
    Auth: UserAuthConfigList = null,
    DebugLogging: js.UndefOr[scala.Boolean] = js.undefined,
    IdleClientTimeout: Int | scala.Double = null,
    NewDBProxyName: String = null,
    RequireTLS: js.UndefOr[scala.Boolean] = js.undefined,
    RoleArn: String = null,
    SecurityGroups: StringList = null
  ): ModifyDBProxyRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    if (Auth != null) __obj.updateDynamic("Auth")(Auth.asInstanceOf[js.Any])
    if (!js.isUndefined(DebugLogging)) __obj.updateDynamic("DebugLogging")(DebugLogging.asInstanceOf[js.Any])
    if (IdleClientTimeout != null) __obj.updateDynamic("IdleClientTimeout")(IdleClientTimeout.asInstanceOf[js.Any])
    if (NewDBProxyName != null) __obj.updateDynamic("NewDBProxyName")(NewDBProxyName.asInstanceOf[js.Any])
    if (!js.isUndefined(RequireTLS)) __obj.updateDynamic("RequireTLS")(RequireTLS.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBProxyRequest]
  }
}

