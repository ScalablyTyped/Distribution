package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagOutput extends js.Object {
  /**
    * The ARN of the tagged resource.
    */
  var Arn: js.UndefOr[GroupArn] = js.native
  /**
    * The tags that have been added to the specified resource group.
    */
  var Tags: js.UndefOr[typings.awsSdk.resourcegroupsMod.Tags] = js.native
}

object TagOutput {
  @scala.inline
  def apply(): TagOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOutput]
  }
  @scala.inline
  implicit class TagOutputOps[Self <: TagOutput] (val x: Self) extends AnyVal {
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
    def setArn(value: GroupArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

