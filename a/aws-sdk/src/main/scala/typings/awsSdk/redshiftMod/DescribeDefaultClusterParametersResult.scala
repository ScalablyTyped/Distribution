package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDefaultClusterParametersResult extends js.Object {
  var DefaultClusterParameters: js.UndefOr[typings.awsSdk.redshiftMod.DefaultClusterParameters] = js.native
}

object DescribeDefaultClusterParametersResult {
  @scala.inline
  def apply(DefaultClusterParameters: DefaultClusterParameters = null): DescribeDefaultClusterParametersResult = {
    val __obj = js.Dynamic.literal()
    if (DefaultClusterParameters != null) __obj.updateDynamic("DefaultClusterParameters")(DefaultClusterParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDefaultClusterParametersResult]
  }
}

