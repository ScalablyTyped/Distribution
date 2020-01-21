package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreationInfo extends js.Object {
  /**
    * Specifies the POSIX group ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
    */
  var OwnerGid: typings.awsSdk.efsMod.OwnerGid = js.native
  /**
    * Specifies the POSIX user ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
    */
  var OwnerUid: typings.awsSdk.efsMod.OwnerUid = js.native
  /**
    * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
    */
  var Permissions: typings.awsSdk.efsMod.Permissions = js.native
}

object CreationInfo {
  @scala.inline
  def apply(OwnerGid: OwnerGid, OwnerUid: OwnerUid, Permissions: Permissions): CreationInfo = {
    val __obj = js.Dynamic.literal(OwnerGid = OwnerGid.asInstanceOf[js.Any], OwnerUid = OwnerUid.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreationInfo]
  }
}

