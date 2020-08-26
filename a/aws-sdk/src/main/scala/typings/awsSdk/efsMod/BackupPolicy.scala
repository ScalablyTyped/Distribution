package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupPolicy extends js.Object {
  /**
    * Describes the status of the file system's backup policy.     ENABLED - EFS is automatically backing up the file system.      ENABLING - EFS is turning on automatic backups for the file system.      DISABLED - automatic back ups are turned off for the file system.      DISABLED - EFS is turning off automatic backups for the file system.   
    */
  var Status: typings.awsSdk.efsMod.Status = js.native
}

object BackupPolicy {
  @scala.inline
  def apply(Status: Status): BackupPolicy = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupPolicy]
  }
  @scala.inline
  implicit class BackupPolicyOps[Self <: BackupPolicy] (val x: Self) extends AnyVal {
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
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

