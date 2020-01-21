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
  def apply(Gid: Gid, Uid: Uid, SecondaryGids: SecondaryGids = null): PosixUser = {
    val __obj = js.Dynamic.literal(Gid = Gid.asInstanceOf[js.Any], Uid = Uid.asInstanceOf[js.Any])
    if (SecondaryGids != null) __obj.updateDynamic("SecondaryGids")(SecondaryGids.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosixUser]
  }
}

