package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkteamResponse extends js.Object {
  /**
    * A Workteam object that describes the updated work team.
    */
  var Workteam: typings.awsSdk.sagemakerMod.Workteam = js.native
}

object UpdateWorkteamResponse {
  @scala.inline
  def apply(Workteam: Workteam): UpdateWorkteamResponse = {
    val __obj = js.Dynamic.literal(Workteam = Workteam.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkteamResponse]
  }
}

