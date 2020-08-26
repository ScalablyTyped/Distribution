package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tmpfs extends js.Object {
  /**
    * The absolute file path where the tmpfs volume is to be mounted.
    */
  var containerPath: String = js.native
  /**
    * The list of tmpfs volume mount options. Valid values: "defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol" 
    */
  var mountOptions: js.UndefOr[StringList] = js.native
  /**
    * The size (in MiB) of the tmpfs volume.
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
  implicit class TmpfsOps[Self <: Tmpfs] (val x: Self) extends AnyVal {
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
    def setContainerPath(value: String): Self = this.set("containerPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Integer): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setMountOptionsVarargs(value: String*): Self = this.set("mountOptions", js.Array(value :_*))
    @scala.inline
    def setMountOptions(value: StringList): Self = this.set("mountOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountOptions: Self = this.set("mountOptions", js.undefined)
  }
  
}

