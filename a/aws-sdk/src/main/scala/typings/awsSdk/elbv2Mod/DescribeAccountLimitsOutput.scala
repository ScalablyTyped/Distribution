package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountLimitsOutput extends js.Object {
  /**
    * Information about the limits.
    */
  var Limits: js.UndefOr[typings.awsSdk.elbv2Mod.Limits] = js.native
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object DescribeAccountLimitsOutput {
  @scala.inline
  def apply(): DescribeAccountLimitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountLimitsOutput]
  }
  @scala.inline
  implicit class DescribeAccountLimitsOutputOps[Self <: DescribeAccountLimitsOutput] (val x: Self) extends AnyVal {
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
    def setLimitsVarargs(value: Limit*): Self = this.set("Limits", js.Array(value :_*))
    @scala.inline
    def setLimits(value: Limits): Self = this.set("Limits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimits: Self = this.set("Limits", js.undefined)
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

