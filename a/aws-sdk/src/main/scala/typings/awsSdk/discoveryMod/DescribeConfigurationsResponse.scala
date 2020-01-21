package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationsResponse extends js.Object {
  /**
    * A key in the response map. The value is an array of data.
    */
  var configurations: js.UndefOr[DescribeConfigurationsAttributes] = js.native
}

object DescribeConfigurationsResponse {
  @scala.inline
  def apply(configurations: DescribeConfigurationsAttributes = null): DescribeConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (configurations != null) __obj.updateDynamic("configurations")(configurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationsResponse]
  }
}

