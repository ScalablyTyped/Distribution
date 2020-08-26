package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the Amazon SWF domain.
    */
  var resourceArn: Arn = js.native
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(resourceArn: Arn): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  @scala.inline
  implicit class ListTagsForResourceInputOps[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: Arn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
  }
  
}

