package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to list tags for. To get the ARN, send a GET request with the resource name.
    */
  var Arn: string = js.native
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(Arn: string): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  @scala.inline
  implicit class ListTagsForResourceRequestOps[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
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
  }
  
}

