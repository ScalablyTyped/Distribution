package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserByPrincipalIdRequest extends js.Object {
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace = js.native
  /**
    * The principal ID of the user.
    */
  var PrincipalId: String = js.native
}

object DeleteUserByPrincipalIdRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, Namespace: Namespace, PrincipalId: String): DeleteUserByPrincipalIdRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], PrincipalId = PrincipalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserByPrincipalIdRequest]
  }
}

