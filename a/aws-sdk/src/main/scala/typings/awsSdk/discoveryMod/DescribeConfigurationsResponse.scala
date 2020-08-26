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
  def apply(): DescribeConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationsResponse]
  }
  @scala.inline
  implicit class DescribeConfigurationsResponseOps[Self <: DescribeConfigurationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurationsVarargs(value: DescribeConfigurationsAttribute*): Self = this.set("configurations", js.Array(value :_*))
    @scala.inline
    def setConfigurations(value: DescribeConfigurationsAttributes): Self = this.set("configurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurations: Self = this.set("configurations", js.undefined)
  }
  
}

