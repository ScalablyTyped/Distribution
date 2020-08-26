package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOptionGroupMessage extends js.Object {
  /**
    * The name of the option group to be deleted.  You can't delete default option groups. 
    */
  var OptionGroupName: String = js.native
}

object DeleteOptionGroupMessage {
  @scala.inline
  def apply(OptionGroupName: String): DeleteOptionGroupMessage = {
    val __obj = js.Dynamic.literal(OptionGroupName = OptionGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOptionGroupMessage]
  }
  @scala.inline
  implicit class DeleteOptionGroupMessageOps[Self <: DeleteOptionGroupMessage] (val x: Self) extends AnyVal {
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
    def setOptionGroupName(value: String): Self = this.set("OptionGroupName", value.asInstanceOf[js.Any])
  }
  
}

