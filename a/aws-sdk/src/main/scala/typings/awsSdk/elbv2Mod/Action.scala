package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends StObject {
  
  /**
    * [HTTPS listeners] Information for using Amazon Cognito to authenticate users. Specify only when Type is authenticate-cognito.
    */
  var AuthenticateCognitoConfig: js.UndefOr[AuthenticateCognitoActionConfig] = js.native
  
  /**
    * [HTTPS listeners] Information about an identity provider that is compliant with OpenID Connect (OIDC). Specify only when Type is authenticate-oidc.
    */
  var AuthenticateOidcConfig: js.UndefOr[AuthenticateOidcActionConfig] = js.native
  
  /**
    * [Application Load Balancer] Information for creating an action that returns a custom HTTP response. Specify only when Type is fixed-response.
    */
  var FixedResponseConfig: js.UndefOr[FixedResponseActionConfig] = js.native
  
  /**
    * Information for creating an action that distributes requests among one or more target groups. For Network Load Balancers, you can specify a single target group. Specify only when Type is forward. If you specify both ForwardConfig and TargetGroupArn, you can specify only one target group using ForwardConfig and it must be the same target group specified in TargetGroupArn.
    */
  var ForwardConfig: js.UndefOr[ForwardActionConfig] = js.native
  
  /**
    * The order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first.
    */
  var Order: js.UndefOr[ActionOrder] = js.native
  
  /**
    * [Application Load Balancer] Information for creating a redirect action. Specify only when Type is redirect.
    */
  var RedirectConfig: js.UndefOr[RedirectActionConfig] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the target group. Specify only when Type is forward and you want to route to a single target group. To route to one or more target groups, use ForwardConfig instead.
    */
  var TargetGroupArn: js.UndefOr[typings.awsSdk.elbv2Mod.TargetGroupArn] = js.native
  
  /**
    * The type of action.
    */
  var Type: ActionTypeEnum = js.native
}
object Action {
  
  @scala.inline
  def apply(Type: ActionTypeEnum): Action = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticateCognitoConfig(value: AuthenticateCognitoActionConfig): Self = StObject.set(x, "AuthenticateCognitoConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticateCognitoConfigUndefined: Self = StObject.set(x, "AuthenticateCognitoConfig", js.undefined)
    
    @scala.inline
    def setAuthenticateOidcConfig(value: AuthenticateOidcActionConfig): Self = StObject.set(x, "AuthenticateOidcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticateOidcConfigUndefined: Self = StObject.set(x, "AuthenticateOidcConfig", js.undefined)
    
    @scala.inline
    def setFixedResponseConfig(value: FixedResponseActionConfig): Self = StObject.set(x, "FixedResponseConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedResponseConfigUndefined: Self = StObject.set(x, "FixedResponseConfig", js.undefined)
    
    @scala.inline
    def setForwardConfig(value: ForwardActionConfig): Self = StObject.set(x, "ForwardConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardConfigUndefined: Self = StObject.set(x, "ForwardConfig", js.undefined)
    
    @scala.inline
    def setOrder(value: ActionOrder): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "Order", js.undefined)
    
    @scala.inline
    def setRedirectConfig(value: RedirectActionConfig): Self = StObject.set(x, "RedirectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectConfigUndefined: Self = StObject.set(x, "RedirectConfig", js.undefined)
    
    @scala.inline
    def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupArnUndefined: Self = StObject.set(x, "TargetGroupArn", js.undefined)
    
    @scala.inline
    def setType(value: ActionTypeEnum): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
