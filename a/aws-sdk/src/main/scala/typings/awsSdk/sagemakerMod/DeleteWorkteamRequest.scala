package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkteamRequest extends js.Object {
  /**
    * The name of the work team to delete.
    */
  var WorkteamName: typings.awsSdk.sagemakerMod.WorkteamName = js.native
}

object DeleteWorkteamRequest {
  @scala.inline
  def apply(WorkteamName: WorkteamName): DeleteWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkteamRequest]
  }
}

