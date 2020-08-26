package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAttribute extends js.Object {
  /**
    *  The maximum allowed value. 
    */
  var Maximum: js.UndefOr[Integer] = js.native
  /**
    *  The attribute name. The following are supported attribute names.     ServerLimit: The number of current servers/maximum number of servers allowed. By default, you can have a maximum of 10 servers.     ManualBackupLimit: The number of current manual backups/maximum number of backups allowed. By default, you can have a maximum of 50 manual backups saved.   
    */
  var Name: js.UndefOr[String] = js.native
  /**
    *  The current usage, such as the current number of servers that are associated with the account. 
    */
  var Used: js.UndefOr[Integer] = js.native
}

object AccountAttribute {
  @scala.inline
  def apply(): AccountAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttribute]
  }
  @scala.inline
  implicit class AccountAttributeOps[Self <: AccountAttribute] (val x: Self) extends AnyVal {
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
    def setMaximum(value: Integer): Self = this.set("Maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("Maximum", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setUsed(value: Integer): Self = this.set("Used", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsed: Self = this.set("Used", js.undefined)
  }
  
}

