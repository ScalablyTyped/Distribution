package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagInput extends js.Object {
  /**
    * The ARN of the resource group from which to remove tags. The command removed both the specified keys and any values associated with those keys.
    */
  var Arn: GroupArn = js.native
  /**
    * The keys of the tags to be removed.
    */
  var Keys: TagKeyList = js.native
}

object UntagInput {
  @scala.inline
  def apply(Arn: GroupArn, Keys: TagKeyList): UntagInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagInput]
  }
  @scala.inline
  implicit class UntagInputOps[Self <: UntagInput] (val x: Self) extends AnyVal {
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
    def setKeysVarargs(value: TagKey*): Self = this.set("Keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: TagKeyList): Self = this.set("Keys", value.asInstanceOf[js.Any])
  }
  
}

