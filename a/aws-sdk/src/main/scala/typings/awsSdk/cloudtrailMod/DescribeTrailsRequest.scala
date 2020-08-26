package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrailsRequest extends js.Object {
  /**
    * Specifies whether to include shadow trails in the response. A shadow trail is the replication in a region of a trail that was created in a different region, or in the case of an organization trail, the replication of an organization trail in member accounts. If you do not include shadow trails, organization trails in a member account and region replication trails will not be returned. The default is true.
    */
  var includeShadowTrails: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a list of trail names, trail ARNs, or both, of the trails to describe. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail  If an empty list is specified, information for the trail in the current region is returned.   If an empty list is specified and IncludeShadowTrails is false, then information for all trails in the current region is returned.   If an empty list is specified and IncludeShadowTrails is null or true, then information for all trails in the current region and any associated shadow trails in other regions is returned.    If one or more trail names are specified, information is returned only if the names match the names of trails belonging only to the current region. To return information about a trail in another region, you must specify its trail ARN. 
    */
  var trailNameList: js.UndefOr[TrailNameList] = js.native
}

object DescribeTrailsRequest {
  @scala.inline
  def apply(): DescribeTrailsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrailsRequest]
  }
  @scala.inline
  implicit class DescribeTrailsRequestOps[Self <: DescribeTrailsRequest] (val x: Self) extends AnyVal {
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
    def setIncludeShadowTrails(value: Boolean): Self = this.set("includeShadowTrails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeShadowTrails: Self = this.set("includeShadowTrails", js.undefined)
    @scala.inline
    def setTrailNameListVarargs(value: String*): Self = this.set("trailNameList", js.Array(value :_*))
    @scala.inline
    def setTrailNameList(value: TrailNameList): Self = this.set("trailNameList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailNameList: Self = this.set("trailNameList", js.undefined)
  }
  
}

