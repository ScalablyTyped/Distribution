package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(DBProxyName: String): ModifyDBProxyRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBProxyRequest]
  }
  
  @scala.inline
  implicit class ModifyDBProxyRequestOps[Self <: ModifyDBProxyRequest] (val x: Self) extends AnyVal {
    
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
    def setDBProxyName(value: String): Self = this.set("DBProxyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthVarargs(value: UserAuthConfig*): Self = this.set("Auth", js.Array(value :_*))
    
    @scala.inline
    def setAuth(value: UserAuthConfigList): Self = this.set("Auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("Auth", js.undefined)
    
    @scala.inline
    def setDebugLogging(value: BooleanOptional): Self = this.set("DebugLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugLogging: Self = this.set("DebugLogging", js.undefined)
    
    @scala.inline
    def setIdleClientTimeout(value: IntegerOptional): Self = this.set("IdleClientTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleClientTimeout: Self = this.set("IdleClientTimeout", js.undefined)
    
    @scala.inline
    def setNewDBProxyName(value: String): Self = this.set("NewDBProxyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewDBProxyName: Self = this.set("NewDBProxyName", js.undefined)
    
    @scala.inline
    def setRequireTLS(value: BooleanOptional): Self = this.set("RequireTLS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireTLS: Self = this.set("RequireTLS", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: StringList): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
  }
}
