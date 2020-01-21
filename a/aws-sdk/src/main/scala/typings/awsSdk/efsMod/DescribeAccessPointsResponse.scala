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
  def apply(AccessPoints: AccessPointDescriptions = null, NextToken: Token = null): DescribeAccessPointsResponse = {
    val __obj = js.Dynamic.literal()
    if (AccessPoints != null) __obj.updateDynamic("AccessPoints")(AccessPoints.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccessPointsResponse]
  }
}

