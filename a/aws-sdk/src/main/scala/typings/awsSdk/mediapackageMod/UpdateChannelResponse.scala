package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChannelResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the Channel.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[string] = js.native
  var HlsIngest: js.UndefOr[typings.awsSdk.mediapackageMod.HlsIngest] = js.native
  /**
    * The ID of the Channel.
    */
  var Id: js.UndefOr[string] = js.native
  var Tags: js.UndefOr[typings.awsSdk.mediapackageMod.Tags] = js.native
}

object UpdateChannelResponse {
  @scala.inline
  def apply(): UpdateChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChannelResponse]
  }
  @scala.inline
  implicit class UpdateChannelResponseOps[Self <: UpdateChannelResponse] (val x: Self) extends AnyVal {
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
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setHlsIngest(value: HlsIngest): Self = this.set("HlsIngest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHlsIngest: Self = this.set("HlsIngest", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

