package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrafficMirrorFiltersResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about one or more Traffic Mirror filters.
    */
  var TrafficMirrorFilters: js.UndefOr[TrafficMirrorFilterSet] = js.native
}

object DescribeTrafficMirrorFiltersResult {
  @scala.inline
  def apply(): DescribeTrafficMirrorFiltersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficMirrorFiltersResult]
  }
  @scala.inline
  implicit class DescribeTrafficMirrorFiltersResultOps[Self <: DescribeTrafficMirrorFiltersResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTrafficMirrorFiltersVarargs(value: TrafficMirrorFilter*): Self = this.set("TrafficMirrorFilters", js.Array(value :_*))
    @scala.inline
    def setTrafficMirrorFilters(value: TrafficMirrorFilterSet): Self = this.set("TrafficMirrorFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficMirrorFilters: Self = this.set("TrafficMirrorFilters", js.undefined)
  }
  
}

