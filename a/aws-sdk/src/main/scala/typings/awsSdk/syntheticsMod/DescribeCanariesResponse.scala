package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCanariesResponse extends js.Object {
  /**
    * Returns an array. Each item in the array contains the full information about one canary.
    */
  var Canaries: js.UndefOr[typings.awsSdk.syntheticsMod.Canaries] = js.native
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeCanaries operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object DescribeCanariesResponse {
  @scala.inline
  def apply(Canaries: Canaries = null, NextToken: Token = null): DescribeCanariesResponse = {
    val __obj = js.Dynamic.literal()
    if (Canaries != null) __obj.updateDynamic("Canaries")(Canaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCanariesResponse]
  }
}

