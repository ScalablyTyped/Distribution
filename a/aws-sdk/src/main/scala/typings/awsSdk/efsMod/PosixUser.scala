package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PosixUser extends js.Object {
  /**
    * The POSIX group ID used for all file system operations using this access point.
    */
  var Gid: typings.awsSdk.efsMod.Gid = js.native
  /**
    * Secondary POSIX group IDs used for all file system operations using this access point.
    */
  var SecondaryGids: js.UndefOr[typings.awsSdk.efsMod.SecondaryGids] = js.native
  /**
    * The POSIX user ID used for all file system operations using this access point.
    */
  var Uid: typings.awsSdk.efsMod.Uid = js.native
}

object PosixUser {
  @scala.inline
  def apply(Gid: Gid, Uid: Uid): PosixUser = {
    val __obj = js.Dynamic.literal(Gid = Gid.asInstanceOf[js.Any], Uid = Uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosixUser]
  }
  @scala.inline
  implicit class PosixUserOps[Self <: PosixUser] (val x: Self) extends AnyVal {
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
    def setGid(value: Gid): Self = this.set("Gid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: Uid): Self = this.set("Uid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondaryGidsVarargs(value: Gid*): Self = this.set("SecondaryGids", js.Array(value :_*))
    @scala.inline
    def setSecondaryGids(value: SecondaryGids): Self = this.set("SecondaryGids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryGids: Self = this.set("SecondaryGids", js.undefined)
  }
  
}

