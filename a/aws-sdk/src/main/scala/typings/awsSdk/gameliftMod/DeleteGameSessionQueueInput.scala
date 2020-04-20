package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGameSessionQueueInput extends js.Object {
  /**
    * A descriptive label that is associated with game session queue. Queue names must be unique within each Region. You can use either the queue ID or ARN value. 
    */
  var Name: GameSessionQueueNameOrArn = js.native
}

object DeleteGameSessionQueueInput {
  @scala.inline
  def apply(Name: GameSessionQueueNameOrArn): DeleteGameSessionQueueInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGameSessionQueueInput]
  }
}

