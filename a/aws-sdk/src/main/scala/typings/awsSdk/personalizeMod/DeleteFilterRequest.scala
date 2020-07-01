package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFilterRequest extends js.Object {
  /**
    * The ARN of the filter to delete.
    */
  var filterArn: Arn = js.native
}

object DeleteFilterRequest {
  @scala.inline
  def apply(filterArn: Arn): DeleteFilterRequest = {
    val __obj = js.Dynamic.literal(filterArn = filterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilterRequest]
  }
}

