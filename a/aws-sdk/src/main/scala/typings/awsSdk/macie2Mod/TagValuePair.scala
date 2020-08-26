package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagValuePair extends js.Object {
  /**
    * The value for the tag key to use in the condition.
    */
  var key: js.UndefOr[string] = js.native
  /**
    * The tag value, associated with the specified tag key, to use in the condition.
    */
  var value: js.UndefOr[string] = js.native
}

object TagValuePair {
  @scala.inline
  def apply(): TagValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagValuePair]
  }
  @scala.inline
  implicit class TagValuePairOps[Self <: TagValuePair] (val x: Self) extends AnyVal {
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
    def setKey(value: string): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValue(value: string): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

