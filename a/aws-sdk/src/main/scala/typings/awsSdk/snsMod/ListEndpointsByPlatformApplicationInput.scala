package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointsByPlatformApplicationInput extends js.Object {
  /**
    * NextToken string is used when calling ListEndpointsByPlatformApplication action to retrieve additional records that are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * PlatformApplicationArn for ListEndpointsByPlatformApplicationInput action.
    */
  var PlatformApplicationArn: String = js.native
}

object ListEndpointsByPlatformApplicationInput {
  @scala.inline
  def apply(PlatformApplicationArn: String, NextToken: String = null): ListEndpointsByPlatformApplicationInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointsByPlatformApplicationInput]
  }
}

