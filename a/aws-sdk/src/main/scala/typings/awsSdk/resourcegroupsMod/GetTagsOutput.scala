package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagsOutput extends js.Object {
  /**
    * The ARN of the tagged resource group.
    */
  var Arn: js.UndefOr[GroupArn] = js.native
  /**
    * The tags associated with the specified resource group.
    */
  var Tags: js.UndefOr[typings.awsSdk.resourcegroupsMod.Tags] = js.native
}

object GetTagsOutput {
  @scala.inline
  def apply(): GetTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagsOutput]
  }
  @scala.inline
  implicit class GetTagsOutputOps[Self <: GetTagsOutput] (val x: Self) extends AnyVal {
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

