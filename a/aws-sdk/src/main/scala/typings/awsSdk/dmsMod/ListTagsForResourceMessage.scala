package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the AWS DMS resource.
    */
  var ResourceArn: String = js.native
}

object ListTagsForResourceMessage {
  @scala.inline
  def apply(ResourceArn: String): ListTagsForResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceMessage]
  }
  @scala.inline
  implicit class ListTagsForResourceMessageOps[Self <: ListTagsForResourceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceArn(value: String): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
  }
  
}

