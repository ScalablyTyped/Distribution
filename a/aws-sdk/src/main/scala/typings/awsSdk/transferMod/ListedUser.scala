package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListedUser extends js.Object {
  /**
    * Provides the unique Amazon Resource Name (ARN) for the user that you want to learn about.
    */
  var Arn: typings.awsSdk.transferMod.Arn = js.native
  /**
    * Specifies the location that files are written to or read from an Amazon S3 bucket for the user you specify by their ARN.
    */
  var HomeDirectory: js.UndefOr[typings.awsSdk.transferMod.HomeDirectory] = js.native
  /**
    * Specifies the type of landing directory (folder) you mapped for your users' home directory. If you set it to PATH, the user will see the absolute Amazon S3 bucket paths as is in their file transfer protocol clients. If you set it LOGICAL, you will need to provide mappings in the HomeDirectoryMappings for how you want to make Amazon S3 paths visible to your users.
    */
  var HomeDirectoryType: js.UndefOr[typings.awsSdk.transferMod.HomeDirectoryType] = js.native
  /**
    * Specifies the role that is in use by this user. A role is an AWS Identity and Access Management (IAM) entity that, in this case, allows a file transfer protocol-enabled server to act on a user's behalf. It allows the server to inherit the trust relationship that enables that user to perform file operations to their Amazon S3 bucket.
    */
  var Role: js.UndefOr[typings.awsSdk.transferMod.Role] = js.native
  /**
    * Specifies the number of SSH public keys stored for the user you specified.
    */
  var SshPublicKeyCount: js.UndefOr[typings.awsSdk.transferMod.SshPublicKeyCount] = js.native
  /**
    * Specifies the name of the user whose ARN was specified. User names are used for authentication purposes.
    */
  var UserName: js.UndefOr[typings.awsSdk.transferMod.UserName] = js.native
}

object ListedUser {
  @scala.inline
  def apply(Arn: Arn): ListedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListedUser]
  }
  @scala.inline
  implicit class ListedUserOps[Self <: ListedUser] (val x: Self) extends AnyVal {
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
    def setHomeDirectoryType(value: HomeDirectoryType): Self = this.set("HomeDirectoryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeDirectoryType: Self = this.set("HomeDirectoryType", js.undefined)
    @scala.inline
    def setRole(value: Role): Self = this.set("Role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("Role", js.undefined)
    @scala.inline
    def setSshPublicKeyCount(value: SshPublicKeyCount): Self = this.set("SshPublicKeyCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshPublicKeyCount: Self = this.set("SshPublicKeyCount", js.undefined)
    @scala.inline
    def setUserName(value: UserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
  
}

