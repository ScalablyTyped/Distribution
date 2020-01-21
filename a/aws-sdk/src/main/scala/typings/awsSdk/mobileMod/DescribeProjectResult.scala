package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectResult extends js.Object {
  var details: js.UndefOr[ProjectDetails] = js.native
}

object DescribeProjectResult {
  @scala.inline
  def apply(details: ProjectDetails = null): DescribeProjectResult = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectResult]
  }
}

