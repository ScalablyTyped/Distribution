package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateResourceShareRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The principals.
    */
  var principals: js.UndefOr[PrincipalArnOrIdList] = js.native
  /**
    * The Amazon Resource Names (ARN) of the resources.
    */
  var resourceArns: js.UndefOr[ResourceArnList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: String = js.native
}

object AssociateResourceShareRequest {
  @scala.inline
  def apply(
    resourceShareArn: String,
    clientToken: String = null,
    principals: PrincipalArnOrIdList = null,
    resourceArns: ResourceArnList = null
  ): AssociateResourceShareRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (principals != null) __obj.updateDynamic("principals")(principals.asInstanceOf[js.Any])
    if (resourceArns != null) __obj.updateDynamic("resourceArns")(resourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResourceShareRequest]
  }
}

