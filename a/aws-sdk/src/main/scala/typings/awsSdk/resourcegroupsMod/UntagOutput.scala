package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagOutput extends js.Object {
  /**
    * The ARN of the resource group from which tags have been removed.
    */
  var Arn: js.UndefOr[GroupArn] = js.native
  /**
    * The keys of the tags that were removed.
    */
  var Keys: js.UndefOr[TagKeyList] = js.native
}

object UntagOutput {
  @scala.inline
  def apply(): UntagOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagOutput]
  }
  @scala.inline
  implicit class UntagOutputOps[Self <: UntagOutput] (val x: Self) extends AnyVal {
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
    def setKeysVarargs(value: TagKey*): Self = this.set("Keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: TagKeyList): Self = this.set("Keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("Keys", js.undefined)
  }
  
}

