package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessPointDescription extends js.Object {
  
  /**
    * The unique Amazon Resource Name (ARN) associated with the access point.
    */
  var AccessPointArn: js.UndefOr[typings.awsSdk.efsMod.AccessPointArn] = js.native
  
  /**
    * The ID of the access point, assigned by Amazon EFS.
    */
  var AccessPointId: js.UndefOr[typings.awsSdk.efsMod.AccessPointId] = js.native
  
  /**
    * The opaque string specified in the request to ensure idempotent creation.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.efsMod.ClientToken] = js.native
  
  /**
    * The ID of the EFS file system that the access point applies to.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.efsMod.FileSystemId] = js.native
  
  /**
    * Identifies the lifecycle phase of the access point.
    */
  var LifeCycleState: js.UndefOr[typings.awsSdk.efsMod.LifeCycleState] = js.native
  
  /**
    * The name of the access point. This is the value of the Name tag.
    */
  var Name: js.UndefOr[typings.awsSdk.efsMod.Name] = js.native
  
  /**
    * Identified the AWS account that owns the access point resource.
    */
  var OwnerId: js.UndefOr[AwsAccountId] = js.native
  
  /**
    * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point that is used for all file operations by NFS clients using the access point.
    */
  var PosixUser: js.UndefOr[typings.awsSdk.efsMod.PosixUser] = js.native
  
  /**
    * The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS clients using the access point.
    */
  var RootDirectory: js.UndefOr[typings.awsSdk.efsMod.RootDirectory] = js.native
  
  /**
    * The tags associated with the access point, presented as an array of Tag objects.
    */
  var Tags: js.UndefOr[typings.awsSdk.efsMod.Tags] = js.native
}
object AccessPointDescription {
  
  @scala.inline
  def apply(): AccessPointDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPointDescription]
  }
  
  @scala.inline
  implicit class AccessPointDescriptionOps[Self <: AccessPointDescription] (val x: Self) extends AnyVal {
    
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
    def setAccessPointArn(value: AccessPointArn): Self = this.set("AccessPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPointArn: Self = this.set("AccessPointArn", js.undefined)
    
    @scala.inline
    def setAccessPointId(value: AccessPointId): Self = this.set("AccessPointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPointId: Self = this.set("AccessPointId", js.undefined)
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemId: Self = this.set("FileSystemId", js.undefined)
    
    @scala.inline
    def setLifeCycleState(value: LifeCycleState): Self = this.set("LifeCycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifeCycleState: Self = this.set("LifeCycleState", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOwnerId(value: AwsAccountId): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
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
