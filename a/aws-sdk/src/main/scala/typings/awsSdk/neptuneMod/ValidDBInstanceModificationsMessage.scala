package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidDBInstanceModificationsMessage extends js.Object {
  /**
    * Valid storage options for your DB instance.
    */
  var Storage: js.UndefOr[ValidStorageOptionsList] = js.native
}

object ValidDBInstanceModificationsMessage {
  @scala.inline
  def apply(): ValidDBInstanceModificationsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidDBInstanceModificationsMessage]
  }
  @scala.inline
  implicit class ValidDBInstanceModificationsMessageOps[Self <: ValidDBInstanceModificationsMessage] (val x: Self) extends AnyVal {
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
    def setStorageVarargs(value: ValidStorageOptions*): Self = this.set("Storage", js.Array(value :_*))
    @scala.inline
    def setStorage(value: ValidStorageOptionsList): Self = this.set("Storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("Storage", js.undefined)
  }
  
}

