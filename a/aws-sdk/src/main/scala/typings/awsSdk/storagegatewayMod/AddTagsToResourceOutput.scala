package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToResourceOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource you want to add tags to.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.storagegatewayMod.ResourceARN] = js.native
}

object AddTagsToResourceOutput {
  @scala.inline
  def apply(): AddTagsToResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTagsToResourceOutput]
  }
  @scala.inline
  implicit class AddTagsToResourceOutputOps[Self <: AddTagsToResourceOutput] (val x: Self) extends AnyVal {
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
    def setResourceARN(value: ResourceARN): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceARN: Self = this.set("ResourceARN", js.undefined)
  }
  
}

