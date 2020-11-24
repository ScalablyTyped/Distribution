package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLocationFsxWindowsRequest extends js.Object {
  
  /**
    * The name of the Windows domain that the FSx for Windows server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the FSx for Windows file system.
    */
  var FsxFilesystemArn: typings.awsSdk.datasyncMod.FsxFilesystemArn = js.native
  
  /**
    * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  var Password: SmbPassword = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList = js.native
  
  /**
    * A subdirectory in the location’s path. This subdirectory in the Amazon FSx for Windows file system is used to read data from the Amazon FSx for Windows source location or write data to the FSx for Windows destination.
    */
  var Subdirectory: js.UndefOr[FsxWindowsSubdirectory] = js.native
  
  /**
    * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for your location.
    */
  var Tags: js.UndefOr[InputTagList] = js.native
  
  /**
    * The user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  var User: SmbUser = js.native
}
object CreateLocationFsxWindowsRequest {
  
  @scala.inline
  def apply(
    FsxFilesystemArn: FsxFilesystemArn,
    Password: SmbPassword,
    SecurityGroupArns: Ec2SecurityGroupArnList,
    User: SmbUser
  ): CreateLocationFsxWindowsRequest = {
    val __obj = js.Dynamic.literal(FsxFilesystemArn = FsxFilesystemArn.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], SecurityGroupArns = SecurityGroupArns.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationFsxWindowsRequest]
  }
  
  @scala.inline
  implicit class CreateLocationFsxWindowsRequestOps[Self <: CreateLocationFsxWindowsRequest] (val x: Self) extends AnyVal {
    
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
    def setFsxFilesystemArn(value: FsxFilesystemArn): Self = this.set("FsxFilesystemArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: SmbPassword): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = this.set("SecurityGroupArns", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = this.set("SecurityGroupArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: SmbUser): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: SmbDomain): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    
    @scala.inline
    def setSubdirectory(value: FsxWindowsSubdirectory): Self = this.set("Subdirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubdirectory: Self = this.set("Subdirectory", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagListEntry*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: InputTagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
