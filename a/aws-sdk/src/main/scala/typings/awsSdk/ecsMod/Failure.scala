package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Failure extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the failed resource.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * The details of the failure.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * The reason for the failure.
    */
  var reason: js.UndefOr[String] = js.native
}

object Failure {
  @scala.inline
  def apply(arn: String = null, detail: String = null, reason: String = null): Failure = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failure]
  }
}

