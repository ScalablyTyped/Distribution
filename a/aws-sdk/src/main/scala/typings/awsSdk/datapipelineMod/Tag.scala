package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The key name of a tag defined by a user. For more information, see Controlling User Access to Pipelines in the AWS Data Pipeline Developer Guide.
    */
  var key: tagKey = js.native
  /**
    * The optional value portion of a tag defined by a user. For more information, see Controlling User Access to Pipelines in the AWS Data Pipeline Developer Guide.
    */
  var value: tagValue = js.native
}

object Tag {
  @scala.inline
  def apply(key: tagKey, value: tagValue): Tag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
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
    def setKey(value: tagKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: tagValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

