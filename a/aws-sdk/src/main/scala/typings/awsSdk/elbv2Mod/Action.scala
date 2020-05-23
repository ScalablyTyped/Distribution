package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
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
    * The order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. The last action to be performed must be one of the following types of actions: a forward, fixed-response, or redirect.
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
  def apply(
    Type: ActionTypeEnum,
    AuthenticateCognitoConfig: AuthenticateCognitoActionConfig = null,
    AuthenticateOidcConfig: AuthenticateOidcActionConfig = null,
    FixedResponseConfig: FixedResponseActionConfig = null,
    ForwardConfig: ForwardActionConfig = null,
    Order: js.UndefOr[ActionOrder] = js.undefined,
    RedirectConfig: RedirectActionConfig = null,
    TargetGroupArn: TargetGroupArn = null
  ): Action = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (AuthenticateCognitoConfig != null) __obj.updateDynamic("AuthenticateCognitoConfig")(AuthenticateCognitoConfig.asInstanceOf[js.Any])
    if (AuthenticateOidcConfig != null) __obj.updateDynamic("AuthenticateOidcConfig")(AuthenticateOidcConfig.asInstanceOf[js.Any])
    if (FixedResponseConfig != null) __obj.updateDynamic("FixedResponseConfig")(FixedResponseConfig.asInstanceOf[js.Any])
    if (ForwardConfig != null) __obj.updateDynamic("ForwardConfig")(ForwardConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(Order)) __obj.updateDynamic("Order")(Order.get.asInstanceOf[js.Any])
    if (RedirectConfig != null) __obj.updateDynamic("RedirectConfig")(RedirectConfig.asInstanceOf[js.Any])
    if (TargetGroupArn != null) __obj.updateDynamic("TargetGroupArn")(TargetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

