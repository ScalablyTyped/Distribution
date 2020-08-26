package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccessPointsResponse extends js.Object {
  /**
    * An array of access point descriptions.
    */
  var AccessPoints: js.UndefOr[AccessPointDescriptions] = js.native
  /**
    * Present if there are more access points than returned in the response. You can use the NextMarker in the subsequent request to fetch the additional descriptions.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object DescribeAccessPointsResponse {
  @scala.inline
  def apply(): DescribeAccessPointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccessPointsResponse]
  }
  @scala.inline
  implicit class DescribeAccessPointsResponseOps[Self <: DescribeAccessPointsResponse] (val x: Self) extends AnyVal {
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
    def setAccessPointsVarargs(value: AccessPointDescription*): Self = this.set("AccessPoints", js.Array(value :_*))
    @scala.inline
    def setAccessPoints(value: AccessPointDescriptions): Self = this.set("AccessPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessPoints: Self = this.set("AccessPoints", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

