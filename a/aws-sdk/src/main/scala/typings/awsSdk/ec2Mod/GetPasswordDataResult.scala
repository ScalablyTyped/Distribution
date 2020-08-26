package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPasswordDataResult extends js.Object {
  /**
    * The ID of the Windows instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The password of the instance. Returns an empty string if the password is not available.
    */
  var PasswordData: js.UndefOr[String] = js.native
  /**
    * The time the data was last updated.
    */
  var Timestamp: js.UndefOr[DateTime] = js.native
}

object GetPasswordDataResult {
  @scala.inline
  def apply(): GetPasswordDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPasswordDataResult]
  }
  @scala.inline
  implicit class GetPasswordDataResultOps[Self <: GetPasswordDataResult] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setPasswordData(value: String): Self = this.set("PasswordData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordData: Self = this.set("PasswordData", js.undefined)
    @scala.inline
    def setTimestamp(value: DateTime): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("Timestamp", js.undefined)
  }
  
}

