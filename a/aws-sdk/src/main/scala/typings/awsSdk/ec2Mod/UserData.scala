package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserData extends js.Object {
  /**
    * The user data. If you are using an AWS SDK or command line tool, Base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide Base64-encoded text.
    */
  var Data: js.UndefOr[String] = js.native
}

object UserData {
  @scala.inline
  def apply(): UserData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserData]
  }
  @scala.inline
  implicit class UserDataOps[Self <: UserData] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
  }
  
}

