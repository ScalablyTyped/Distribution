package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the fleet was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  /**
    * The name of the fleet.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The list of all tags added to the fleet.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateFleetResponse {
  @scala.inline
  def apply(): CreateFleetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetResponse]
  }
  @scala.inline
  implicit class CreateFleetResponseOps[Self <: CreateFleetResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

