package typings.awsSdkClientKmsNode.typesKeyListEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyListEntry extends js.Object {
  /**
    * <p>ARN of the key.</p>
    */
  var KeyArn: js.UndefOr[String] = js.native
  /**
    * <p>Unique identifier of the key.</p>
    */
  var KeyId: js.UndefOr[String] = js.native
}

object KeyListEntry {
  @scala.inline
  def apply(): KeyListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyListEntry]
  }
  @scala.inline
  implicit class KeyListEntryOps[Self <: KeyListEntry] (val x: Self) extends AnyVal {
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
    def setKeyArn(value: String): Self = this.set("KeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyArn: Self = this.set("KeyArn", js.undefined)
    @scala.inline
    def setKeyId(value: String): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
  }
  
}

