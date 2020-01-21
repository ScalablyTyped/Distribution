package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdFormatResult extends js.Object {
  /**
    * Information about the ID format for the resource.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.native
}

object DescribeIdFormatResult {
  @scala.inline
  def apply(Statuses: IdFormatList = null): DescribeIdFormatResult = {
    val __obj = js.Dynamic.literal()
    if (Statuses != null) __obj.updateDynamic("Statuses")(Statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdFormatResult]
  }
}

