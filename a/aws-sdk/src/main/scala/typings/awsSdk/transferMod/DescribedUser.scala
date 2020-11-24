package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribedUser extends js.Object {
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) for the user that was requested to be described.
    */
  var Arn: typings.awsSdk.transferMod.Arn = js.native
  
  /**
    * Specifies the landing directory (or folder), which is the location that files are written to or read from in an Amazon S3 bucket, for the described user. An example is  your-Amazon-S3-bucket-name&gt;/home/username .
    */
  var HomeDirectory: js.UndefOr[typings.awsSdk.transferMod.HomeDirectory] = js.native
  
  /**
    * Specifies the logical directory mappings that specify what Amazon S3 paths and keys should be visible to your user and how you want to make them visible. You will need to specify the "Entry" and "Target" pair, where Entry shows how the path is made visible and Target is the actual Amazon S3 path. If you only specify a target, it will be displayed as is. You will need to also make sure that your AWS Identity and Access Management (IAM) role provides access to paths in Target. In most cases, you can use this value instead of the scope-down policy to lock your user down to the designated home directory ("chroot"). To do this, you can set Entry to '/' and set Target to the HomeDirectory parameter value.
    */
  var HomeDirectoryMappings: js.UndefOr[typings.awsSdk.transferMod.HomeDirectoryMappings] = js.native
  
  /**
    * Specifies the type of landing directory (folder) you mapped for your users to see when they log into the file transfer protocol-enabled server. If you set it to PATH, the user will see the absolute Amazon S3 bucket paths as is in their file transfer protocol clients. If you set it LOGICAL, you will need to provide mappings in the HomeDirectoryMappings for how you want to make Amazon S3 paths visible to your users.
    */
  var HomeDirectoryType: js.UndefOr[typings.awsSdk.transferMod.HomeDirectoryType] = js.native
  
  /**
    * Specifies the name of the policy in use for the described user.
    */
  var Policy: js.UndefOr[typings.awsSdk.transferMod.Policy] = js.native
  
  /**
    * Specifies the IAM role that controls your users' access to your Amazon S3 bucket. The policies attached to this role will determine the level of access you want to provide your users when transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows a server to access your resources when servicing your users' transfer requests.
    */
  var Role: js.UndefOr[typings.awsSdk.transferMod.Role] = js.native
  
  /**
    * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
    */
  var SshPublicKeys: js.UndefOr[typings.awsSdk.transferMod.SshPublicKeys] = js.native
  
  /**
    * Specifies the key-value pairs for the user requested. Tag can be used to search for and group users for a variety of purposes.
    */
  var Tags: js.UndefOr[typings.awsSdk.transferMod.Tags] = js.native
  
  /**
    * Specifies the name of the user that was requested to be described. User names are used for authentication purposes. This is the string that will be used by your user when they log in to your server.
    */
  var UserName: js.UndefOr[typings.awsSdk.transferMod.UserName] = js.native
}
object DescribedUser {
  
  @scala.inline
  def apply(Arn: Arn): DescribedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedUser]
  }
  
  @scala.inline
  implicit class DescribedUserOps[Self <: DescribedUser] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDirectory(value: HomeDirectory): Self = this.set("HomeDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeDirectory: Self = this.set("HomeDirectory", js.undefined)
    
    @scala.inline
    def setHomeDirectoryMappingsVarargs(value: HomeDirectoryMapEntry*): Self = this.set("HomeDirectoryMappings", js.Array(value :_*))
    
    @scala.inline
    def setHomeDirectoryMappings(value: HomeDirectoryMappings): Self = this.set("HomeDirectoryMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeDirectoryMappings: Self = this.set("HomeDirectoryMappings", js.undefined)
    
    @scala.inline
    def setHomeDirectoryType(value: HomeDirectoryType): Self = this.set("HomeDirectoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeDirectoryType: Self = this.set("HomeDirectoryType", js.undefined)
    
    @scala.inline
    def setPolicy(value: Policy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
    
    @scala.inline
    def setRole(value: Role): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    
    @scala.inline
    def setSshPublicKeysVarargs(value: SshPublicKey*): Self = this.set("SshPublicKeys", js.Array(value :_*))
    
    @scala.inline
    def setSshPublicKeys(value: SshPublicKeys): Self = this.set("SshPublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshPublicKeys: Self = this.set("SshPublicKeys", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setUserName(value: UserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
}
