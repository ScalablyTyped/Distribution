package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFindingsFilterResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the filter that was updated.
    */
  var arn: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the filter that was updated.
    */
  var id: js.UndefOr[string] = js.native
}

object UpdateFindingsFilterResponse {
  @scala.inline
  def apply(arn: string = null, id: string = null): UpdateFindingsFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsFilterResponse]
  }
}

