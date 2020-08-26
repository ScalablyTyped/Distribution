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
  @scala.inline
  implicit class DeleteGameSessionQueueInputOps[Self <: DeleteGameSessionQueueInput] (val x: Self) extends AnyVal {
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
    def setName(value: GameSessionQueueNameOrArn): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

