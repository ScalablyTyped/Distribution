package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFilterResponse extends js.Object {
  /**
    * The ARN of the new filter.
    */
  var filterArn: js.UndefOr[Arn] = js.native
}

object CreateFilterResponse {
  @scala.inline
  def apply(filterArn: Arn = null): CreateFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (filterArn != null) __obj.updateDynamic("filterArn")(filterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFilterResponse]
  }
}

