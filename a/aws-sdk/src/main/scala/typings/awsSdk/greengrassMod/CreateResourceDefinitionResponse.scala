package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceDefinitionResponse extends js.Object {
  /**
    * The ARN of the definition.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the definition was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.native
  /**
    * The ID of the definition.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the definition was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[string] = js.native
  /**
    * The ID of the latest version associated with the definition.
    */
  var LatestVersion: js.UndefOr[string] = js.native
  /**
    * The ARN of the latest version associated with the definition.
    */
  var LatestVersionArn: js.UndefOr[string] = js.native
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.native
}

object CreateResourceDefinitionResponse {
  @scala.inline
  def apply(): CreateResourceDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResourceDefinitionResponse]
  }
  @scala.inline
  implicit class CreateResourceDefinitionResponseOps[Self <: CreateResourceDefinitionResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreationTimestamp(value: string): Self = this.set("CreationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("CreationTimestamp", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setLastUpdatedTimestamp(value: string): Self = this.set("LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("LastUpdatedTimestamp", js.undefined)
    @scala.inline
    def setLatestVersion(value: string): Self = this.set("LatestVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestVersion: Self = this.set("LatestVersion", js.undefined)
    @scala.inline
    def setLatestVersionArn(value: string): Self = this.set("LatestVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestVersionArn: Self = this.set("LatestVersionArn", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

