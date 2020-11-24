package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class CreationInfoOps[Self <: CreationInfo] (val x: Self) extends AnyVal {
    
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
    def setOwnerGid(value: OwnerGid): Self = this.set("OwnerGid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUid(value: OwnerUid): Self = this.set("OwnerUid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: Permissions): Self = this.set("Permissions", value.asInstanceOf[js.Any])
  }
}
