package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tmpfs extends StObject {
  
  /**
    * The absolute file path where the tmpfs volume is to be mounted.
    */
  var containerPath: String = js.native
  
  /**
    * The list of tmpfs volume mount options. Valid values: "defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol" 
    */
  var mountOptions: js.UndefOr[StringList] = js.native
  
  /**
    * The maximum size (in MiB) of the tmpfs volume.
    */
  var size: Integer = js.native
}
object Tmpfs {
  
  @scala.inline
  def apply(containerPath: String, size: Integer): Tmpfs = {
    val __obj = js.Dynamic.literal(containerPath = containerPath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tmpfs]
  }
  
  @scala.inline
  implicit class TmpfsMutableBuilder[Self <: Tmpfs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerPath(value: String): Self = StObject.set(x, "containerPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountOptions(value: StringList): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountOptionsUndefined: Self = StObject.set(x, "mountOptions", js.undefined)
    
    @scala.inline
    def setMountOptionsVarargs(value: String*): Self = StObject.set(x, "mountOptions", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
