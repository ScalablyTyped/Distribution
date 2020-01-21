package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterVersionRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon EKS cluster to update.
    */
  var name: String = js.native
  /**
    * The desired Kubernetes version following a successful update.
    */
  var version: String = js.native
}

object UpdateClusterVersionRequest {
  @scala.inline
  def apply(name: String, version: String, clientRequestToken: String = null): UpdateClusterVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterVersionRequest]
  }
}

