package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameSessionQueueDestination extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is assigned to fleet or fleet alias. ARNs, which include a fleet ID or alias ID and a Region name, provide a unique identifier across all Regions. 
    */
  var DestinationArn: js.UndefOr[ArnStringModel] = js.native
}

object GameSessionQueueDestination {
  @scala.inline
  def apply(DestinationArn: ArnStringModel = null): GameSessionQueueDestination = {
    val __obj = js.Dynamic.literal()
    if (DestinationArn != null) __obj.updateDynamic("DestinationArn")(DestinationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionQueueDestination]
  }
}

