package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NfsMountOptions extends js.Object {
  
  /**
    * The specific NFS version that you want DataSync to use to mount your NFS share. If the server refuses to use the version specified, the sync will fail. If you don't specify a version, DataSync defaults to AUTOMATIC. That is, DataSync automatically selects a version based on negotiation with the NFS server. You can specify the following NFS versions:     NFSv3  - stateless protocol version that allows for asynchronous writes on the server.     NFSv4.0  - stateful, firewall-friendly protocol version that supports delegations and pseudo filesystems.     NFSv4.1  - stateful protocol version that supports sessions, directory delegations, and parallel data processing. Version 4.1 also includes all features available in version 4.0.  
    */
  var Version: js.UndefOr[NfsVersion] = js.native
}
object NfsMountOptions {
  
  @scala.inline
  def apply(): NfsMountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NfsMountOptions]
  }
  
  @scala.inline
  implicit class NfsMountOptionsOps[Self <: NfsMountOptions] (val x: Self) extends AnyVal {
    
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
    def setVersion(value: NfsVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
