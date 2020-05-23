package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsService extends js.Object {
  /**
    * Reserved for future use.
    */
  var invokedBy: js.UndefOr[string] = js.native
}

object AwsService {
  @scala.inline
  def apply(invokedBy: string = null): AwsService = {
    val __obj = js.Dynamic.literal()
    if (invokedBy != null) __obj.updateDynamic("invokedBy")(invokedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsService]
  }
}

