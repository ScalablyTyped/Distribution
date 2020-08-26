package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDiscovererResponse extends js.Object {
  /**
    * The description of the discoverer.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The ARN of the discoverer.
    */
  var DiscovererArn: js.UndefOr[string] = js.native
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[string] = js.native
  /**
    * The ARN of the event bus.
    */
  var SourceArn: js.UndefOr[string] = js.native
  /**
    * The state of the discoverer.
    */
  var State: js.UndefOr[DiscovererState] = js.native
  /**
    * Tags associated with the resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.native
}

object UpdateDiscovererResponse {
  @scala.inline
  def apply(): UpdateDiscovererResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDiscovererResponse]
  }
  @scala.inline
  implicit class UpdateDiscovererResponseOps[Self <: UpdateDiscovererResponse] (val x: Self) extends AnyVal {
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
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDiscovererArn(value: string): Self = this.set("DiscovererArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscovererArn: Self = this.set("DiscovererArn", js.undefined)
    @scala.inline
    def setDiscovererId(value: string): Self = this.set("DiscovererId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscovererId: Self = this.set("DiscovererId", js.undefined)
    @scala.inline
    def setSourceArn(value: string): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceArn: Self = this.set("SourceArn", js.undefined)
    @scala.inline
    def setState(value: DiscovererState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

