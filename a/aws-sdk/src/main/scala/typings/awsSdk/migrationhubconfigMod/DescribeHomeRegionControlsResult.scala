package typings.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHomeRegionControlsResult extends js.Object {
  /**
    * An array that contains your HomeRegionControl objects.
    */
  var HomeRegionControls: js.UndefOr[typings.awsSdk.migrationhubconfigMod.HomeRegionControls] = js.native
  /**
    * If a NextToken was returned by a previous call, more results are available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object DescribeHomeRegionControlsResult {
  @scala.inline
  def apply(): DescribeHomeRegionControlsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHomeRegionControlsResult]
  }
  @scala.inline
  implicit class DescribeHomeRegionControlsResultOps[Self <: DescribeHomeRegionControlsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHomeRegionControlsVarargs(value: HomeRegionControl*): Self = this.set("HomeRegionControls", js.Array(value :_*))
    @scala.inline
    def setHomeRegionControls(value: HomeRegionControls): Self = this.set("HomeRegionControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeRegionControls: Self = this.set("HomeRegionControls", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

