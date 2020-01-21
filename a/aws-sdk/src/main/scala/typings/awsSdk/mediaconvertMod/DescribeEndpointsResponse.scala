package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointsResponse extends js.Object {
  /**
    * List of endpoints
    */
  var Endpoints: js.UndefOr[listOfEndpoint] = js.native
  /**
    * Use this string to request the next batch of endpoints.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object DescribeEndpointsResponse {
  @scala.inline
  def apply(Endpoints: listOfEndpoint = null, NextToken: string = null): DescribeEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointsResponse]
  }
}

