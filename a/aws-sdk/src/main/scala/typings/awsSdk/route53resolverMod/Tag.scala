package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The name for the tag. For example, if you want to associate Resolver resources with the account IDs of your customers for billing purposes, the value of Key might be account-id.
    */
  var Key: js.UndefOr[TagKey] = js.native
  /**
    * The value for the tag. For example, if Key is account-id, then Value might be the ID of the customer account that you're creating the resource for.
    */
  var Value: js.UndefOr[TagValue] = js.native
}

object Tag {
  @scala.inline
  def apply(): Tag = {
    val __obj = js.Dynamic.literal()
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
    def setKey(value: TagKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setValue(value: TagValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

