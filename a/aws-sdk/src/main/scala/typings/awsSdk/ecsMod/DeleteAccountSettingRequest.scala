package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccountSettingRequest extends StObject {
  
  /**
    * The resource name for which to disable the account setting. If serviceLongArnFormat is specified, the ARN for your Amazon ECS services is affected. If taskLongArnFormat is specified, the ARN and resource ID for your Amazon ECS tasks is affected. If containerInstanceLongArnFormat is specified, the ARN and resource ID for your Amazon ECS container instances is affected. If awsvpcTrunking is specified, the ENI limit for your Amazon ECS container instances is affected.
    */
  var name: SettingName
  
  /**
    * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If you specify the root user, it disables the account setting for all IAM users, IAM roles, and the root user of the account unless an IAM user or role explicitly overrides these settings. If this field is omitted, the setting is changed only for the authenticated user.
    */
  var principalArn: js.UndefOr[String] = js.undefined
}
object DeleteAccountSettingRequest {
  
  @scala.inline
  def apply(name: SettingName): DeleteAccountSettingRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccountSettingRequest]
  }
  
  @scala.inline
  implicit class DeleteAccountSettingRequestMutableBuilder[Self <: DeleteAccountSettingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SettingName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalArn(value: String): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalArnUndefined: Self = StObject.set(x, "principalArn", js.undefined)
  }
}
