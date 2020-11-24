package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccessPointRequest extends js.Object {
  
  /**
    * A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
    */
  var ClientToken: typings.awsSdk.efsMod.ClientToken = js.native
  
  /**
    * The ID of the EFS file system that the access point provides access to.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  
  /**
    * The operating system user and group applied to all file system requests made using the access point.
    */
  var PosixUser: js.UndefOr[typings.awsSdk.efsMod.PosixUser] = js.native
  
  /**
    * Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory of your file system to NFS clients using the access point. The clients using the access point can only access the root directory and below. If the RootDirectory &gt; Path specified does not exist, EFS creates it and applies the CreationInfo settings when a client connects to an access point. When specifying a RootDirectory, you need to provide the Path, and the CreationInfo is optional.
    */
  var RootDirectory: js.UndefOr[typings.awsSdk.efsMod.RootDirectory] = js.native
  
  /**
    * Creates tags associated with the access point. Each tag is a key-value pair.
    */
  var Tags: js.UndefOr[typings.awsSdk.efsMod.Tags] = js.native
}
object CreateAccessPointRequest {
  
  @scala.inline
  def apply(ClientToken: ClientToken, FileSystemId: FileSystemId): CreateAccessPointRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPointRequest]
  }
  
  @scala.inline
  implicit class CreateAccessPointRequestOps[Self <: CreateAccessPointRequest] (val x: Self) extends AnyVal {
    
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
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosixUser(value: PosixUser): Self = this.set("PosixUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosixUser: Self = this.set("PosixUser", js.undefined)
    
    @scala.inline
    def setRootDirectory(value: RootDirectory): Self = this.set("RootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDirectory: Self = this.set("RootDirectory", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
