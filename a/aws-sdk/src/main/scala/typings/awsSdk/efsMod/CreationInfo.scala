package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreationInfo extends StObject {
  
  /**
    * Specifies the POSIX group ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
    */
  var OwnerGid: typings.awsSdk.efsMod.OwnerGid
  
  /**
    * Specifies the POSIX user ID to apply to the RootDirectory. Accepts values from 0 to 2^32 (4294967295).
    */
  var OwnerUid: typings.awsSdk.efsMod.OwnerUid
  
  /**
    * Specifies the POSIX permissions to apply to the RootDirectory, in the format of an octal number representing the file's mode bits.
    */
  var Permissions: typings.awsSdk.efsMod.Permissions
}
object CreationInfo {
  
  @scala.inline
  def apply(OwnerGid: OwnerGid, OwnerUid: OwnerUid, Permissions: Permissions): CreationInfo = {
    val __obj = js.Dynamic.literal(OwnerGid = OwnerGid.asInstanceOf[js.Any], OwnerUid = OwnerUid.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationInfo]
  }
  
  @scala.inline
  implicit class CreationInfoMutableBuilder[Self <: CreationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnerGid(value: OwnerGid): Self = StObject.set(x, "OwnerGid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUid(value: OwnerUid): Self = StObject.set(x, "OwnerUid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: Permissions): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
  }
}
