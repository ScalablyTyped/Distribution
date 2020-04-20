package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkteamResponse extends js.Object {
  /**
    * A Workteam instance that contains information about the work team. 
    */
  var Workteam: typings.awsSdk.sagemakerMod.Workteam = js.native
}

object DescribeWorkteamResponse {
  @scala.inline
  def apply(Workteam: Workteam): DescribeWorkteamResponse = {
    val __obj = js.Dynamic.literal(Workteam = Workteam.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkteamResponse]
  }
}

